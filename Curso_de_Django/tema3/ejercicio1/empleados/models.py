from django.db import models
# Instalar django-countries con 'pip install django-countries' y
# posteriormente agregar la app a 'INSTALLED_APPS += "django_countries"'
# en el archivo settings.py del proyecto.
from django_countries.fields import CountryField


class Poblacion(models.Model):
    pais = CountryField()
    
    def __str__(self):
        return self.pais.name


class Fabrica(models.Model):
    nombre = models.CharField(max_length=100, default='Multinacional')
    direccion = models.CharField(max_length=100)
    cp = models.CharField(max_length=10, default='CPA2005RZA')
    poblacion = models.ForeignKey(Poblacion, on_delete=models.CASCADE)
    
    def __str__(self):
        return self.nombre    


class Salario(models.Model):
    bruto_anual = models.IntegerField()
    paga_extra = models.BooleanField(default=True)

    def __str__(self):
        return str(self.bruto_anual)


class Puesto(models.Model):
    cargo = models.CharField(max_length=50, default='empleado')
    descripcion = models.TextField(max_length=500, blank=True)
    salario = models.ForeignKey(Salario, on_delete=models.CASCADE)
    
    def __str__(self):
        return self.cargo

    
class Empleado(models.Model):
    nombres = models.CharField(max_length=100, default='Juan Pablo')
    apellido = models.CharField(max_length=100, default='Camussi')
    dni = models.IntegerField()
    email = models.EmailField(max_length=40)
    direccion = models.CharField(max_length=100)
    puesto = models.ForeignKey(Puesto, on_delete=models.CASCADE)
    fabrica = models.ForeignKey(Fabrica, on_delete=models.CASCADE)

    def __str__(self):
        return f'{self.apellido}, {self.nombres}'
