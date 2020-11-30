package com.cursosdedesarrollo.ejemplos;

import scala.util.parsing.combinator.testing.Str;

import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        int i= Utiles.suma(1,2);

        List<String> listado = new ArrayList<String>();
        listado.add("Hola");
        listado.add("Mundo");
        // Colección mutable
        listado = Utiles.ordena(listado);
        // Colección Inmutable
        List<String> resultado = Utiles.ordena(listado);
        // operacion 1
        List<String> resultado2 = Utiles.ordena(resultado);
        // guardar en cache resultado2
        // operacion 2
        List<String> resultado3 = Utiles.ordena(resultado2);
        // operacion 3
        List<String> resultado4 = Utiles.ordena(resultado3);
        // operacion 4
        List<String> resultado5 = Utiles.ordena(resultado4);
        System.out.println(listado.size());

        String str = new String("Hola hola");
        System.out.println(str.toLowerCase());
        

    }
}
