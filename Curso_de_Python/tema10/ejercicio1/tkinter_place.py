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
enunciado = ttk.Label(root, text='Selecciona el S.O. que más te gusta', anchor='center')
enunciado.place(x=0, y=0, relwidth=1, relheight=0.1)

# Contenedor para los Radiobuttons
contenedor_rbs = ttk.Frame(root)
contenedor_rbs.place(x=0, rely=0.1, relwidth=1, relheight=0.6)

# Contenedor para los Buttons
contenedor_btns = ttk.Frame(root)
contenedor_btns.place(x=0, rely=0.7, relwidth=1, relheight=0.3)

# Comentar/descomentar la lista rbs y rbs.append (al final del for) según se
# necesite tener acceso (o no) a los objetos Radiobuttons creados en el bucle.
#
# Nota: también se podría usar un diccionario si se necesita tener una referencia
#       a partir del nombre.

# Radiobuttons
rbs = []
sos = tk.StringVar()
for so in sistemas:
    relheight = 1 / len(sistemas)
    rely = sistemas.index(so) * relheight
    
    rb = ttk.Radiobutton(contenedor_rbs, text=so, underline=0, value=so, variable=sos)
    rb.place(relx=0.5, rely=rely, width=100, relheight=relheight, anchor='n')
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
mostrar_btn.place(relx=0.02, rely=0, relwidth=0.96, relheight=0.45)
root.bind('n', mostrar)
root.bind('N', mostrar)

limpiar_btn = ttk.Button(contenedor_btns, text='Limpiar\nSelección', underline=0, command=limpiar)
limpiar_btn.place(relx=0.02, rely=0.5, relwidth=0.47, relheight=0.45)
root.bind('l', limpiar)
root.bind('L', limpiar)

salir_btn = ttk.Button(contenedor_btns, text='Salir', underline=0, command=salir)
salir_btn.place(relx=0.51, rely=0.5, relwidth=0.47, relheight=0.45)
root.bind('s', salir)
root.bind('S', salir)

root.mainloop()































