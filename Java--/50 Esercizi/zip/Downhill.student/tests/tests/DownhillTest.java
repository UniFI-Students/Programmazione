package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Downhill;
import javamm.DownhillSolution;

@RunWith(Parameterized.class)
public class DownhillTest {
	private static String toString(int[][] m) {
		if (m==null) return "null";
		String r = "[" + Arrays.toString(m[0]);
		for (int i = 1; i < m.length - 1; i++) {
			r = r + "," + Arrays.toString(m[i]);
		}
		if (m.length > 1) {
			r = r + "," + Arrays.toString(m[m.length - 1]) + "]";
		} else {
			r = r + "]";
		}
		return r;
	}

	@Parameters(name = "(m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[600][2];
		for (int i = 0; i < 600; ++i) {
			int l = 4 + i / 100;
			int[][] x = new int[l][l];
			for (int r = 0; r < l; r++) {
				for (int c = 0; c < l; c++) {
					x[r][c] = 1 + (int) (Math.random() * 20);
				}
			}
			m[i][0] = x;
			m[i][1] = toString(x);
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;

	public DownhillTest(int[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(DownhillSolution.ddl(x), Downhill.ddl(x));
	}
}
