package com.java.newfeatures.collections.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodCollections {

    public static void main(String[] args) {

        // list
        List<Integer> fibonacciSequence = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
        System.out.println(fibonacciSequence);

        // set
        Set<String> bestPlayersOf22 = Set.of("Mohamed Salah", "Karim Benzema", "Kevin de Bruyne");
        System.out.println(bestPlayersOf22);

        // map
        Map<String, String> statesOfBrazil = Map.ofEntries(
                Map.entry("MG", "Minas Gerais"),
                Map.entry("SP", "São Paulo"),
                Map.entry("DF", "Distrito Federal")
        );
        System.out.println(statesOfBrazil);

    }

}
