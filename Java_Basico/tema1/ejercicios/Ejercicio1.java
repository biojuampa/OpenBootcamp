package com.company;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        // Numéricos enteros (primitivos)
        byte n0 = 1;        // 1 byte
        short n1 = 128;     // 2 bytes
        int n2 = 32555;     // 4 bytes
        long n3 = 23324121; // 8 bytes

        System.out.println("Tipos de datos numéricos (primitivos):"); 
        System.out.println("--------------------------------------"); 
        System.out.println("\n  * Enteros:\n"); 
        System.out.print("      byte [1B]: " + n0); 
        System.out.print("      short [2B]: " + n1); 
        System.out.print("      int [4B]: " + n2); 
        System.out.print("      long [8B]: " + n3); 
        
        // Numéricos reales de punto flotante (primitivos)
        float f0 = 12.12f;      // Simple precisión
        double f1 = 25.25d;     // Doble precisión

        System.out.println("\n\n  * Reales de punto flotante (primitivos):\n"); 
        System.out.print("      float [4B]: " + f0); 
        System.out.print("      double [8B]: " + f1); 

        // Booleano (true and false)
        boolean binario = true;

        System.out.println("\n\nTipo de dato booleano (primitivo):"); 
        System.out.println("----------------------------------"); 
        System.out.print("\n      boolean [1b]: " + binario); 

        // Caracteres
        char c = 'A';
        String str = "Soy una cadena de texto :)"; 

        System.out.println("\n\nTipos de datos de caracter:"); 
        System.out.println("---------------------------"); 
        System.out.println("\n  * Primitivo:"); 
        System.out.println("\n      char [2B]: " + c); 
        System.out.println("\n  * Referencial (clase java):\n"); 
        System.out.println("      String [oo]: " + str + "\n\n");

    }
}
