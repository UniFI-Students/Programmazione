package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.ReverseWord;
import javamm.ReverseWordSolution;

@RunWith(Parameterized.class)
public class ReverseWordTest {

	@Parameters(name = "(f = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[200][2];
		for (int i = 0; i < 100; ++i) {
			int s = (int) (Math.random() * 4);
			char[][] x = new char[s + 1][];
			int tl = 0;
			for (int j = 0; j < s; j++) {
				int l = 1 + (int) (Math.random() * 5);
				x[j] = new char[l + 1];
				for (int k = 0; k < l; k++) {
					x[j][k] = (char) (97 + (int) (Math.random() * 26));
				}
				x[j][l] = ' ';
				tl = tl + l + 1;
			}
			int l = 1 + (int) (Math.random() * 5);
			x[s] = new char[l];
			for (int k = 0; k < l; k++) {
				x[s][k] = (char) (97 + (int) (Math.random() * 26));
			}
			tl = tl + l;
			char[] y = new char[tl];
			int h = 0;
			for (int j = 0; j <= s; j++) {
				for (int k = 0; k < x[j].length; k++) {
					y[h++] = x[j][k];
				}
			}
			m[i][0] = y;
			m[i][1] = Arrays.toString(y);
		}
		for (int i = 100; i < 200; ++i) {
			int s = (int) (Math.random() * 11);
			char[][] x = new char[s + 1][];
			int tl = 0;
			for (int j = 0; j < s; j++) {
				int l = 1 + (int) (Math.random() * 8);
				x[j] = new char[l + 1];
				for (int k = 0; k < l; k++) {
					x[j][k] = (char) (97 + (int) (Math.random() * 26));
				}
				x[j][l] = ' ';
				tl = tl + l + 1;
			}
			int l = 1 + (int) (Math.random() * 8);
			x[s] = new char[l];
			for (int k = 0; k < l; k++) {
				x[s][k] = (char) (97 + (int) (Math.random() * 26));
			}
			tl = tl + l;
			char[] y = new char[tl];
			int h = 0;
			for (int j = 0; j <= s; j++) {
				for (int k = 0; k < x[j].length; k++) {
					y[h++] = x[j][k];
				}
			}
			m[i][0] = y;
			m[i][1] = Arrays.toString(y);
		}
		return Arrays.asList(m);
	}

	private char[] x;
	@SuppressWarnings("unused")
	private String y;

	public ReverseWordTest(char[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExcercise() {
		assertEquals(Arrays.toString(ReverseWordSolution.reverseWord(x)), Arrays.toString(ReverseWord.reverseWord(x)));
	}
}
