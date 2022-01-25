package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.LexPermutation;
import javamm.LexPermutationSolution;

@RunWith(Parameterized.class)
public class LexPermutationTest {

	@Parameters(name = "(a = {2}; p = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[700][3];
		for (int l = 3; l <= 9; l++) {
			for (int i = 0; i < 100; ++i) {
				char[] x = new char[l];
				boolean[] in = new boolean[26];
				int max = 1;
				for (int j = 0; j < l; j++) {
					x[j] = (char) (97 + (int) (Math.random() * 26));
					while (in[x[j] - 97]) {
						x[j] = (char) (97 + (int) (Math.random() * 26));
					}
					in[x[j] - 97] = true;
					max = max * (j + 1);
				}
				int y = 1 + (int) (Math.random() * max);
				m[(l - 3) * 100 + i][0] = x;
				m[(l - 3) * 100 + i][1] = y;
				m[(l - 3) * 100 + i][2] = Arrays.toString(x);
			}
		}
		return Arrays.asList(m);
	}

	private char[] x;
	private int y;
	@SuppressWarnings("unused")
	private String z;

	public LexPermutationTest(char[] x, int y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(LexPermutationSolution.lexPermutation(x, y)),
				Arrays.toString(LexPermutation.lexPermutation(x, y)));
	}

}
