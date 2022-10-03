/*
 * SumaNumeros.java
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


public class SumaNumeros {
	
	public static void main (String[] args) {
		
		int resultado;
		
		resultado = suma3(1, 2, 3);
		System.out.println(resultado);
		
	}

	
	public static int suma3 (int a, int b, int c) {
			
			return (a + b + c); // los paréntesis no son necesarios,
								// pero mejora la visual del código.			
	}

}
