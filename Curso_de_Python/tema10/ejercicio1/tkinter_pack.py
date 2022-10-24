import tkinter as tk
from tkinter import ttk, messagebox


BACKGROUND = '#EEE'
FOREGROUND = 'darkred'

# En esta lista, agregar los items que se desee que aparezcan
# para ser seleccionados como Radiobuttons. Se generarán y
# posicionarán automáticamente, no obstante, se deberá gestionar
# el código si se desea que los accesos por teclado (root.bind)
# funcionen correctamente, así como la letra subrayada y las
# funciones asociadas a los eventos.
sistemas = [
    'GNU-Linux',
    'MacOS',
    'Windows',
    'FreeBSD',
    'Otro'
]


def mostrar(event=None):
    if sos.get().strip() == '':
        messagebox.showinfo(message=f'¡NO has seleccionado nada!',
                            title='S.O. Seleccionado'
                            )
    elif sos.get() == 'GNU-Linux':
        messagebox.showinfo(message=f'Has seleccionado {sos.get()}\n'
                                    '¡Excelente elección!', title='¡GRANDIOSO!'
                            )
    else:
        messagebox.showinfo(message=f'Has seleccionado {sos.get()}',
                            title='S.O. Seleccionado'
                            )
    

def limpiar(event=None):
    sos.set('')


def salir(event=None):
    exit(0)


def linux(event):
    sos.set('GNU-Linux')


def mac(event):
    sos.set('MacOS')
    

def win(event):
    sos.set('Windows')


def bsd(event):
    sos.set('FreeBSD')


def otro(event):
    sos.set('Otro')


# Main #
root = tk.Tk()
# Dimensiones y posición de la ventanta principal (root)
ancho = 300
alto = 400
posx = int((root.winfo_screenwidth() - ancho) / 2)
posy = int((root.winfo_screenheight() - alto) / 2)
# Configuración general de la ventana principal (root)
root.geometry(f'{ancho}x{alto}+{posx}+{posy}')
root.configure(bg=BACKGROUND)
root.minsize(width=250, height=320)
root.title('Sistemas Operativos')

# Tema y colores para los objetos ttk
style = ttk.Style()
style.theme_use('clam')
style.configure('TButton', background='#EDD', foreground=FOREGROUND)
style.configure('TRadiobutton', background=BACKGROUND, foreground=FOREGROUND)
style.configure('TFrame', background=BACKGROUND)
style.configure('TLabel', background=BACKGROUND,foreground=FOREGROUND)

# Etiquetas (sin frame)
enunciado = ttk.Label(root, text='Selecciona el S.O. que más te gusta')
enunciado.pack(pady=(10,5))

# Contenedor para los Radiobuttons
contenedor_rbs = ttk.Frame(root)
contenedor_rbs.pack(pady=(0, 10), fill='y', expand=True)

# Contenedor para los Buttons
contenedor_btns = ttk.Frame(root)
contenedor_btns.pack(fill='x', side='bottom')

# Comentar/descomentar la lista rbs y rbs.append (al final del for) según se
# necesite tener acceso a los objetos Radiobuttons creados en el bucle.
#
# Nota: también se podría usar un diccionario si se necesita tener una referencia
#       a partir del nombre.

# Radiobuttons
rbs = []
sos = tk.StringVar()
for so in sistemas:
    rb = ttk.Radiobutton(contenedor_rbs, text=so, underline=0, value=so, variable=sos)
    rb.pack(fill='both', expand=True)
    rbs.append(rb)

rbs[sistemas.index('FreeBSD')].configure(underline=4)
root.bind('g', linux)
root.bind('m', mac)
root.bind('w', win)
root.bind('b', bsd)
root.bind('G', linux)
root.bind('M', mac)
root.bind('W', win)
root.bind('B', bsd)
root.bind('o', otro)
root.bind('O', otro)

# Botones
mostrar_btn = ttk.Button(contenedor_btns, text='Mostrar Selección', underline=16, command=mostrar)
mostrar_btn.pack(ipady=20, padx=3, fill='x', expand=True, side='top')
root.bind('n', mostrar)
root.bind('N', mostrar)

limpiar_btn = ttk.Button(contenedor_btns, text='Limpiar\nSelección', underline=0, command=limpiar)
limpiar_btn.pack(padx=3, pady=3, fill='both', expand=True, side='left')
root.bind('l', limpiar)
root.bind('L', limpiar)

salir_btn = ttk.Button(contenedor_btns, text='Salir', underline=0, command=salir)
salir_btn.pack(ipady=20, padx=(0, 3), pady=3, fill='x', expand=True, side='right')
root.bind('s', salir)
root.bind('S', salir)

root.mainloop()































