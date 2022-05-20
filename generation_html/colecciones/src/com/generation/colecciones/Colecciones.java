package com.generation.colecciones;

import java.util.*;

public class Colecciones {

    public static void main(String[] args) {

        //List - ArrayList - LinkedList - Vector - Stack - Queue
        List<String> miArray = new ArrayList<String>();
        miArray.add("Pedro");
        miArray.add("Juan");
        miArray.add("Maria");
        miArray.add("Yair");

        System.out.println(miArray);
        System.out.println(miArray.size());
        boolean elemento = miArray.remove("Yair");
        System.out.println(miArray);
        System.out.println(elemento);

        miArray.add(2, "Manuel");

        System.out.println(miArray);

        imprimir(miArray);

        /**
         * List<T> - ArrayList<T> - LinkedList<T> - Vector<T> - Stack<T> - Queue<T>
         * int = Integer
         * String = String
         * boolean = Boolean
         * double = Double
         * float = Float
         * char = Character
         * byte = Byte
         * long = Long
         * short = Short
         * T = Object
         * T[] = Object[]
         */
        List<Integer> miArray2 = new ArrayList<Integer>();
        miArray2.add(1);
        miArray2.add(2);
        miArray2.add(3);
        miArray2.add(4);
        miArray2.add(5);
        imprimir(miArray2);
        int num1 = 1;
        Integer num2 = 2;

        System.out.println();
        Set<String> miSet = new HashSet<String>();
        //No aceptar elementos duplicados
        //no los guarda en un orden especifico (no tiene orden)
        //Es una coleccion de elementos unicos y es más rápido que un array
        miSet.add("Pedro");
        miSet.add("Juan");
        miSet.add("Maria");
        miSet.add("Yair");
        miSet.add("Pedro");
        miSet.add("Lupe");
        miSet.add("Oscar");
        miSet.add("Ariana");
        miSet.add("Uriel");

        imprimir(miSet);

        System.out.println("\t Map ----- HashMap o Indice");
        Map<String, Integer> miMap = new HashMap<String, Integer>();

        miMap.put("Pedro", 1);
        miMap.put("Juan", 2);
        miMap.put("Maria", 3);
        System.out.println(miMap);
        System.out.println(miMap.values());
        System.out.println(miMap.keySet());
        System.out.println(miMap.get("Pedro"));
        for(String key: miMap.keySet()){
            System.out.println(key + ": " + miMap.get(key));
        }
    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
    }


}
