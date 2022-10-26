import tkinter as tk
from tkinter import filedialog
import string


# Ancho y alto de la ventana principal (root)
ANCHO = 500
ALTO = 500
# foreground color (texto botones y etiquetas)
FG='purple'
ALTURA_BOTONES = 5


# Borra los items seleccionados de lista, de uno en uno
def borrar_item():
    items = lista.curselection()
    if items:
        lista.delete(items[0])


# Borra los items seleccionados de lista, todos juntos
def borrar_items():
    while lista.curselection():
        items = lista.curselection()
        lista.delete(items[0])


# Borra el campo de entrada manual
def borrar_entrada(event=None):
    item_entry.delete(0, tk.END)


# Borra el contenido de lista completamente
def borrar_lista():
    lista.delete(0, tk.END)


# Carga en lista las palabras contenidas en un archivo de texto (no quita signos)
def cargar_lista():
    items = []

    fhand = filedialog.askopenfile(mode='r',
                                   filetypes=[('archivos de texto', '*.txt'),
                                              ('todos los archivos', '*.*')
                                              ]
                                   )
    
    for line in fhand:
        # Quito los caracteres de puntuación
        words = line.translate(line.maketrans('', '', string.punctuation))
        words_list = words.split()
        for word in words_list:
            items.append(word)

    lista.insert(tk.END, *items)
    fhand.close()

    if borrar_duplicados.get():
        filtrar_duplicados()


# Guarda en un archivo de texto el contenido de lista
def guardar_lista():
    fhand = filedialog.asksaveasfile(mode='w',
                                     filetypes=[('archivos de texto', '*.txt'),
                                                ('todos los archivos', '*.*')
                                                ]
                                     )
    items = lista.get(0, tk.END)
    for item in items:
        fhand.write(item)
        fhand.write('\n')

    fhand.close()


# Inserta el contenido de 'entrada manual' en lista, arriba del item
# seleccionado si lo hay, o en su defecto al final de la lista.
def insertar_item(event=None):
    item = item_entry.get().strip()
    # Quito los caracteres de puntuación y espacios
    item = item.translate(str.maketrans('', '', string.punctuation))

    itemsel = lista.curselection()

    if not item:
        return

    if itemsel:
        lista.insert(itemsel, item)
    else:
        lista.insert(tk.END, item)
        lista.yview_moveto(1)

    if borrar_duplicados.get():
        filtrar_duplicados()


def filtrar_duplicados():
    items = set(lista.get(0, tk.END))
    lista.delete(0, tk.END)
    lista.insert(0, *items)

# ---------------------------------------------------------------------------- #

# Main #
main_window = tk.Tk()
# Dimensiones y posición de la ventanta principal
posx = int((main_window.winfo_screenwidth() - ANCHO) / 2)
posy = int((main_window.winfo_screenheight() - ALTO) / 2)
main_window.geometry(f'{ANCHO}x{ALTO}+{posx}+{posy}')
# Configuración general de la ventana principal (root)
main_window.minsize(width=500, height=500)
main_window.title('¡Gracias Open Bootcamp!') # ¡Gracias por devolverme la esperanza!

# ---------------------------------------------------------------------------- #

etiqueta = tk.Label(main_window,
                    text='Prueba con Listbox y Tkinter\nY algunas otras cositas ;)',
                    fg=FG,
                    justify='left'
                    )

etiqueta.pack(pady=(20, 0))

marco1 = tk.Frame(main_window, bg=FG)
marco1.pack(padx=50, pady=30, fill='both', side='left', expand=1)

marco2 = tk.Frame(marco1)
marco2.pack(fill='both', expand=1)

barra = tk.Scrollbar(marco2, orient=tk.VERTICAL, bg=FG)
barra.pack(side='right', fill='y')

lista = tk.Listbox(marco2,
                   bg='lightgray',
                   fg='blue',
                   selectmode=tk.EXTENDED,
                   selectbackground='lightgreen',
                   activestyle=tk.NONE,
                   highlightcolor='red',
                   highlightbackground=FG,
                   highlightthickness=1,
                   relief='flat',
                   yscrollcommand=barra.set
                   )

lista.pack(fill='both', expand=1)

barra.configure(command=lista.yview)

borrar_duplicados = tk.BooleanVar()
check_filtrar = tk.Checkbutton(marco1,
                               text='Eliminar items duplicados',
                               anchor='w',
                               fg=FG,
                               variable=borrar_duplicados,
                               command=filtrar_duplicados
                               )

check_filtrar.pack(pady=2, side='bottom', fill='x')

label = tk.Label(marco1, text='  Agregar item manualmente', anchor='w', fg=FG)
label.pack(ipady=5, side='bottom', fill='x')

item_entry = tk.Entry(marco1,
                      bg='lightgray',
                      fg='blue',
                      selectbackground='lightgreen',
                      relief='flat',
                      highlightcolor='red',
                      highlightbackground=FG,
                      highlightthickness=1
                      )

item_entry.pack(ipady=4, side='left', fill='x', expand=1)

boton_x = tk.Button(marco1, text='X', fg=FG, command=borrar_entrada)
boton_x.pack(side='right')

boton_mas = tk.Button(marco1, text='+', fg=FG, command=insertar_item)
boton_mas.pack(side='right')


# ---------------------------------------------------------------------------- #


marco_botones = tk.Frame(main_window, bg=FG)
marco_botones.pack(padx=(0, 50), pady=(0, 50), fill='x', side='right', expand=1)

boton_cargar = tk.Button(marco_botones,
                         text='Cargar Lista',
                         fg=FG,
                         command=cargar_lista
                         )
boton_cargar.pack(ipady=ALTURA_BOTONES, fill='x')

boton_guardar = tk.Button(marco_botones,
                          text='Guardar Lista',
                          fg=FG, command=guardar_lista
                          )
boton_guardar.pack(ipady=ALTURA_BOTONES, pady=(0, 20), fill='x')

boton_borrar_item = tk.Button(marco_botones,
                              text='Borrar Item',
                              fg=FG,
                              command=borrar_item
                              )
boton_borrar_item.pack(ipady=ALTURA_BOTONES, fill='x')

boton_borrar_items = tk.Button(marco_botones,
                               text='Borrar Items',
                               fg=FG,
                               command=borrar_items
                               )
boton_borrar_items.pack(ipady=ALTURA_BOTONES, fill='x')

# boton_insertar = tk.Button(marco_botones,
#                            text='Insertar Item',
#                            fg=FG,
#                            command=insertar_item
#                            )
# boton_insertar.pack(ipady=ALTURA_BOTONES, fill='x')

boton_borrar_lista = tk.Button(marco_botones,
                               text='Borrar lista',
                               fg=FG,
                               command=borrar_lista
                               )
boton_borrar_lista.pack(ipady=ALTURA_BOTONES, fill='x')

boton_salir = tk.Button(marco_botones,
                        text='Salir',
                        underline=0,
                        fg=FG,
                        command=main_window.destroy
                        )
boton_salir.pack(ipady=ALTURA_BOTONES, pady=(20, 0), fill='x')


main_window.bind('<Return>', insertar_item)
main_window.bind('<Delete>', borrar_entrada)
# main_window.bind('s', main_window.destroy)
# main_window.bind('S', main_window.destroy)

main_window.mainloop()
