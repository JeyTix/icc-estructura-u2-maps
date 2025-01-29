package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {

    public Mapa(){
        System.out.println("\t----- HashMap -----");
        hashMap();
        System.out.println("\n\t----- LinkedHashMap -----");
        linkedHashMap();
        System.out.println("\n\t----- TreeMap -----");
        treeMap();
        System.out.println();
    }


    public void hashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("HashMap: " + mapa);

        // containsKey
        System.out.println("¿Hay Pera? > " + mapa.containsKey("Pera"));
        System.out.println("¿Hay Kiwi? > " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa después de eliminar Pera:\n " + mapa);
    }

    public void linkedHashMap() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("LinkedHashMap: " + mapa);

        // containsKey
        System.out.println("¿Hay Pera? > " + mapa.containsKey("Pera"));
        System.out.println("¿Hay Kiwi? > " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa después de eliminar Pera:\n " + mapa);
    }

    public void treeMap() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("TreeMap: " + mapa);

        // containsKey
        System.out.println("¿Hay Pera? > " + mapa.containsKey("Pera"));
        System.out.println("¿Hay Kiwi? > " + mapa.containsKey("Kiwi"));

        // Obtener valor
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("Mapa después de eliminar Pera:\n " + mapa);
    }
    // El treeMap termina siendo el diccionario de la vida real
    // Se  
}
