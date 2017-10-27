package money.method;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.List;

public class Calculate implements Calculatable {

	@Override
	public BigDecimal sum(List<BigDecimal> list) {
		//Long start = System.nanoTime();
		//System.out.println("Start: " + start);
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal i : list) {
			sum = sum.add(i);
			//System.out.println(sum);
		}
		//Long end = System.nanoTime();
		//System.out.println("End: " + end);
		//System.out.println("Duration: " + (end - start));

		return sum;
	}

	@Override
	public BigDecimal sum(List<BigDecimal> list, Float interestRate) {
		Long start = System.nanoTime();
		System.out.println("Start: " + start);
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal i : list) {
			sum = sum.add(i);
			System.out.println(sum);
		}
		Long end = System.nanoTime();
		System.out.println("End: " + end);
		System.out.println("Duration: " + (end - start));
		return null;
	}

	@Override
	public BigDecimal pv(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale) {

		return value.divide(BigDecimal.ONE.add(ratePerPeriod).pow(numberOfPeriod), MathContext.DECIMAL128).setScale(scale,
				roundingMode);
	}

	@Override
	public BigDecimal pva(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale) {

		return value.multiply((BigDecimal.ONE.subtract(BigDecimal.ONE.divide(ratePerPeriod.add(BigDecimal.ONE).pow(numberOfPeriod), MathContext.DECIMAL128)))
				.divide(ratePerPeriod, roundingMode)).setScale(scale, roundingMode);
	}

	@Override
	public BigDecimal fv(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale) {
		
		return value.multiply(BigDecimal.ONE.add(ratePerPeriod).pow(numberOfPeriod)).setScale(scale, roundingMode);
	}

	@Override
	public BigDecimal fva(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale) {
		
		return value.multiply(BigDecimal.ONE.add(ratePerPeriod).pow(numberOfPeriod).subtract(BigDecimal.ONE).divide(ratePerPeriod, MathContext.DECIMAL128)).setScale(scale, roundingMode);
	}
	

}
