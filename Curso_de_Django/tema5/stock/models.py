from django.db import models
from datetime import date


class Product(models.Model):
    name = models.CharField(verbose_name='Nombre', max_length=50, blank=False, null=False)
    short_description = models.CharField(verbose_name='Resumen', max_length=100, blank=False, null=False)
    long_description = models.TextField(verbose_name='Descripción', max_length=500, blank=True)
    stock = models.IntegerField(verbose_name='Cantidad', default=0)
    discount_until = models.DateField(default=date.today)
    
    def __str__(self):
        return self.name

