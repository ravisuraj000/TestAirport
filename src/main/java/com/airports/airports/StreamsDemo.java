package com.airports.airports;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {


    public static void main(String[] args) {
        List<String> airports = new ArrayList<String>();
        for (int i =0; i<10; i ++){
            airports.add("Airport"+i);
        }
           airports.add("Airport"+1);
           airports.add("Airport"+2);
        System.out.println(airports);
        List appendedNamesToAirport = airports.stream().map(a->a+1).collect(Collectors.toList());
        System.out.println(appendedNamesToAirport);

        List filterAirports = airports.stream().filter(a->a.contains("1")).collect(Collectors.toList());
        System.out.println(filterAirports);
        System.out.println(airports.stream().collect(Collectors.joining("|")));
        airports.forEach(e->System.out.println(e));

        System.out.println(airports.stream().collect(Collectors.toList()));

    }
}
