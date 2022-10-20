#!/usr/bin/env python3
# -*- coding: utf-8 -*-


import pickle


class Vehiculo:
    _propietario = ''
    tipo = 'Sedán'           # p.e. Sedán
    ruedas = 4
    _color = 'Rojo'
    puertas = '4'
    _motor = 'Diesel'        # Nafta, gasoil o GNC
    cilindrada = ''          # en cm3
    velocidad = ''           # Velocidad máxima [km/h]
    _anio = 0                # Año de fabricación

    def __init__(self, propietario, anio):
        self._propietario = propietario
        self._anio = anio

    def cambiar_color(self, color):
        self._color = color

    def cambiar_motor(self, motor):
        self._motor = motor

    def datos_vehiculo(self):
        return {'propietario': self._propietario,
                'tipo': self.tipo,
                'ruedas': self.ruedas,
                'color': self._color,
                'puertas': self.puertas,
                'motor': self._motor,
                'cilindrada': self.cilindrada,
                'velocidad': self.velocidad,
                'anio': self._anio
                }


def ingresar_vehiculo(nombre, auto):
    # Personalizo un poco las instancias.
    # (esta función simula un método de
    # ingreso de datos por interfaz gráfica)

    if nombre == 'auto1':               # Cambios sólo para auto1
        auto.cambiar_color('Verde')
        auto.cambiar_motor('Nafta')
        auto.cilindrada = 2000
        auto.velocidad = 180

    if nombre == 'auto2':               # Cambios sólo para auto2
        auto.cilindrada = 1500
        auto.velocidad = 165


def guardar(nombre, obj):
    # Guardo los objetos
    fhand = open(nombre, 'wb')
    pickle.dump(obj, fhand)
    fhand.close()


def recuperar(nombre):
    fhand = open(nombre, 'rb')
    coche = pickle.load(fhand)
    fhand.close()

    return coche


def mostrar_datos(datos):
    print(f"Vehículo: {datos['tipo']} {datos['color']} {datos['puertas']} puertas\n"
          f"Propietario: {datos['propietario']}\n"
          f"Año: {datos['anio']}\n"
          )


# Main
coche = Vehiculo('Juan Perez', 1997)
ingresar_vehiculo('auto1', coche)
guardar('auto1.dat', coche)
del(coche)

coche = Vehiculo('Francisco García', 2000)
ingresar_vehiculo('auto2', coche)
guardar('auto2.dat', coche)
del(coche)


# Vuelvo a cargar los objetos y muestro algunos datos
coche = recuperar('auto1.dat')
mostrar_datos(coche.datos_vehiculo())
del(coche)

coche = recuperar('auto2.dat')
mostrar_datos(coche.datos_vehiculo())
del(coche)
