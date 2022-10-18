#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class Vehiculo:
    color = "Rojo"
    ruedas = 4
    puertas = 2


class Coche(Vehiculo):
    velocidad = 230
    cilindrada = 2000


# Main
miCoche = Coche()
print("Mi coche es de color", miCoche.color)
print("Tiene", miCoche.puertas, "puertas y", miCoche.ruedas, "ruedas")
print("Alcanza una velocidad máxima de", miCoche.velocidad, "km/h con sus",
      miCoche.cilindrada, "cm3 de cilindrada.")
