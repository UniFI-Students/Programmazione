package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Knapsack;
import javamm.KnapsackSolution;

@RunWith(Parameterized.class)
public class KnapsackTest {

	@Parameters(name = "(m = {1}; b = {2})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][3];
		for (int i = 0; i < 500; ++i) {
			int[][] x = new int[5][2];
			int b = 1 + (int) (Math.random() * 100);
			for (int j = 0; j < 5; j++) {
				x[j][1] = 1 + (int) (Math.random() * b);
				x[j][0] = 1 + (int) (Math.random() * 100);
			}
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
			m[i][2] = b;
		}
		for (int i = 500; i < 1000; ++i) {
			int[][] x = new int[10][2];
			int b = 1 + (int) (Math.random() * 200);
			for (int j = 0; j < 10; j++) {
				x[j][1] = 1 + (int) (Math.random() * b);
				x[j][0] = 1 + (int) (Math.random() * 100);
			}
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
			m[i][2] = b;
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;
	private int b;

	public KnapsackTest(int[][] x, String y, int b) {
		this.x = x;
		this.y = y;
		this.b = b;
	}

	@Test
	public void testExercise() {
		assertEquals(KnapsackSolution.knapsack(x, b), Knapsack.knapsack(x, b));
	}

}
