#!/usr/bin/env python3
# -*- coding: utf-8 -*-


"""
Año Bisiesto:
============
    
    Un año es bisiesto si se cumplen las siguientes condiciones:
        
        - Es divisible por 4 y NO es divisible por 100
        - Si es divisible por 100, también debe serlo por 400

"""


def es_bisiesto(anio):
    div_por_4 = not anio % 4          # ¿Es divisible por 4?
    div_por_100 = not anio % 100      # ¿Es divisible por 100?
    div_por_400 = not anio % 400      # ¿Es divisible por 400?


    return div_por_4 and ( not div_por_100 or div_por_400 )


while True:
    anio = int(input('Dime un año: '))

    if anio <= 0:
        print('Debes ingresar un entero positivo')
        continue

    break
    
if es_bisiesto(anio):
    print('El año', anio, 'es bisiesto.')
else:
    print('El año', anio, 'NO es bisiesto.')
