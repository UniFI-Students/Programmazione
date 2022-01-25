package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.PalindromePair;
import javamm.PalindromePairSolution;

@RunWith(Parameterized.class)
public class PalindromePairTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[600][2];
		for (int i = 0; i < 200; ++i) {
			for (int l = 5; l < 20; l = l + 5) {
				int[] x = new int[l];
				for (int j = 0; j < l; j++) {
					x[j] = 1 + (int) (Math.random() * 1000);
					if (x[j] % 10 == 0)
						x[j] = x[j] + 1;
				}
				String y = Arrays.toString(x);
				m[i*3+l/5-1][0] = x;
				m[i*3+l/5-1][1] = y;
			}
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public PalindromePairTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	private String toString(int[][] a) {
		if (a == null)
			return "null";
		int n = a.length;
		String r = "[";
		for (int i = 0; i < n - 1; i++) {
			r = r + "[" + a[i][0] + "," + a[i][1] + "],";
		}
		if (n > 0) {
			r = r + "[" + a[n - 1][0] + "," + a[n - 1][1] + "]]";
		} else {
			r = "[]";
		}
		return r;
	}

	@Test
	public void testExercise() {
		int[][] t = PalindromePairSolution.palindromePair(x);
		int[][] s = PalindromePair.palindromePair(x);
		assertEquals(toString(t), toString(s));
	}
}
