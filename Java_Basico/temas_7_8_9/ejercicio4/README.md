### Pregunta:

Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

### Respuesta:

El problema es que sobrecargaría innecesariamente al sistema, ya que se realizarían 7 redimensiones del array subyacente a la clase _Vector_, lo que recaería en la necesidad del hacer 7 copias del vector, que además sería con cada copia más grande, por lo tanto, la sobrecarga aumenta en cada ciclo.

#### Nota:

Hice un pequeño programita para comprobarlo ;)
