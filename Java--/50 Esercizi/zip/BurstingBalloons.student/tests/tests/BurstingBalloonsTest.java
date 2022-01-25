package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.BurstingBalloons;
import javamm.BurstingBalloonsSolution;

@RunWith(Parameterized.class)
public class BurstingBalloonsTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[800][2];
		for (int e = 0; e < 8; e++) {
			for (int i = 0; i < 100; i++) {
				int l = 2 + e;
				int[] x = new int[l];
				for (int j = 0; j < l; j++) {
					x[j] = 1 + (int) (Math.random() * 5);
				}
				m[e * 100 + i][0] = x;
				m[e * 100 + i][1] = Arrays.toString(x);
			}
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public BurstingBalloonsTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(BurstingBalloonsSolution.maxCoins(x), BurstingBalloons.maxCoins(x));
	}

}
