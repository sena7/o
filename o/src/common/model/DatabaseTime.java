package common.model;

import java.time.ZonedDateTime;
import java.util.List;

public class DatabaseTime {
    private List<ZonedDateTime> databaseTimeList;
    public enum DatabaseTimeType{
        INSERTED, UPDATED;
    }
}
