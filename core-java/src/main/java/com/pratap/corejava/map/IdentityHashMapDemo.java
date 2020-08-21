package com.pratap.corejava.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new IdentityHashMap<>();
		
		Integer id1 = Integer.valueOf(10);
		Integer id2 = Integer.valueOf(10);
		
		map.put(id1, "Pratap");
		map.put(id2, "Narayan");
		
		System.out.println(map);
		
	}

}
