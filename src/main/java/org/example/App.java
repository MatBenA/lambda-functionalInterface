package org.example;

import proyecto.lambda.interfaces.Transformador;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<String> misPalabras = new ArrayList<>();

        misPalabras.add("hola");
        misPalabras.add("como");
        misPalabras.add("estas");
        misPalabras.add("?");

        Transformador transformador = (ArrayList<String> listaPalabras) -> {
            ArrayList<String> resultList = new ArrayList<>();
            for (String palabra :listaPalabras) {
                resultList.add(palabra.toUpperCase());
            }
            return resultList;
        };

        System.out.println(misPalabras);
        System.out.println(transformador.stringToUpperCase(misPalabras));
    }
}
