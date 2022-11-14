#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
  openweather.py

"""


import urllib.request
import json


city_name = input('Dime una ciudad: ').strip().lower().replace(' ', '%20')
coutry_code = input('Dime el código país (p.e. "es o esp" para España): ').strip().lower().replace(' ', '%20')


LANG = 'es'
API_KEY = 'c46e4eae44f551cc12b58f9d9423f232'
URL = f'https://api.openweathermap.org/data/2.5/weather?q={city_name},{coutry_code}&appid={API_KEY}&lang={LANG}'


with urllib.request.urlopen(URL) as data:
    info = json.loads(data.read())
    #print(info)

main = info['main']
temp = round(main['temp'] - 273.15, 1)
max_temp = round(main['temp_max'] - 273.15, 1)
min_temp = round(main['temp_min'] - 273.15, 1)
feels_like = round(main['feels_like'] - 273.15, 1)
pressure = main['pressure']
humidity = main['humidity']

print()
print(f'  Ciudad: {info["name"]}')
print()
print(f'    Temperatura:          {temp}°C')
print(f'    Temperatura máxima:   {max_temp}°C')
print(f'    Temperatura mínima:   {min_temp}°C')
print(f'    Sensación térmica:    {feels_like}°C')
print(f'    Presión atmosférica:  {pressure} hPa')
print(f'    Humedad relativa:     {humidity}%')
print()
