package time;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;

public class Time {

	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	private Duration duration;
	// TODO unit would be only parameterised for view methods.
	private TemporalUnit unit;

	// Accessors
	public ZonedDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
		
		// if duration has value, set the endTime.
		if (this.duration != null) {
			calculateEndTime(this.startTime, this.duration);
		}
	}

	public ZonedDateTime getEndTime() {
		return endTime;
	}

	/**
	 * 
	 * @param endTime
	 *            Duration will be adjusted or assigned if this startTime is not
	 *            null.
	 */
	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;

		
		// if this startTime is not null, set this duration.
		if (this.startTime != null) {
			calculateDuration(this.startTime, this.endTime);

		} else {
			// if this startTime is null but duration is not, set the startTime
			if (this.duration != null) {
				calculateStartTime(this.endTime, this.duration);
			} // ELSE do nothing

		}

	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public TemporalUnit getUnit() {
		return unit;
	}

	public void setUnit(TemporalUnit unit) {
		this.unit = unit;
	}

	// overloaded methods

	/**
	 * 
	 * @param endTime
	 * @param duration
	 */
	public void calculateStartTime(ZonedDateTime endTime, Duration duration) {
		this.startTime = endTime.minus(duration);

	}

	/**
	 * 
	 * @param startTime
	 * @param endTime
	 */
	public void calculateDuration(ZonedDateTime startTime, ZonedDateTime endTime) {
		this.duration = Duration.between(this.startTime, this.endTime);
	}

	/**
	 * 
	 * @param startTime
	 * @param duration
	 */
	public void calculateEndTime(ZonedDateTime startTime, Duration duration) {
		this.endTime = startTime.plus(duration);

	}

	// TODO Define the use
	// Do I even need this ?
	public static enum DurationUnit {
		MINUTES, SECONDS, NANOS;
	}

}
