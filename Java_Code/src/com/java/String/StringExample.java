 package com.java.String;

public class StringExample {

	public static void main(String[] args) {
		//Declaring & intialization
		
		//string literal
		String str1 = "Hello";
		//string object
		String str2 = new String(" World");
		
		String str3 = str1+str2;
		System.out.println(str3);
		System.out.println("Length of String = "+str3.length());
		System.out.println("get index letter :"+str3.charAt(0));
		System.out.println("Contains : "+str3.contains("Hell"));
		System.out.println("Equals Method :"+str3.equals(str2));
		System.out.println("Upparcase :"+str3.toUpperCase());
		System.out.println("Split : "+str3.split(" "));
		

	}

}
