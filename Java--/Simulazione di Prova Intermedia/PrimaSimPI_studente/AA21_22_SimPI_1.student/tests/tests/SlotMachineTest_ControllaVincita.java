package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.SlotMachine;

public class SlotMachineTest_ControllaVincita {

		
	@Test
	public void test1() {
		
		int[][] slot = new int[][] {{0,0,0,1},
									{0,1,1,0},
									{1,1,0,1} };
		boolean ris = false;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	@Test
	public void test2() {
		
		int[][] slot = new int[][] {{0,0,0,1},
									{1,1,1,1},
									{1,1,0,1} };
		boolean ris = true;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	
	@Test
	public void test3() {
		
		int[][] slot = new int[][] {{1,0},
									{0,1},
									{1,1},
									{1,1},
									{0,1},
									{1,0},
									{1,1} };
		boolean ris = true;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	@Test
	public void test4() {
		
		int[][] slot = new int[][] {{1,0},
									{0,1},
									{0,1},
									{0,0},
									{0,1},
									{1,0},
									{1,1} };
		boolean ris = false;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	@Test
	public void test5() {
		
		int[][] slot = new int[][] {{1},
									{0},
									{1},
									{0},
									{0},
									{1},
									{1} };
		boolean ris = false;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	@Test
	public void test6() {
		
		int[][] slot = new int[][] {{1},
									{0},
									{1},
									{1},
									{0},
									{1},
									{1} };
		boolean ris = true;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	
	@Test
	public void test7() {
		
		int[][] slot = new int[][] {{0,0,0,1,0,0},
									{0,1,1,0,0,1},
									{1,1,1,1,1,1},
									{0,0,0,1,0,0},
									{0,0,0,0,1,0}};
		boolean ris = true;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
	@Test
	public void test8() {
		
		int[][] slot = new int[][] {{0,0,0,1,0,0},
									{0,1,1,0,0,1},
									{1,1,1,1,1,0},
									{0,0,0,1,0,0},
									{0,0,0,0,1,0}};
		boolean ris = false;
		Assert.assertEquals(SlotMachine.controllaVincita(slot),ris);
	}
	
}
