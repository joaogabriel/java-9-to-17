package com.joaotech.java9to17.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

    public static void main(String[] args) {

        // list
        List<String> planeBrandsList = List.of("Boeing", "Airbus", "Embraer");
        List<String> unmodifiableList = planeBrandsList.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList);

        // set
        Set<String> planeBrandsSet = Set.of("Boeing", "Airbus", "Embraer");
        Set<String> unmodifiableSet = planeBrandsSet.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableSet);

        // map
        Map<String, String> planeBrandsMap = planeBrandsSet.stream().collect(Collectors.toUnmodifiableMap(brand -> brand, String::toUpperCase));
        System.out.println(planeBrandsMap);

    }

}
