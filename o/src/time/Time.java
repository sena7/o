package time;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Time {

	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	private Duration duration;

	// Accessors
	public ZonedDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
		//if duration has value, set the endTime.
		if(this.duration!=null) {
			setEndTime(this.startTime, this.duration);
		}
	}

	public ZonedDateTime getEndTime() {
		return endTime;
	}
/**
 * 
 * @param endTime
 * Duration will be adjusted or assigned if this startTime is not null.
 */
	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
		
		//if this startTime is not null, set this duration. 
		if(this.startTime!=null) {
			setDuration(this.startTime, this.endTime); 
			
		}else {
		   //if this startTime is null but duration is not, set the startTime
		   if(this.duration!=null) {
			   setStartTime(this.endTime, this.duration);
		   }//ELSE do nothing
		   
		}
		
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	

	// overloaded
	public void setStartTime(ZonedDateTime endTime, Duration duration) {
		//TODO 
	}

	public void setDuration(ZonedDateTime startTime, ZonedDateTime endTime) {
		//TODO
	}

	public void setEndTime(ZonedDateTime startTime, Duration duration) {
		//TODO

	}

}
