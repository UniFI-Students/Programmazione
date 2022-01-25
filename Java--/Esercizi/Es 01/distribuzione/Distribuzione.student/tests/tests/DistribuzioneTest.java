package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import javamm.Distribuzione;
import javamm.DistribuzioneSol;

@RunWith(Parameterized.class)
public class DistribuzioneTest {
	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int max = a[i];
			int imax = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > max) {
					max = a[j];
					imax = j;
				}
			}
			a[imax] = a[i];
			a[i] = max;
		}
	}

	@Parameters(name = "(a = {1})")
	public static Collection<Object[]> data() {
		Object[][] m = new Object[600][2];
		for (int i = 0; i < 300; ++i) {
			int l = 12;
			int[] x = new int[l];
			int d = 1 + (int) (Math.random() * (l/2));
			int p = 0;
			while (p<l) {
				int v = 1 + (int) (Math.random() * 100);
				x[p++] = v;
				int n = 1;
				while (p<l && n<d) {
					x[p++]=v;
					n++;
				}
			}
			sort(x);
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		for (int i = 300; i < 600; ++i) {
			int l = 24;
			int[] x = new int[l];
			int d = 1 + (int) (Math.random() * (l/2));
			int p = 0;
			while (p<l) {
				int v = 1 + (int) (Math.random() * 100);
				x[p++] = v;
				int n = 1;
				while (p<l && n++<d) {
					x[p++]=v;
				}
			}
			sort(x);
			m[i][0] = x;
			m[i][1] = Arrays.toString(x);
		}
		return Arrays.asList(m);
	}

	private int[] x;
	@SuppressWarnings("unused")
	private String y;

	public DistribuzioneTest(int[] x, String y) {
		this.x = x;
		this.y = y;
	}

	@Test
	public void testExercise() {
		assertEquals(Arrays.toString(DistribuzioneSol.distribuisci(x)), Arrays.toString(Distribuzione.distribuisci(x)));
	}

}
