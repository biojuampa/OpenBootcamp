from django.urls import path
from . import views


urlpatterns = [
    path('', views.directors_list, name='indexview'),
    path('director/<str:dname>/', views.directors_list, name='directorview'),
    path('director/<str:dname>/movie/<str:mtitle>/', views.directors_list, name='movieview'),
    path('director/<str:dname>/phrase/<str:phrase>/', views.directors_list, name='phraseview'),
]
