package tests;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertArrayEquals;

//import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import javamm.CacciaAlTesoro;

public class CacciaAlTesoroRidottaTest {

		
	@Test
	public void test1() {
		
		char[][] M = new char[][] { {'B','D','D','B'},
									{'B','A','B','B'},
									{'D','S','A','X'}};
		boolean ris = false;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
		
	
	@Test
	public void test2() {
		
		char[][] M = new char[][] { {'B','B','D','B'},
									{'B','D','B','B'},
									{'D','B','B','X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
		
	@Test
	public void test3() {
		
		char[][] M = new char[][] { {'B','A','T','B'},
									{'D','A','A','T'},
									{'S','D','B','B'},
									{'S','A','D','X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}

	@Test
	public void test4() {
		
		char[][] M = new char[][] { {'D','D','D','B'},
									{'D','A','S','S'},
									{'S','B','T','S'},
									{'S','S','T','X'}};
		boolean ris = false;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}

	
	@Test
	public void test5() {
		
		char[][] M = new char[][] { {'B','A','S','S'},
									{'B','D','A','A'},
									{'S','B','T','A'},
									{'S','D','D','X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
	@Test
	public void test6() {
		
		char[][] M = new char[][] { {'B','A','B','S'},
									{'B','D','D','A'},
									{'S','B','T','A'},
									{'S','D','D','X'}};
		boolean ris = false;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
	@Test
	public void test7() {
		
		char[][] M = new char[][] { {'S','A','A','B'},
									{'B','D','A','S'},
									{'S','B','T','A'},
									{'S','D','T','X'}};
		boolean ris = false;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
	@Test
	public void test8() {
		
		char[][] M = new char[][] { {'B','T'},
									{'S','X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
		
	@Test
	public void test9() {
		
		char[][] M = new char[][] { {'B','T'},
									{'S','B'},
									{'B','S'},
									{'D','D'},
									{'B','D'},
									{'D','X'},};
		boolean ris = false;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}

	@Test
	public void test10() {
		
		char[][] M = new char[][] { {'D','D','D','X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
		
	@Test
	public void test11() {
		
		char[][] M = new char[][] { {'X'}};
		boolean ris = true;
		Assert.assertEquals(CacciaAlTesoro.cacciaAlTesoro(M),ris);
	}
	
}
