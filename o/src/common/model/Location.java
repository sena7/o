package common.model;

import java.math.BigDecimal;

public class Location extends Thing {

	private BigDecimal longitute;
	private BigDecimal latitute;

	public Location(BigDecimal longitute, BigDecimal latitute) {
		super();
		this.longitute = longitute;
		this.latitute = latitute;
	}

	public BigDecimal getLongitute() {
		return longitute;
	}

	public void setLongitute(BigDecimal longitute) {
		this.longitute = longitute;
	}

	public BigDecimal getLatitute() {
		return latitute;
	}

	public void setLatitute(BigDecimal latitute) {
		this.latitute = latitute;
	}

}
