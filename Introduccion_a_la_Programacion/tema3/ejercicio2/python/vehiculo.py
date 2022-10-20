#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  vehiculo.py
#  
#  Copyright 2022 Juan Pablo Camussi <juampa@neo.com>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
#  
#  


class coche:
    _puertas = 0

    def agregar_puerta(self):
        self._puertas += 1

    def n_puertas(self):
        return self._puertas


# Main
mi_coche = coche()  			# Creo la instancia

mi_coche.agregar_puerta()
print(mi_coche.n_puertas())

