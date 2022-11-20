from django.shortcuts import render
import os


def index(request):
    return render(request, 'index.html', {})


def gallery(request):
    photos = os.listdir("static/images/gallery")
    
    for photo in photos:
        i = photos.index(photo)
        photos[i] = photo.split('.')[0]

    return render(request, 'gallery.html', {'photos': photos})


def contact(request):
    return render(request, 'contact.html', {})
