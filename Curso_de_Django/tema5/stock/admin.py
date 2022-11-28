from django.contrib import admin
from .models import Product


class ProductAdmin(admin.ModelAdmin):
    list_display = ('name', 'short_description', 'stock',)
    search_fields = ('name', 'short_description', 'long_description')
    list_filter = ('name', 'stock')
    date_hierarchy = 'discount_until'


admin.site.register(Product, ProductAdmin)
