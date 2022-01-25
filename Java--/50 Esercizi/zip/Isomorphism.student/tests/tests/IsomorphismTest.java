package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Isomorphism;
import javamm.IsomorphismSolution;

@RunWith(Parameterized.class)
public class IsomorphismTest {

	@Parameters(name = "(i = {2}; j = {3})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[400][4];
		for (int i = 0; i < 200; ++i) {
			int l = 5;
			int[] x = new int[l];
			int[] y = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = (int) (Math.random() * 5);
			}
			for (int j = 0; j < l; j++) {
				y[j] = (int) (Math.random() * 5);
			}
			m[i][0] = x;
			m[i][1] = y;
			m[i][2] = Arrays.toString(x);
			m[i][3] = Arrays.toString(y);
		}
		for (int i = 200; i < 400; ++i) {
			int l = 10;
			int[] x = new int[l];
			int[] y = new int[l];
			for (int j = 0; j < l; j++) {
				x[j] = (int) (Math.random() * 10);
			}
			for (int j = 0; j < l; j++) {
				y[j] = (int) (Math.random() * 10);
			}
			m[i][0] = x;
			m[i][1] = y;
			m[i][2] = Arrays.toString(x);
			m[i][3] = Arrays.toString(y);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	private int[] y;
	@SuppressWarnings("unused")
	private String sx;
	@SuppressWarnings("unused")
	private String sy;

	public IsomorphismTest(int[] x, int[] y, String sx, String sy) {
		this.x = x;
		this.y = y;
		this.sx = sx;
		this.sy = sy;
	}

	@Test
	public void testExercise() {
		assertEquals(IsomorphismSolution.isomorph(x, y), Isomorphism.isomorph(x, y));
	}
}
