from django.shortcuts import render
from django.http import HttpResponse
from .forms import ProductForm


def index(request):
    if request.method != 'POST':
        form = ProductForm()
        return render(request, 'index.html', {'form': form})
    else:
        form = ProductForm(request.POST)
        if form.is_valid():
            form.save()
            form = ProductForm()
        return render(request, 'index.html', {'form': form})

