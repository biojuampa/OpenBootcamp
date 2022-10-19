#!/usr/bin/env python3
# -*- coding: utf-8 -*-

#
# Módulo "operaciones2"
#   Defino las cuatro operaciones matemáticas básicas
#   pero a la suma y a la multiplicación las hago con
#   argumentos ilimitados.
#

def suma(*args):
    resultado = 0
    for n in args:
        resultado += n
    return resultado


def resta(a, b):
    return a - b


def divide(a, b):
    return a / b


def multiplica(*args):
    resultado = 1
    for n in args:
        resultado *= n
    return resultado
