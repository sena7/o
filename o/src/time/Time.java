package time;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Map;

public class Time {

    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Duration duration; // Persisted as Long
    private Map<TemporalUnit, Long> durationByUnit;


    // Accessors
    public ZonedDateTime getStartTime() {
        return startTime;
    }
    public ZonedDateTime getEndTime() {
        return endTime;
    }

    // Mutators
    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;

        // if duration has value, set the endTime.
        if (this.duration != null) {
            calculateEndTime(this.startTime, this.duration);
        }
    }



    /**
     * @param endTime Duration will be adjusted or assigned if this startTime is not
     *                null.
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


    // overloaded methods

    /**
     * @param endTime
     * @param duration
     */
    public void calculateStartTime(ZonedDateTime endTime, Duration duration) {
        this.startTime = endTime.minus(duration);

    }

    /**
     * @param startTime
     * @param endTime
     */
    public void calculateDuration(ZonedDateTime startTime, ZonedDateTime endTime) {
        setDuration(Duration.between(startTime, endTime));
    }

    /**
     * @param startTime
     * @param duration
     */
    public void calculateEndTime(ZonedDateTime startTime, Duration duration) {
        setEndTime(startTime.plus(duration));

    }


    public Map<TemporalUnit, Long> getDurationByUnit() {
        return durationByUnit;
    }

    public void setDurationByUnit(Map<TemporalUnit, Long> durationByUnit) {
        this.durationByUnit = durationByUnit;
    }


    // TODO Define the use
    // Do I even need this ?
    public static enum DurationCalculationUnit {
        MINUTES, SECONDS, NANOS;
    }

}
