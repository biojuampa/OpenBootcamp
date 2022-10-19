#!/usr/bin/env python3
# -*- coding: utf-8 -*-


# Creo, abro, escribo en archivo.txt y lo cierro
fhand = open('archivo.txt', 'w')
fhand.write('Primera línea (primera apertura)\n')
fhand.close()

# Abro, escribo (anexando) en archivo.txt y lo cierro
fhand = open('archivo.txt', 'a')
fhand.write('Segunda línea (segunda apertura)\n')
fhand.close()
