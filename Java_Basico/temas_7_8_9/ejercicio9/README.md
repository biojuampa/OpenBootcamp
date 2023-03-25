# Curso Java Básico

## Ejercicio 9 - temas 7, 8 y 9

__Enunciado:__ Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

__Resolución:__ El programa lee datos de un juego ficticio en un [archivo JSON](https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json) que provee la fundación mozilla, extrae algunos datos de interés y posteriormente tiene la posibilidad de guardarlos en ficheros JSON, CSV y/o MarkDown. También se pueden mostrar los datos extraídos por pantalla.  

También puede leer los datos de un archivo JSON local. Existe la posibilidad de cargar los datos con el constructor, o bien posteriormente usando los métodos _readFromURL()_ y/o _readFromFile()_.  

La clase que se encarga de gestionar los datos (GameData), a su vez los carga en memoria, lo que permitiría en un futuro manipularlos según se desee.  

__Nota:__ para gestionar los datos de los archivos JSON utilizo el [paquete JSON](https://central.sonatype.com/artifact/org.json/json/20230227)
