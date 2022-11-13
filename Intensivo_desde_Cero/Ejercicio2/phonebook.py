#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  phonebook.py - Intensivo desde Cero (ejercicio 2)
#


import pickle
import sys
import os
from time import sleep


WORKDIR = f'{os.environ["HOME"]}/.phonebook'
BOOKS = f'{WORKDIR}/books'


phonebook = {}
phonebook_name = 'phonebook'


def load_phonebook(book_path):
    book_name = os.path.basename(book_path)

    print(f'Abriendo la agenda [{book_name}] ...')
    sleep(1)
    if not os.path.exists(f'{book_path}.bin'):
        print(f'La agenda [{book_name}] no existe!')
        sleep(2)
        return -1

    if not os.path.getsize(f'{book_path}.bin'):
        print(f'La agenda [{book_name}] está vacía')
        return {}

    try:
        with open(f'{book_path}.bin', 'rb') as fhand:
            book = pickle.load(fhand)
        return book
    except:
        print(f'ERROR: ¡La agenda [{book_name}] existe, pero no se pudo leer!')
        sleep(2)
        return -1


def create_phonebook(book_path):
    book_name = os.path.basename(book_path)

    print(f'Creando la agenda [{book_name}] ...')
    sleep(1)
    if os.path.exists(f'{book_path}.bin') and os.path.getsize(f'{book_path}.bin'):
        print(f'La agenda [{book_name}] existe y tiene datos. Por seguridad, no se creará\n'
              'una agenda nueva que sobreescriba otra existente conteniendo datos.\n'
              'Primero debe borrarla, bien desde el menú principal, o bien manualmente.\n'
              )
        input('Pulse enter para continuar ...')
        return -1

    try:
        fhand = open(f'{book_path}.bin', 'wb')
        fhand.close()
    except:
        print(f'ERROR: ¡No se pudo crear la agenda [{book_name}]!')
        sleep(2)
        return -1

    return {}


def delete_phonebook(book_path):
    book_name = os.path.basename(book_path)

    option = input(f'Está seguro que desea borrar permanentemente la agenda [{book_name}] [y/N]: ')
    if option.lower() == 'y':
        if not os.path.exists(f'{book_path}.bin'):
            print(f'La agenda [{book_name}] NO existe, compruebe el nombre.')
            sleep(2)
            return -1

    try:
        print(f'Borrando la agenda [{book_name}] ...')
        os.remove(f'{book_path}.bin')
        sleep(1)
        print(f'La agenda [{book_name}] fue borrada con éxito.')
        sleep(2)
    except:
        print(f'ERROR: ¡La agenda [{book_name}] existe, pero no se pudo borrar!')
        sleep(2)
        return -1


def save_phonebook(book_path, pbook):
    book_name = os.path.basename(book_path)

    try:
        print(f'Guardando la agenda [{book_name}] ...')
        with open(f'{book_path}.bin', 'wb') as fhand:
            pickle.dump(pbook, fhand)
        sleep(1)
    except:
        print(f'ERROR: ¡La agenda [{book_name}] no se pudo guardar!')
        sleep(2)
        return -1


def phonebook_change(book_path, pbook):
    book_name = os.path.basename(book_path)

    try:
        if os.path.getsize(f'{book_path}.bin'):
            with open(f'{book_path}.bin', 'rb') as fhand:
                saved_pbook = pickle.load(fhand)
        else:
            saved_pbook = {}
            
        if saved_pbook == pbook:
            return False
        else:
            return True
    except:
        print(f'ERROR: ¡Hubo un error comprobando la agenda [{book_name}]!')
        sleep(2)
        return -1


def show_contacts(contact, pbook):
    match = False
    for name, phones in pbook.items():
        if name.startswith(contact):
            match = True
            print(f'\n  * {name}:')
            for i in range(len(phones)):
                print(f'      - Tel. {i+1}: {phones[i]}')

    if not match:
        print('No hubo coincidencias.')
        sleep(1)

    input('\nPersione enter para continuar ...')


def add_contact(first, last, numbers, pbook):
    name = f'{last}, {first}'
    pbook[name] = numbers


def show_all_contacts(pbook):
    for name, phones in pbook.items():
        print(f'\n  * {name}:')
        for i in range(len(phones)):
            print(f'      - Tel. {i+1}: {phones[i]}')

    input('\nPersione enter para continuar ...')


def add_phone(contact, phone, pbook):
    if contact in pbook:
        pbook[contact].append(phone)
    else:
        print(f'ERROR: El nombre de contacto \'{contact}\' es incorrecto!')
        sleep(2)


def delete_phone(contact, pbook):
    if contact not in pbook:
        print(f'ERROR: El nombre de contacto \'{contact}\' es incorrecto!')
        sleep(2)
        return -1

    if pbook[contact]:
        phones = pbook[contact]
        for i in range(len(phones)):
            print(f'[{i+1}] {phones[i]}')

        try:
            option = int(input('\nDime qué teléfono deseas borrar: '))
            if option < 1:
                raise
            print(f'Borrando {phones[option-1]} de \'{contact}\' ...')
            del phones[option-1]
            sleep(2)
        except:
            print('\nERROR: Opción incorrecta')
            sleep(2)
            return -1

    else:
        print(f'\n\'{contact}\' no tiene ningún teléfono asociado.')
        sleep(2)


def delete_contact(contact, pbook):
    if contact in pbook:
        del pbook[contact]
    else:
        print(f'\'{contact}\' No existe.')
        return -1


def secondary_menu():
    global phonebook           # No es necesario, pero creo que brinda claridad.
    while True:
        os.system('clear')
        print(f'  AGENDA TELEFÓNICA: [{phonebook_name}]')
        print('')
        print('    [1] Mostrar contacto')
        print('    [2] Agregar contacto')
        print('    [3] Ver todos los contactos')
        print('    [4] Agregar teléfono a un contacto')
        print('    [5] Borrar teléfono de un contacto')
        print('    [6] Borrar contacto')
        print('    [7] Guardar contactos')
        print('    [8] Menú principal')
        print('')

        option = input('Elige una opción: ')

# ------------------------------- Show contact ------------------------------- #
        if option == '1':
            contact = input('Escribe el nombre o parte del contacto: ')
            if not contact:
                continue
            show_contacts(contact.strip(), phonebook)

# ------------------------------- Add contact -------------------------------- #
        elif option == '2':
            first_name = input('Nombre/s del contacto: ').strip()
            last_name = input('Apellido del contacto: ').strip()
            phones = list()
            while True:
                phone = input(f'Teléfono de {last_name}, {first_name}'
                                ' (enter para terminar): '
                                )
                if not phone:
                    break
                phones.append(phone.strip())

            add_contact(first_name, last_name, phones, phonebook)

# ------------------------------- All contacts ------------------------------- #
        elif option == '3':
            show_all_contacts(phonebook)

# ------------------------------- Add phone ---------------------------------- #
        elif option == '4':
            contact = input('Nombre completo del contacto: ').strip()
            phone = input(f'Teléfono para agregar a \'{contact}\': ').strip()
            if phone:
                add_phone(contact, phone, phonebook)

# ------------------------------- Delete phone ------------------------------- #
        elif option == '5':
            contact = input('Nombre completo del contacto: ').strip()
            delete_phone(contact, phonebook)

# ------------------------------- Delete contact ----------------------------- #
        elif option == '6':
            contact = input('Nombre completo del contacto a borrar: ')
            print(f'Borrando el contacto \'{contact}\' de la agenda [{phonebook_name}] ...')
            delete_contact(contact, phonebook)
            sleep(2)

# ------------------------------- Save agenda -------------------------------- #
        elif option == '7':
            save_phonebook(f'{BOOKS}/{phonebook_name}', phonebook)

# --------------------------- Back to main menu ------------------------------ #
        elif option == '8':
            if phonebook_change(f'{BOOKS}/{phonebook_name}', phonebook):
                print('Hay cambios sin guardar en su agenda')
                save = input('Desea guardarlos antes de salir [Y/n]: ')
                while True:
                    if save.lower() == 'y' or save == '':
                        save_phonebook(f'{BOOKS}/{phonebook_name}', phonebook)
                        break
                    elif save.lower() == 'n':
                        break
            main_menu()

# --------------------------------- Others ----------------------------------- #
        else:
            pass


def main_menu():
    global phonebook
    global phonebook_name
    while True:
        os.system('clear')
        print()
        print('Welcome to the BEST PHONE BOOK in the entire WORLD :-p')
        print()
        print('    [1] Abrir agenda existente')
        print('    [2] Crear agenda nueva')
        print('    [3] Borrar agenda existente')
        print('    [4] Listar agendas creadas')
        print('    [5] Salir')
        print()

        option = input('Elige una opción: ')

# ------------------------------- Abrir agenda ------------------------------- #
        if option == '1':
            last_pb_name = phonebook_name
            book_name = input(f'Nombre de la agenda [{phonebook_name}]: ')
            if book_name:
                phonebook_name = book_name

            pb = load_phonebook(f'{BOOKS}/{phonebook_name}')
            if pb == -1:
                phonebook_name = last_pb_name
                continue

            phonebook = pb
            secondary_menu()

# ------------------------------- Crear agenda ------------------------------- #
        elif option == '2':
            last_pb_name = phonebook_name
            book_name = input(f'Nombre de la agenda [{phonebook_name}]: ')
            if book_name:
                phonebook_name = book_name

            pb = create_phonebook(f'{BOOKS}/{phonebook_name}')
            if pb == -1:
                phonebook_name = last_pb_name
                continue

            phonebook = pb
            secondary_menu()

# ------------------------------- Borrar agenda ------------------------------ #
        elif option == '3':
            last_pb_name = phonebook_name
            book_name = input(f'Nombre de la agenda [{phonebook_name}]: ')
            if book_name:
                phonebook_name = book_name

            pb = delete_phonebook(f'{BOOKS}/{phonebook_name}')
            if pb == -1:
                phonebook_name = last_pb_name
                continue

# ------------------------------- Listar agenda ------------------------------ #
        elif option == '4':
            print('\n  Agendas disponibles:')
            books = os.listdir(BOOKS)
            for book in books:
                if book.endswith('.bin'):
                    print('    -', book.split('.')[0])
            input('\nPulsa enter para continuar ...')

# ------------------------------- Salir -------------------------------------- #
        elif option == '5':
            print('\nSee you soon ...\n')
            sys.exit()

# --------------------------------- Others ----------------------------------- #
        else:
            pass


# ------------------------------- Main --------------------------------------- #
if __name__ == '__main__':
    if not os.path.exists(WORKDIR):
        try:
            os.mkdir(WORKDIR)
            os.mkdir(BOOKS)
            print('Creando directorio de trabajo ...')
            sleep(1)
        except:
            print('ERROR: No es posible crear el directorio de trabajo')
            print('       Aún podrá trabajar con la agenda, pero no podrá')
            print('       guardar los cambios realizados.\n')
            input('Presione enter para seguir ...')

    if not os.path.exists(BOOKS):
        try:
            os.mkdir(BOOKS)
        except :
            print('ERROR: No es posible crear el directorio de trabajo')
            print('       Aún podrá trabajar con la agenda, pero no podrá')
            print('       guardar los cambios realizados.\n')
            input('Presione enter para seguir ...')

    main_menu()
