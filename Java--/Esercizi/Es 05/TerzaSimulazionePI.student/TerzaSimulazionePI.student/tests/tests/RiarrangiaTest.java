package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.Riarrangia;

public class RiarrangiaTest {

	@Test
	public void test1() {
		
		int[] input = new int[] {1, 2, 3, -4, -1, -5};
		int[] output = new int[] {-4, 1, -1, 2, -5, 3};
		     											 
		Assert.assertArrayEquals(Riarrangia.riarrangia(input),output);
	}
	
	@Test
	public void test2() {
		
		int[] input = new int[] {1, 2, 3, -4, -1, 4};
		int[] output = new int[] {-4, 1, -1, 2, 3, 4};
		     											 
		Assert.assertArrayEquals(Riarrangia.riarrangia(input),output);
	}
	
	@Test
	public void test3() {
		
		int[] input = new int[] {-5, -2, 5, 2, -4, 7, -1, -8, 2, -8};
		int[] output = new int[] {-5, 5, -2, 2, -4, 7, -1, 2, -8, -8};
		     											 
		Assert.assertArrayEquals(Riarrangia.riarrangia(input),output);
	}
	
	@Test
	public void test4() {
		
		int[] input = new int[] {6, 2, 7, 4, 1, 4};
		int[] output = new int[] {6, 2, 7, 4, 1, 4};
		     											 
		Assert.assertArrayEquals(Riarrangia.riarrangia(input),output);
	}
	
	@Test
	public void test5() {
		
		int[] input = new int[] {-5, -2, -7, -8};
		int[] output = new int[] {-5, -2, -7, -8};
		     											 
		Assert.assertArrayEquals(Riarrangia.riarrangia(input),output);
	}
	 
}
