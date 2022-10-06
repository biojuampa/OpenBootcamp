/*
 * HerenciaVersion1.java
 * 
 * Copyright 2022 Juan Pablo Camussi <jcamussi@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


/*
 * Version 1
 *
 * Implementación de las clases con atributos públicos,
 * para gestionarlos accedo a ellos de forma directa
 * desde la instancia.
 * 
 */


public class HerenciaVersion1 {
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 25;
        cliente.nombre = "Juan Perez";
        cliente.telefono = 555123321;
        cliente.credito = (float)12344.45;

        trabajador.edad = 45;
        trabajador.nombre = "Juan Pablo Camussi";
        trabajador.telefono = 161803398;
        trabajador.salario = (float)1.45;

        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad + " años");
        System.out.println("Teléfono del cliente: " + cliente.telefono);
        System.out.println("Crédito del cliente: $" + cliente.credito);
        
        System.out.println();

        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad del trabajador: " + trabajador.edad + " años");
        System.out.println("Teléfono del trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: $" + trabajador.salario);
	}
}


class Persona {
    public int edad;
    public String nombre;
    public int telefono;
}


class Cliente extends Persona {
    public float credito; 
}


class Trabajador extends Persona {
    public float salario;
}
