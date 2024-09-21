package com.java.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> linkedList = new LinkedList<String>();
       linkedList.add("Java");
       linkedList.add("Python");
       linkedList.add("JavaScript");
       linkedList.add("c++");
       
       System.out.println(linkedList);
       
       linkedList.add(2,"GoLang");
       linkedList.remove(0);
       linkedList.remove("JavaScript");
       
       System.out.println(linkedList);
       System.out.println("Size of the linkedList"+linkedList.size());
	}

}
