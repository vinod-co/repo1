package com.brillio.training.exercises;

public class SumOfPrimes {

	
	public int calculateSumOfPrimes(int from, int to){
		
		if(from>to){
			int temp = from;
			from = to;
			to = temp;
		}
		
		if(from<0){
			from = 0;
		}
		
		
		int sum = 0;
		for(int num = from; num<=to; num++){
			if(isPrime(num)){
				sum += num;
			}
		}
		return sum;
	}

	private boolean isPrime(int num) {	
		if(num==1) return false;
		
		for(int i=2, limit = num/2; i<=limit; i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
}






