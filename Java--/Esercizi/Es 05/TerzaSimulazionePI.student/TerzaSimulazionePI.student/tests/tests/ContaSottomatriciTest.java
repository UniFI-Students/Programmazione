package tests;

import org.junit.Assert;

import org.junit.Test;

import javamm.ContaSottomatrici;

public class ContaSottomatriciTest {


	@Test
	public void test1() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = {{1}};
		int risultato=3;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
		
	@Test
	public void test2() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = {{1,2}, {1,2}};
		int risultato=2;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}

	@Test
	public void test3() {
			
			int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
			int[][] S = {{1,2,3,4}};
			int risultato=2;
			Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
		}
	
	@Test
	public void test4() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = {{5},{3}};
		int risultato=1;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test5() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = T;
		int risultato=1;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test6() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = {{2,3,4}, {2,3,4}};
		int risultato=0;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test7() {
		
		int[][] T = {{1,2,3,4}, {1,2,5,6}, {1,2,3,4}};
		int[][] S = {{8}};
		int risultato=0;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test8() {
		
		int[][] T = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] S = {{1}};
		int risultato=9;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test9() {
		
		int[][] T = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] S = {{1,1}};
		int risultato=6;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test10() {
		
		int[][] T = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] S = {{1,1,1}};
		int risultato=3;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}

	@Test
	public void test11() {
		
		int[][] T = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] S = {{1,1},{1,1}};
		int risultato=4;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test12() {
		
		int[][] T = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] S = {{1,1,1},{1,1,1}};
		int risultato=2;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test13() {
		
		int[][] T = {{1,1,1}};
		int[][] S = {{1,1}};
		int risultato=2;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test14() {
		
		int[][] T = {{1},{1},{1}};
		int[][] S = {{1}};
		int risultato=3;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test15() {
		
		int[][] T = {{1},{1},{1}};
		int[][] S = {{1},{1}};
		int risultato=2;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test16() {
		
		int[][] T = {{1}};
		int[][] S = {{1}};
		int risultato=1;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test17() {
		
		int[][] T = {{1}};
		int[][] S = {{2}};
		int risultato=0;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	
	@Test
	public void test18() {
		
		int[][] T = {{1,2,3,4,5,6}};
		int[][] S = {{7}};
		int risultato=0;
		Assert.assertEquals(ContaSottomatrici.contaSottomatrici(T, S), risultato);
	}
	

}