package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.Product;

public class FlightMain {

	public static void main(String[] args) {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(200, "Delta", "Boeing", 234.69, 3.9f, false));
		flightList.add(new Flight(10, "Delta", "Airbus", 434.0, 4.3f, true));
		flightList.add(new Flight(110, "Delta", "Boeing", 93.29, 1.3f, false));
		flightList.add(new Flight(239, "Delta", "Boeing", 234.69, 1.3f, false));
		flightList.add(new Flight(500, "Delta", "Airbus", 939.0, 4.3f, true));
		flightList.add(new Flight(400, "Delta", "Airbus", 434.0, 3.9f, true));
		flightList.add(new Flight(130, "Delta", "Boeing", 234.69, 4.3f, true));
		flightList.add(new Flight(600, "Delta", "Airbus", 939.0, 4.3f, false));
		
		System.out.println("\n\nPrinting all the flights");
		printFlights(flightList);
		
		Collections.sort(flightList, new FlightAvailabilityComparator());
		System.out.println("\n\nPrinting all the flights sorted by availability");
		printFlights(flightList);
		
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			Double d1 = f1.getCost();
			Double d2 = f2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the flights sorted by cost(low to high)");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			int x = 0;
			Float ff1 = f1.getRatings();
			Float ff2 = f2.getRatings();
			x = ff2.compareTo(ff1);
			if (x == 0) {
				Double d1 = f1.getCost();
				Double d2 = f2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the products sorted by ratings(high to low) and if 2 or more products have same rating then by cost(low to high)");
		printFlights(flightList);
	}
	
	
	public static void printFlights(List<Flight> flightList) {
		for (Flight f : flightList) {
			System.out.println(f);
		}
	}

}
