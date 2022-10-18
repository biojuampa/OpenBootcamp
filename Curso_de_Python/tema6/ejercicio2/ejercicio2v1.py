#!/usr/bin/env python3
# -*- coding: utf-8 -*-

#
# Version 1 (inicializo los atributos en el constructor)
#

class Alumno:
    _nombre = ""
    _nota = ""
    
    def __init__(self, nombre, nota):
        self._nombre = nombre
        self._nota = nota
    
    def obtener_nombre(self):
        return self._nombre
    
    def obtener_nota(self):
        return self._nota
    

# Main
alumno1 = Alumno("Juan Pablo Camussi", 9.5)
nota = float(alumno1.obtener_nota())
print('El alumno', alumno1.obtener_nombre(), end=', ')
if nota > 7:
    print('ha aprobado con', nota)
else:
    print('ha desaprobado con', nota)
