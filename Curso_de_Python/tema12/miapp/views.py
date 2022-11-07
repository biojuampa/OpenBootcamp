from django.shortcuts import render
from .models import Director


def directors_list(request, dname=None, mtitle=None, phrase=None):
    dname = dname
    mtitle = mtitle
    phrase = phrase
    directors = Director.objects.order_by('name')

    return render(request, 'miapp/index.html', {'dname': dname,
                                                'mtitle': mtitle,
                                                'phrase': phrase,
                                                'directors': directors
                                                }
                  )

