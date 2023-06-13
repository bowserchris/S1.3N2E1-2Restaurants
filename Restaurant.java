package n2e1;

public class Restaurant implements Comparable<Restaurant> {
	
	private String name;
	private int rating;
	
	public Restaurant(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//mi equals incorrecto
	/*public boolean equals(Restaurant restaurant) {
		return name.equalsIgnoreCase(restaurant.getName()) && rating == restaurant.getRating();
	}*/
	
	public String toString() {
		return "Restaurant name: " + name + ". Rating: " + rating;
	}
	
	//el equals correcto con el hashcode para utilizar y verificar con no son dos objetos del mismo tipo
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		// object must be Test at this point
		Restaurant rest = (Restaurant)obj;
		return rating == rest.rating && (name == rest.name || (name != null && name.equals(rest.name)));
	}
	
	public int hashCode(){
		int hash = 7;
		hash = 31 * hash + rating;
		hash = 31 * hash + (null == name ? 0 : name.hashCode());
		return hash;
	}
	
	///creando propio compareto method para el treeset
	public int compareTo(Restaurant r) {
		if (name.equals(r.name)) {
			return r.rating - rating;
		}
		return name.compareTo(r.name);
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