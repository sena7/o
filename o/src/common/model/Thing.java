package common.model;

import java.time.ZonedDateTime;

/**
 * @author Sena Bak
 * @version 1.0
 *
 */
public class Thing {

    private long id;
    private Status status;
    private Object expressed;
    private LifeTime lifeTime;
    private ZonedDateTime inserted;
    private ZonedDateTime lastUpdated;

    public Thing(){}

    public Thing(long id, Status status, Object expressed, LifeTime lifeTime, ZonedDateTime inserted, ZonedDateTime lastUpdated) {
        this.id = id;
        this.status = status;
        this.expressed = expressed;
        this.lifeTime = lifeTime;
        this.inserted = inserted;
        this.lastUpdated = lastUpdated;
    }

    private Thing(Builder builder) {
        expressed = builder.expressed;
        id = builder.id;
        status = builder.status;
        lifeTime = builder.lifeTime;
        inserted = builder.inserted;
        lastUpdated = builder.lastUpdated;

    }
    public static class Builder {
        //required
        private Object expressed;
        //optional
        private long id;
        private Status status;
        private LifeTime lifeTime;
        private ZonedDateTime inserted;
        private ZonedDateTime lastUpdated;

        public Builder(Object expressed) {
            this.expressed = expressed;
            this.status = Status.ACTIVE;
            this.lifeTime = new LifeTime();
        }

        public Builder id(long value) {
            id = value;
            return this;
        }

        public Builder status(Status value) {
            status = value;
            return this;
        }

        public Builder lifeTime(LifeTime value) {
            lifeTime = value;
            return this;
        }

        public Builder inserted(ZonedDateTime value) {
            inserted = value;
            return this;
        }

        public Builder lastUpdated(ZonedDateTime value) {
            lastUpdated = value;
            return this;
        }

        public Thing build() {
            return new Thing(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;

        Thing thing = (Thing) o;

        if (id != thing.id) return false;
        if (status != thing.status) return false;
        if (!expressed.equals(thing.expressed)) return false;
        if (!lifeTime.equals(thing.lifeTime)) return false;
        if (!inserted.equals(thing.inserted)) return false;
        return lastUpdated.equals(thing.lastUpdated);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + status.hashCode();
        result = 31 * result + expressed.hashCode();
        result = 31 * result + lifeTime.hashCode();
        result = 31 * result + inserted.hashCode();
        result = 31 * result + lastUpdated.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "id=" + id +
                ", status=" + status +
                ", expressed=" + expressed.toString() +
                ", lifeTime=" + lifeTime.toString() +
                ", inserted=" + inserted.toString() +
                ", lastUpdated=" + lastUpdated.toString() +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getExpressed() {
        return expressed;
    }

    public void setExpressed(Object expressed) {
        this.expressed = expressed;
    }

    public LifeTime getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(LifeTime lifeTime) {
        this.lifeTime = lifeTime;
    }

    public ZonedDateTime getInserted() {
        return inserted;
    }

    public void setInserted(ZonedDateTime inserted) {
        this.inserted = inserted;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public enum Status {
        ACTIVE, INACTIVE
    }
}
