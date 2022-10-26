import sqlite3


alumnos = {'Juan Pablo': 'Camussi',
           'Juan Carlos': 'Roldán',
           'María Ester': 'Funes',
           'Rosario': 'Ahumada',
           'Raúl Eduardo': 'Ojeda',
           'Juan Ramón': 'Sánchez',
           'Verónica Marisa': 'Sánchez',
           'Mario el Pájaro': 'Gómez',
           'Natalia': 'Gómez',
           'Liliana Beatriz': 'González',
           'Oslvaldo': 'González',
           'Daniel Alejandro': 'López',
           'María Luisa': 'López'
           }


conn = sqlite3.connect('instituto.db')
cur = conn.cursor()

cur.execute('''DROP TABLE IF EXISTS alumnos''')
cur.execute('''CREATE TABLE alumnos (id INTEGER PRIMARY KEY,
                                    nombre TEXT,
                                    apellido TEXT)
                                    ''')

for nombre, apellido in alumnos.items():
    cur.execute(f'''INSERT INTO alumnos (nombre, apellido)
                VALUES ('{nombre}', '{apellido}')
                ''')

conn.commit()

busqueda = cur.execute('''SELECT * FROM alumnos WHERE nombre == 'Rosario' ''')
print(busqueda.fetchall())

cur.close()
conn.close()
