package com.java.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Puja");
		list.add("Sonu");
		list.add("Dev");
		list.add("Kashyap");
		
		System.out.println("Size of Array List"+list.size());
		
		list.remove(0);
		
		for(String element : list) {
			System.out.println("name : "+element);
		}

	}

}
