package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Traveller;
import javamm.TravellerSolution;

@RunWith(Parameterized.class)
public class TravellerTest {
	private static void nextInput(Object[][] m, int i, int l, int s1) {
		int s2 = s1;
		int[][] a = new int[l][2];
		for (int r = 0; r < l - 1; r++) {
			int n = l - r - 1;
			int f = 1 + (int) (Math.random() * (s1 - n));
			s1 = s1 - f;
			int s = 1 + (int) (Math.random() * (s2 - n));
			s2 = s2 - s;
			a[r] = new int[] { f, s };
		}
		a[l - 1] = new int[] { s1, s2 };
		m[i][0] = a;
		m[i][1] = Arrays.deepToString(a);
	}

	@Parameters(name = "(m = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[900][2];
		for (int i = 0; i < 300; ++i) {
			int l = 5;
			int s1 = 100;
			nextInput(m, i, l, s1);
		}
		for (int i = 300; i < 600; ++i) {
			int l = 10;
			int s1 = 100;
			nextInput(m, i, l, s1);
		}
		for (int i = 600; i < 900; ++i) {
			int l = 5;
			int s1 = 500;
			nextInput(m, i, l, s1);
		}
		return Arrays.asList(m);
	}

	private int[][] x;
	@SuppressWarnings("unused")
	private String y;

	public TravellerTest(int[][] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		String t = Arrays.toString(TravellerSolution.traveller(x));
		String s = Arrays.toString(Traveller.traveller(x));
		assertEquals(t, s);
	}

}
