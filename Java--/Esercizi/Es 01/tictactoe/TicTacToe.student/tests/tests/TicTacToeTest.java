package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.TicTacToe;
import javamm.TicTacToeSol;

@RunWith(Parameterized.class)
public class TicTacToeTest {

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[1500][2];
		for (int n = 1; n <= 15; n++) {
			for (int e = 0; e < 100; e++) {
				int[][] a = new int[n][n];
				for (int i = 0; i < n; ++i) {
					for (int j = 0; j < n; ++j) {
						a[i][j] = (int) (Math.random() * 3);
					}
				}
				m[(n - 1) * 100 + e][0] = a;
				m[(n - 1) * 100 + e][1] = Arrays.deepToString(a);
			}
		}
		return Arrays.asList(m);
	}

	private int[][] a;
	@SuppressWarnings("unused")
	private String x;

	public TicTacToeTest(int[][] a, String x) {
		this.a = a;
		this.x = x;
	}

	@Test
	public void testExercise() {
		assertEquals(TicTacToeSol.tictactoe(a), TicTacToe.tictactoe(a));
	}

}
