package tests;

import org.junit.Assert;
import org.junit.Test;

import javamm.CompattaMatrice;

@SuppressWarnings("deprecation")

public class CompattaMatriceTest {

		
		@Test
		public void test1() {
			
			int[][] A = new int[][] {{0,1,0,0,0,0}, 
					               {0,5,0,2,0,0},
					               {0,0,0,0,0,0},
					               {-3,0,0,0,0,0},
					               {0,0,0,0,-4,6}};
			             
			int[][] Ris = new int[][] {{-4,4,4},
									 {-3,3,0},
									 {1,0,1},
									 {2,1,3},
									 {5,1,1},
									 {6,4,5}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

	
		@Test
		public void test2() {
			
			int[][] A = new int[][] {{0,0,0,0,0,0}, 
					               {0,1,0,2,0,0},
					               {0,0,0,0,0,0},
					               {3,0,0,0,0,0},
					               {0,0,0,0,0,4}};
			             
			int[][] Ris = new int[][] {{1,1,1},
									 {2,1,3},
									 {3,3,0},
									 {4,4,5}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}
		
		@Test
		public void test3() {
			
			int[][] A = new int[][] {{0,0,0,0,0,0}, 
					               {0,0,0,0,0,0},
					               {0,0,0,0,0,0},
					               {0,0,0,0,0,0},
					               {0,0,0,0,0,0}};
			             
			int[][] Ris = null;
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

		@Test
		public void test4() {
			
			int[][] A = new int[][] {{0}};
			             
			int[][] Ris = null;
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

		@Test
		public void test5() {
			
			int[][] A = new int[][] {{-3}};
			             
			int[][] Ris = new int[][] {{-3,0,0}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

		@Test
		public void test6() {
			
			int[][] A = new int[][] {{3,1}};
			             
			int[][] Ris = new int[][] {{1,0,1},
				                       {3,0,0}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}
		
		@Test
		public void test7() {
			
			int[][] A = new int[][] {{-4},
				                     {-2}};
			             
			int[][] Ris = new int[][] {{-4,0,0},
				                       {-2,1,0}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}
		
		@Test
		public void test8() {
			
			int[][] A = new int[][] {{2,4},
				                     {1,3}};
			             
			int[][] Ris = new int[][] {{1,1,0},
				                       {2,0,0},
				                       {3,1,1},
				                       {4,0,1}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

		@Test
		public void test9() {
			
			int[][] A = new int[][] {{0,1,0,0,0,0}, 
					               {0,2,0,3,0,0},
					               {0,0,0,0,0,0},
					               {4,0,0,0,0,0},
					               {0,0,0,0,5,6}};
			             
			int[][] Ris = new int[][] {{1,0,1},
									   {2,1,1},
									   {3,1,3},
									   {4,3,0},
									   {5,4,4},
									   {6,4,5}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}

		@Test
		public void test10() {
			
			int[][] A = new int[][] {{0,0,0,2}, 
					                 {0,0,-1,0},
					                 {0,1,0,0},
					                 {3,0,0,0}};
			             
			int[][] Ris = new int[][] {{-1,1,2},
									   {1,2,1},
									   {2,0,3},
									   {3,3,0}};
		
			Assert.assertEquals(CompattaMatrice.compattaMatrice(A), Ris);
		}
}