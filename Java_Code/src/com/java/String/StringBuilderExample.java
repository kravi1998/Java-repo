package com.java.String;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		buffer.append("world");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder);
		builder.append(" World");
		System.out.println(builder); 
				
		
	}

}
