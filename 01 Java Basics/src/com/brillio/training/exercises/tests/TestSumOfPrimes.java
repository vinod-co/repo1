package com.brillio.training.exercises.tests;

import com.brillio.training.exercises.SumOfPrimes;

import org.junit.Assert;
import org.junit.Test;
public class TestSumOfPrimes {

	@Test
	public void UTC_01_01(){
		SumOfPrimes sop = new SumOfPrimes();
		int from=10, to=50, expected = 311;
		int actual = sop.calculateSumOfPrimes(from, to);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_01_02(){
		SumOfPrimes sop = new SumOfPrimes();
		int from=50, to=-100, expected = 328;
		int actual = sop.calculateSumOfPrimes(from, to);
		Assert.assertEquals(expected, actual);
	}
}
