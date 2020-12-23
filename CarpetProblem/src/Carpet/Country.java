package Carpet;

import java.util.*;

public class Country {
	
	private Map<String, Integer> map = new HashMap<String,Integer>();

	public Country() {
		map.put("India", 10);
		map.put("USA", 12);
		map.put("Canada", 13);
		map.put("Germany", 8);
		map.put("Australia", 14);
	}
	
	public int getCost(String country) {
		
		if(country.length()>0) {
			return map.get(country);
		}else {
			return 0;
		}
	}
	
}
