package common.model;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LifeTime {

    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Duration duration; // Persisted as Long
    private Map<TemporalUnit, Long> durationUnitMap;

    public LifeTime(){
        this.startTime = ZonedDateTime.now();
    }

    public LifeTime(ZonedDateTime start) {
        if (start == null) {
            this.startTime = ZonedDateTime.now();

        } else {
            setStartTime(start);
        }

    }

    public LifeTime(ZonedDateTime start, ZonedDateTime end, Duration duration) {
        if (start == null && end == null && duration == null) {
            this.startTime = ZonedDateTime.now();
            this.endTime = null;
            this.duration = null;
        } else if (start != null && end != null && duration != null) {
            if (!duration.equals(calculateDuration(start, end))) ;
            throw new IllegalArgumentException("The duration value input does not match the actual duration from the start to end time.");

        } else {
            setStartTime(start);
            setEndTime(end);
            setDuration(duration);
        }

    }

    // Accessors
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public Map<TemporalUnit, Long> getDurationUnitMap() {
        return durationUnitMap;
    }


    public Set<TemporalUnit> getUnitSet() {

        return this.durationUnitMap.keySet();
    }

    public Long getDurationByUnit(TemporalUnit unit) {

        for (Map.Entry<TemporalUnit, Long> e : this.durationUnitMap.entrySet()) {
            if (unit.equals(e.getKey())) {
                return e.getValue();
            }
        }
        return null;
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
    public ZonedDateTime calculateStartTime(ZonedDateTime endTime, Duration duration) {
        return endTime.minus(duration);

    }

    /**
     * @param startTime
     * @param endTime
     */
    public Duration calculateDuration(ZonedDateTime startTime, ZonedDateTime endTime) {
        return Duration.between(startTime, endTime);
    }

    /**
     * @param startTime
     * @param duration
     */
    public ZonedDateTime calculateEndTime(ZonedDateTime startTime, Duration duration) {
        return startTime.plus(duration);

    }

    @Override
    public String toString() {
        return "LifeTime{" +
                "startTime=" + startTime.toString() +
                ", endTime=" + endTime.toString() +
                ", duration=" + duration.toString() +
                ", durationUnitMap=" + durationUnitMapToString() +
                '}';
    }

    public String durationUnitMapToString() {
        StringBuilder b = new StringBuilder();
        b.append("duration{");
        Iterator<Map.Entry<TemporalUnit, Long>> iterator = this.durationUnitMap.entrySet().iterator();

        while (iterator.hasNext()) {
            b.append(iterator.next().getKey().toString() + "= " + iterator.next().getValue().toString());
            if (iterator.hasNext()) {
                b.append(", ");
            }
        }
        b.append("}");
        return b.toString();
    }

// TODO Define the use
    // Do I even need this ?
    /*public enum DurationUnit {
        YEARS, MONTHS, DAYS, HOURS, MINUTES, SECONDS, NANOS
    }*/

    public enum TimeType {
        START, END
    }


}
