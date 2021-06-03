package com.airports.airports;

import com.airports.airport.AirportType;
import java.io.BufferedReader;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirportsDataDownloader {

    public static void main(String[] args) throws Exception {
        HttpRequest request = HttpRequest.newBuilder(new URI("https://ourairports.com/data/airports.csv"))
                .GET()
                .timeout(Duration.ofMinutes(1))
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        // buffered reader is to read the data line by line
        BufferedReader reader = new BufferedReader(new StringReader(response.body()));
        String line = "";
        List<String> airports = new ArrayList<String>();
        while((line = reader.readLine())!=null){
            airports.add(line.replace("\"", ""));
        }
        // here now you can make use of streams  // parallestream  // stream
        // filteration through using combination of lambda and stream api

        List<String> small_airports = airports
                .parallelStream()
                .filter(airport->airport.contains("small_airport"))
                .collect(Collectors.toList());

        List<String> large_airports = airports
                .stream()
                .filter(airport->airport.contains("large_airport"))
                .collect(Collectors.toList());

        List<String> medium_airports = airports
                .stream()
                .filter(airport->airport.contains("medium_airport"))
                .collect(Collectors.toList());

        //System.out.println(airports.stream().filter(airport->airport.contains("Mumbai")).collect(Collectors.toList()));

        System.out.println(large_airports.size());
        System.out.println(small_airports.size());
        System.out.println(medium_airports.size());

        //System.out.println(airports.stream().distinct().collect(Collectors.toList()));


    }
    public boolean isSmallAirport(String airport){
        return airport.contains(AirportType.SMALLAIRPORT.name());
    }

    public boolean isLargeAirport(String airport){
        return airport.contains(AirportType.SMALLAIRPORT.name());
    }
}
