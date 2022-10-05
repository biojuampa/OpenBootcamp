/*
 * Encapsulacion.java
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


public class Encapsulacion {
	
	public static void main (String[] args) {
        Persona persona = new Persona();

        persona.setEdad(45);
        persona.setNombre("Juan Pablo");
        persona.setTelefono(555347941);

        System.out.println(persona.getNombre() + " tiene " +
                         persona.getEdad() + " años, y su nro de teléfono es " +
                         persona.getTelefono());
	}
}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}
