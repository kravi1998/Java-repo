package com.java.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		System.out.println("Vector Size"+vector.size());
		
		vector.add("Programming");
		vector.add("NetWorking");
		vector.add("DataBase");
		vector.add("Deployment");
		vector.add("Cloud Services");
		
		System.out.println(vector);
		
		System.out.println(vector.size());
		vector.remove(0);
		System.out.println(vector.size());
		vector.clear();
		System.out.println(vector.size());
    
	}

}
