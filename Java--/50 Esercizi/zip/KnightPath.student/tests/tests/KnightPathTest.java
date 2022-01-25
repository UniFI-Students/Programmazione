package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.KnightPath;
import javamm.KnightPathSolution;

@RunWith(Parameterized.class)
public class KnightPathTest {

	@Parameters(name = "(n = {0})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1000][1];
		for (int i = 3; i < 1003; ++i) {
			m[i-3][0] = i;
		}
		return Arrays.asList(m);
	}

	private int x;

	public KnightPathTest(int x) {
		this.x = x;
	}

	@Test
	public void testExercise() {
		assertEquals(KnightPathSolution.knightPath(x), KnightPath.knightPath(x));
	}
}
