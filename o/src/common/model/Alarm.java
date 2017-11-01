package common.model;

import java.time.ZonedDateTime;

import common.model.constant.RepeatDurationUnit;

public class Alarm extends Thing {

	private Thing alarmOn;
	private ZonedDateTime zonedDateTime;
	private boolean isOff;
	private Repeat repeat;

	public Thing getAlarmOn() {
		return alarmOn;
	}

	public void setAlarmOn(Thing alarmOn) {
		this.alarmOn = alarmOn;
	}


	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}

	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}

	public boolean isOff() {
		return isOff;
	}

	public void setOff(boolean isOff) {
		this.isOff = isOff;
	}

	public Repeat getRepeat() {
		return repeat;
	}

	public void setRepeat(Repeat repeat) {
		this.repeat = repeat;
	}

	protected final class Repeat {
		private int times;
		private int every;
		private RepeatDurationUnit unit;
		public int getTimes() {
			return times;
		}
		public void setTimes(int times) {
			this.times = times;
		}
		public int getEvery() {
			return every;
		}
		public void setEvery(int every) {
			this.every = every;
		}
		public RepeatDurationUnit getUnit() {
			return unit;
		}
		public void setUnit(RepeatDurationUnit unit) {
			this.unit = unit;
		}
		
		
	}

}
