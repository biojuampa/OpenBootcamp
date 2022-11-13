#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
  primes.py - Intensivo desde Cero (ejercicio 3)

"""


import pprint


def primes_numbers(nmax):
    '''Calcula los números primos entre 2 y nmax


    Parameters
    ----------
    nmax : integer
        Límite máximo para el cálculos de los números primos.

    Returns
    -------
    primes : list
        Colección de los números primos encontrados.

    '''

    numbers = list(range(2, nmax+1))

    primes = []
    for num in numbers:
        is_prime = True
        for div in range(2, num):
            if not num % div:
                is_prime = False
                break
        if is_prime:
            primes.append(num)

    return primes


pp = pprint.PrettyPrinter(compact=1, width=60, indent=10)
pp.pprint(primes_numbers(1000))
