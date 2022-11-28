from django.shortcuts import render
from django.http import HttpResponse
from .forms import ContactForm


# --- Método GET --- #
def getform(request):
    return render(request, 'getform.html', {})


def getgoal(request):
    if request.method != 'GET':
        return HttpResponse(f'Método {request.method} no soportado')
    
    name = request.GET['name']
    comment = request.GET['message']
    email = request.GET['email']
    return render(request, 'success.html', {'name': name,
                                            'comment': comment,
                                            'email': email
                                            }
                  )


# --- Método POST --- #
def postform(request):
    return render(request, 'postform.html', {})


def postgoal(request):
    if request.method != 'POST':
        return HttpResponse(f'Método {request.method} no soportado')
    
    name = request.POST['name']
    comment = request.POST['message']
    email = request.POST['email']
    return render(request, 'success.html', {'name': name,
                                            'comment': comment,
                                            'email': email
                                            }
                  )


# --- Clase forms de Dajngo --- #
def formsform(request):
    form = ContactForm()
    return render(request, 'formsform.html', {'form': form})

def formsgoal(request):
    if request.method != 'GET':
        return HttpResponse(f'Método {request.method} no soportado')
    
    name = request.GET['name']
    comment = request.GET['message']
    email = request.GET['email']
    return render(request, 'success.html', {'name': name,
                                            'comment': comment,
                                            'email': email
                                            }
                  )

