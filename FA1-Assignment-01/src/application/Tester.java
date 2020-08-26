package application;

import java.util.HashMap;
//import java.util.HashSet;

public class Tester {
	public static void main(String[] args) {
		// Code here
		
		String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
		HashMap<String, Integer> m = new HashMap<String,Integer>();
		m.put("round-neck", 200);
		m.put("collared", 250);
		m.put("hooded", 300);
//		HashSet n = new HashSet();
//		n.addAll(Arrays.asList(new Double[] {1.0,0.9,0.8}));
		int count = 0;
		double total = 0;
		
		for(String str : cart) {
			total += (int)m.get(str);
			count++;
		}
		
		if(count<5) {
			total *= 1;
		}
		else if(count <= 10) {
			total *= 0.9;
		}
		else {
			total *= 0.8;
		}
		
		System.out.println("Final price is Rs. " + total);
		
	}
}
