from django.contrib import admin
from django.urls import path
from . import views


urlpatterns = [
    path("admin/", admin.site.urls),
    path("", views.index, name="index"),
    path("gallery/", views.gallery, name="gallery"),
    path("contact/", views.contact, name="contact"),
]
