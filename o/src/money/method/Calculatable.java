package money.method;

import java.math.BigDecimal;

import java.util.List;

public interface Calculatable {

	public BigDecimal sum(List<BigDecimal> list);
	public BigDecimal sum(List<BigDecimal> list, Float interestRate);
	
	public BigDecimal pv(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale);
	public BigDecimal pva(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale);
	public BigDecimal fv(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale);
	public BigDecimal fva(BigDecimal value, BigDecimal ratePerPeriod, int numberOfPeriod, int roundingMode, int scale);
	
	//TODO same parameters, what about making an object ? 
}
