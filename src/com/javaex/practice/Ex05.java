package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] intArray = {10,20,30,40,50,};
		
		double avg = 0;
		int num = 0;
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
			
			num = num+intArray[i];
			
			
			
		}
		avg = num/intArray.length;
		
		
		System.out.println("평균은 "+avg+ "입니다.");
		
		

	}

}
