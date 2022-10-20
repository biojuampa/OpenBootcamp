#!/usr/bin/env python3
# -*- coding: utf-8 -*-


paises = set()


entrada = input('Por favor, ingresa los países separados por comas: ').split(',')
for pais in entrada:
    if pais.strip() == '': continue
    paises.add(pais.strip().capitalize())

print()
paises = list(paises)
for pais in sorted(paises[:-1]):
    print(pais, end=', ')
print(paises[-1], '\n')

