package common.model;

import java.time.ZonedDateTime;

public class DatabaseTime {
    private ZonedDateTime inserted;

    private ZonedDateTime updated;

    public ZonedDateTime getInserted() {
        return inserted;
    }

    public void setInserted(ZonedDateTime inserted) {
        this.inserted = inserted;
    }

    public ZonedDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(ZonedDateTime updated) {
        this.updated = updated;
    }
}
