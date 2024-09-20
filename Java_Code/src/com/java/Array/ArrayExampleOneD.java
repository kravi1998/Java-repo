package com.java.Array;

public class ArrayExampleOneD {

	public static void main(String[] args) {
		//Declaring as integer Array
		
		int[] numbers ;
		//Initalizes an Array
		
		numbers = new int[5];
		
		for(int i=0; i<numbers.length ; i++)
		{
			numbers[i] = i+1;
		}
		
		for(int i=0 ; i<numbers.length ; i++)
		{
			System.out.println(numbers[i]);
		}

	}

}
