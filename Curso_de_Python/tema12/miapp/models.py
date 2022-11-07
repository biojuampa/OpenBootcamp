from django.db import models


class Phrase(models.Model):
    name = models.CharField(max_length=64, help_text='Nombre del director')
          #models.ForeignKey(Director, null=True, on_delete=models.SET_NULL)
    famous_phrase = models.TextField(max_length=500)

    def __str__(self):
        return f'Frase de {self.name}'


class Movie(models.Model):
    title = models.CharField(max_length=128, help_text='Título de la película')
    synopsis = models.TextField(help_text='Resumen de la película')

    def __str__(self):
        return self.title


class Director(models.Model):
    name = models.CharField(max_length=64, help_text='Nombre del director')
    birth = models.DateField(help_text='Fecha de nacimiento')
    dead = models.DateField(null=True, blank=True, help_text='Fecha de deceso')
    phrase = models.ForeignKey(Phrase, null=True, blank=True,
                               on_delete=models.SET_NULL,
                               help_text='Frase famosa'
                               )
    movies = models.ManyToManyField(Movie, blank=True, help_text='Películas dirigidas')

    def __str__(self):
        return self.name

