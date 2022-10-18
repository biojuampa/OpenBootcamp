#!/usr/bin/env python3
# -*- coding: utf-8 -*-

#
# Version 2 (inicializo los atributos con métodos específicos)
#

class Alumno:
    _nombre = ""
    _nota = ""
    
    def cargar_nombre(self, nombre):
        self._nombre = nombre
        
    def cargar_nota(self, nota):
        self._nota = nota
    
    def obtener_nombre(self):
        return self._nombre
    
    def obtener_nota(self):
        return self._nota
    

# Main
alumno1 = Alumno()

alumno1.cargar_nombre('Juan Perez')
alumno1.cargar_nota(7.44)

nota = float(alumno1.obtener_nota())
print('El alumno', alumno1.obtener_nombre(), end=', ')
if nota > 7:
    print('ha aprobado con', nota)
else:
    print('ha desaprobado con', nota)
