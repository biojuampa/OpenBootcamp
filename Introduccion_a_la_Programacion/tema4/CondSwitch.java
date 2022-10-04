/*
 * CondSwitch.java
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


public class CondSwitch {
	
	public static void main (String[] args) {
        var estacion = "primavera";

        switch (estacion.toUpperCase()) {
            case "VERANO":
                System.out.println("La estación es verano");
                break;
            case "OTOÑO":
                System.out.println("La estación es otoño");
                break;
            case "INVIERNO":
                System.out.println("La estación es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("[" + estacion + "] no es una estación válida.");
                System.out.println("Usa: VERANO OTOÑO INVIERNO PRIMAVERA");
        }
	}
}

