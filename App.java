package n2e1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class App {
	
	static HashSet<Restaurant> restaurants = new HashSet<>();

	public static void main(String[] args) {
		
		///////N2 Ejercicio 1///////
		
		Restaurant rest1 = new Restaurant("hope", 7);
		Restaurant rest2 = new Restaurant("hope", 7);
		
		System.out.println(rest1.equals(rest2));	//veo que son del mismo tipo y no se añade
		
		addRestaurant(rest1);	//solo se añade la primera vez
		addRestaurant(rest2);
		addRestaurant(new Restaurant("si us plau", 5));
		addRestaurant(new Restaurant("bulli", 9));
		addRestaurant(new Restaurant("bulli", 10));
		
		System.out.println("first set" + restaurants);
		
		///////N2 Ejercicio 1///////
		
		TreeSet<Restaurant> treeRest = new TreeSet<Restaurant>(restaurants);	//new comparator?
		
		//treeRest.addAll(restaurants);
		//LinkedList<Restaurant> list = new LinkedList<>(restaurants);
		
		System.out.println(treeRest);
		
	}
	
	public static HashSet<Restaurant> addRestaurant(Restaurant restaurant) {
		if (!restaurants.contains(restaurant)) {
			restaurants.add(restaurant);		
		}
		return restaurants;
	}

}

/*
 * 
 * Exercise 1

Create a class called Restaurant with two attributes: name(String) and score(int). 
Implement the necessary methods so that Restaurant objects with the same name and 
the same score cannot be entered in a HashSet created in the main() of the application.

important

There can be restaurants with the same name with different ratings, but there cannot 
be restaurants with the same name and the same rating.
- Exercise 2

Using the program class above, create the necessary implementation so that the objects
 of the Restaurant class are sorted by name and by score in ascending order.

Example:

name: restaurant1, score: 8

name: restaurant1, rating: 7
 * */
