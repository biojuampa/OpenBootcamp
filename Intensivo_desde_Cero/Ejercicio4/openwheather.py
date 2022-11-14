#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
  openweather.py

"""


import urllib.request
import json


city_name = input('Dime una ciudad: ').strip().lower().replace(' ', '%20')


API_KEY = 'c46e4eae44f551cc12b58f9d9423f232'
URL = f'https://api.openweathermap.org/data/2.5/weather?q={city_name}&appid={API_KEY}'


with urllib.request.urlopen(URL) as data:
    info = json.loads(data.read())

main = info['main']
max_temp = round(main['temp_max'] - 273.15, 1)
min_temp = round(main['temp_min'] - 273.15, 1)

print()
print(f'    Ciudad: {info["name"]}')
print(f'    Temperatura máxima: {max_temp}°C')
print(f'    Temperatura mínima: {min_temp}°C')
print()
