package org.single;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int miles = 0;

		String city1 = "";
		String city2 = "";
		ArrayList<City> citylist = new ArrayList<City>();
		HashMap<String, City> citymap = new HashMap<String, City>();
     
		
		name = sc.next();

		while (name.equals("###") != true) {
			citylist.add(new City(name));
			name = sc.next();
		}

		for (int i = 0; i < citylist.size(); i++) {
			City temp = citylist.get(i);
			for (int j = 0; j < citylist.size(); j++) {
				miles = sc.nextInt();
				temp.putMiles(citylist.get(j).getName(), miles);

			}
		}

		for (City c : citylist) {
			citymap.put(c.getName(), c);
		}

		city1 = sc.next();
		city2 = sc.next();
		City mycity = citymap.get(city1);
          
		System.out.println(mycity.getMiles(city2));
		sc.close();
	}

}

class City {
	private String name = "";
	private HashMap<String, Integer> milemap = new HashMap<String, Integer>();

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiles(String city) {
		int miles = 0;
		miles = this.milemap.get(city);
		return miles;
	}

	public void putMiles(String city, int miles) {
		this.milemap.put(city, miles);
	}

	public String toString() {
		return name;
	}
}
