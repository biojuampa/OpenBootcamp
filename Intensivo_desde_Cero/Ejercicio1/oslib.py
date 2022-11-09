#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  oslib.py - Intensivo desde Cero (ejercicio 1)
#  


import os


HOME = os.environ['HOME']
DOWN = f'{HOME}/Descargas'


def humanize(val, iB=True):
    value = val
    if iB:
        units = ['B', 'KiB', 'MiB', 'GiB', 'TiB', 'PiB']
        base = 1024
    else:
        units = ['B', 'KB', 'MB', 'GB', 'TB', 'PB']
        base = 1000
    
    iu = 0 # Index Units
    iu_max = len(units) - 1
    
    while  (value / base) >= 1:
        if iu >= iu_max:
            break
        else:
            iu += 1
        
        value = value / base
    
    return f'{round(value, 2)} {units[iu]}'


def show_files(directory):
    list_dir = os.listdir(directory)

    print(f'{directory}:')

    for file in list_dir:
        path_file = f'{directory}/{file}'
        if os.path.isfile(path_file) and not os.path.islink(path_file):
            size = os.path.getsize(path_file)
            print(f'  {file} -> {humanize(size)}')


# --- Main --- #
show_files(DOWN)
print('\n#', '-'*50, '#\n')
for root, dirs, files in os.walk(HOME):
    if not files:
        continue
    
    show_files(root)    
