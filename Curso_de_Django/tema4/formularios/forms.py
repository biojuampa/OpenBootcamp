from django import forms


class ContactForm(forms.Form):
    name = forms.CharField(label='Nombre', max_length=100,
                           help_text='Máximo 100 caracteres',
                           widget=forms.TextInput(attrs={'placeholder': 'Tu nombre ...'})
                           )
    message = forms.CharField(label='Comentario',
                              widget=forms.Textarea(attrs={'placeholder': 'Escribe algo ...'})
                              )
    email = forms.EmailField(widget=forms.EmailInput(attrs={'placeholder': 'Tu email ...'}))

