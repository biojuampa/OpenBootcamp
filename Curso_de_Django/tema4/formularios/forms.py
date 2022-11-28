from django import forms


class ContactForm(forms.Form):
    name = forms.CharField(label='Nombre', max_length=100, help_text='Máximo 100 caracteres')
    message = forms.CharField(label='Comentario')
    email = forms.EmailField()

