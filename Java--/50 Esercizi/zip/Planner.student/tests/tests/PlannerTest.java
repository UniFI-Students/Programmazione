package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Planner;
import javamm.PlannerSol;

@RunWith(Parameterized.class)
public class PlannerTest {

	@Parameters(name = "(m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][2];
		for (int i = 0; i < 500; ++i) {
			int[][] x = new int[5][2];
			for (int j = 0; j < 5; j++) {
				x[j][0] = 1 + (int) (Math.random() * 20);
				x[j][1] = x[j][0] + 1 + (int) (Math.random() * (20 - x[j][0] + 1));
			}
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		for (int i = 500; i < 1000; ++i) {
			int[][] x = new int[10][2];
			for (int j = 0; j < 10; j++) {
				x[j][0] = 1 + (int) (Math.random() * 100);
				x[j][1] = x[j][0] + 1 + (int) (Math.random() * (100 - x[j][0] + 1));
			}
			m[i][0] = x;
			m[i][1] = Arrays.deepToString(x);
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;

	public PlannerTest(int[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(PlannerSol.plan(x), Planner.plan(x));
	}

}
