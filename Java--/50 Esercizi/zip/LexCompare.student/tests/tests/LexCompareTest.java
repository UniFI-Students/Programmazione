package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.LexCompare;
import javamm.LexCompareSol;

@RunWith(Parameterized.class)
public class LexCompareTest {

	@Parameters(name = "(a = {0}; b = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[3000][2];
		for (int i = 0; i < 2700; ++i) {
			m[i][0] = 1 + (int) (Math.random() * 10000);
			m[i][1] = 1 + (int) (Math.random() * 10000);
		}
		for (int i = 2700; i < 2800; ++i) {
			m[i][0] = 1 + (int) (Math.random() * 1000);
			m[i][1] = m[i][0];
		}
		for (int i = 2800; i < 2900; ++i) {
			int a = 1 + (int) (Math.random() * 1000);
			m[i][0] = a;
			m[i][1] = a * 10 + (int) (Math.random() * 10);
		}
		for (int i = 2900; i < 3000; ++i) {
			int a = 1 + (int) (Math.random() * 1000);
			m[i][1] = a;
			m[i][0] = a * 10 + (int) (Math.random() * 10);
		}
		return Arrays.asList(m);
	}

	private int a;
	private int b;

	public LexCompareTest(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Test
	public void testExercise() {
		assertEquals(LexCompareSol.lexCompare(a, b), LexCompare.lexCompare(a, b));
	}

}
