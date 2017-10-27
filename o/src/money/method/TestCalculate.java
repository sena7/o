package money.method;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculate extends TestCase{

	private Calculate calculate = new Calculate();

	public void testSum() {

		BigDecimal i1 = new BigDecimal(10000);

		BigDecimal i2 = new BigDecimal(11000);
		BigDecimal i3 = new BigDecimal(12000);
		BigDecimal i4 = new BigDecimal(13000);
		BigDecimal i5 = new BigDecimal(14000);

		List<BigDecimal> list = new ArrayList<>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);

		assertEquals(60000,calculate.sum(list).intValue());
	};

	@Test
	public void testPv() {
		BigDecimal value = calculate.pv(BigDecimal.valueOf(1000), BigDecimal.valueOf(0.03), 10,
				BigDecimal.ROUND_HALF_EVEN, 0);
		//System.out.println(value);

		assertEquals(new BigDecimal(744), value);
	}

	@Test
	public void testPva() {
		BigDecimal value = calculate.pva(BigDecimal.valueOf(2000), BigDecimal.valueOf(0.03 / 12), 30*12, BigDecimal.ROUND_HALF_EVEN, 0);
		//System.out.println(value);
		
		assertEquals(new BigDecimal(474379), value);
	}

	@Test
	public void testFv() {
		BigDecimal value = calculate.fv(BigDecimal.valueOf(1000), BigDecimal.valueOf(0.03), 30, BigDecimal.ROUND_HALF_EVEN, 0);
		//System.out.println(value);
		assertEquals(new BigDecimal(2427), value);
	}

	@Test
	public void testFva() {
		BigDecimal value = calculate.fva(BigDecimal.valueOf(2427.262), BigDecimal.valueOf(0.03 / 12), 30 * 12,
				BigDecimal.ROUND_HALF_EVEN, 0);
		//System.out.println(value);
		assertEquals(new BigDecimal(1414455), value);
	}
}
