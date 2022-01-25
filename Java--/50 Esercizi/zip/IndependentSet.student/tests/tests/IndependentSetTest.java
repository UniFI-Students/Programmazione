package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.IndependentSet;
import javamm.IndependentSetSolution;

@RunWith(Parameterized.class)
public class IndependentSetTest {
	private static int[][] nextInput(int n) {
		int[][] m = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = i+1; j < n; ++j) {
				m[i][j] = (int)(Math.random()*2);
				m[j][i] = m[i][j];
			}			
		}
		return m;
	}
	
	@Parameters(name = "(m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[900][2];
		int[][] x = new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
		m[0][0] = x;
		m[0][1] = Arrays.deepToString(x);
		x = new int[][] {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		m[1][0] = x;
		m[1][1] = Arrays.deepToString(x);
		for (int i = 2; i < 300; ++i) {
			x = nextInput(5);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		for (int i = 300; i < 600; ++i) {
			x = nextInput(10);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		for (int i = 600; i < 900; ++i) {
			x = nextInput(15);
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;

	public IndependentSetTest(int[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(IndependentSetSolution.independentSet(x), IndependentSet.independentSet(x));
	}

}
