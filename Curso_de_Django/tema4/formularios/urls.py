from django.contrib import admin
from django.urls import path
from . import views


urlpatterns = [
    path("admin/", admin.site.urls),
    path("getform/", views.getform, name="getform"),
    path("getgoal/", views.getgoal, name="getgoal"),
    path("postform/", views.postform, name="postform"),
    path("postgoal/", views.postgoal, name="postgoal"),
    path("formsform/", views.formsform, name="formsform"),
    path("formsgoal/", views.formsgoal, name="formsgoal"),
]

