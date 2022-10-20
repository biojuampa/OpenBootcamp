#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import random
from functools import reduce


# Obtengo 200 números aleatorios entre 0 y 9999
numeros = random.choices(range(10000), k=200)


impares = list(filter(lambda x: x%2, numeros))
suma = reduce(lambda a,b: a+b, impares)
print(f'Se obtuvieron {len(impares)} números impares,\n'
      f'y su suma es {suma}\n'
      )
