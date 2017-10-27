package common.model;

public class BundledMeasuringUnit extends Thing{

	private MeasuringUnit measuringUnit;
	
	/**
	 * default is 1
	 */
	private int baseUnit = 1;
	
	
	public MeasuringUnit getMeasuringUnit() {
		return measuringUnit;
	}
	public void setMeasuringUnit(MeasuringUnit measuringUnit) {
		this.measuringUnit = measuringUnit;
	}
	public int getBaseUnit() {
		return baseUnit;
	}
	public void setBaseUnit(int baseUnit) {
		this.baseUnit = baseUnit;
	}
	
	
	
}
