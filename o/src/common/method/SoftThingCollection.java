package common.method;

import common.model.DatabaseTime;
import common.model.LifeTime;
import common.model.Thing;
import constant.SortOrder;

import java.util.Collection;
import java.util.Map;


/**
 * How to manage multiple criteria for sorting.
 * Parameter ThingList is provided within the class.
* TODO
 */
public interface SoftThingCollection {

    Collection<Thing> sortByTime(SortOrder sortOrder, LifeTime.TimeType timeType);

    /**
     * needs more segregation.
     * TODO
     */
    Map<String, Collection<Thing>> sortByExpressedType();


    /**
     * Sort Things with the databaseTimeType field by the sortOrder.
     * @param sortOrder
     * @param databaseTimeType
     */
    Collection<Thing> sortByDatabaseTime(SortOrder sortOrder, DatabaseTime.DatabaseTimeType databaseTimeType);

}
