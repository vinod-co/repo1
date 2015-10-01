package com.brillio.training.exercises;

public class SumOfPrimesTest {
	
	public static void main(String[] args) {
		int from=10, to=50, expected=311, actual;
		
		SumOfPrimes sop = new SumOfPrimes();
		actual = sop.calculateSumOfPrimes(from, to);
		
		System.out.println("Test passed ? " + (actual==expected));
	}

}
