package com.company;
import java.util.List;
import java.util.ArrayList;


public class Listas {
    public static void main(String[] args) {
         List<String> lista = new ArrayList<>();

         lista.add("Número 1");
         lista.add("Número 2");
         lista.add("Número 3");
         lista.add("Número 4");
         lista.add("Número 5");

         System.out.println(lista);

         for (String valor:lista)
            System.out.println(valor);
    }
}

