#!/usr/bin/env python3
# -*- coding: utf-8 -*-


paises = set()


entrada = input('Por favor, ingresa los países separados por comas: ').split(',')
for pais in entrada:
    paises.add(pais.strip().capitalize())

print()
for pais in sorted(paises):
    print(pais, end=', ')
print()
