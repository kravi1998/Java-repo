 package com.java.Array;

public class ArrayExampleTwoD {

	public static void main(String[] args) {
		//declaring and initializing 2D array
		int arr[][] = {	{1,5,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3 ; i++) {
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
