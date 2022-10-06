/*
 * HerenciaVersion2.java
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
 * Version 2
 *
 * Implementación de clases con atributos privados
 * y métodos GETTERS  y  SETTERS para gestionarlos.
 *
 */


public class HerenciaVersion2 {
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(25);
        cliente.setNombre("Juan Perez");
        cliente.setTelefono(555123321);
        cliente.setCredito((float)12344.45);

        trabajador.setEdad(45);
        trabajador.setNombre("Juan Pablo Camussi");
        trabajador.setTelefono(161803398);
        trabajador.setSalario((float)1.45);

        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad del cliente: " + cliente.getEdad() + " años");
        System.out.println("Teléfono del cliente: " + cliente.getTelefono());
        System.out.println("Crédito del cliente: $" + cliente.getCredito());
        
        System.out.println();

        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad del trabajador: " + trabajador.getEdad() + " años");
        System.out.println("Teléfono del trabajador: " + trabajador.getTelefono());
        System.out.println("Salario del trabajador: $" + trabajador.getSalario());
	}
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}


class Cliente extends Persona {
    private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}


class Trabajador extends Persona {
    private float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }
}
