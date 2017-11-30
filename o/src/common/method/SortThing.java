package common.method;

import common.model.Thing;
import constant.SortOrder;


/**
 * How to manage multiple criteria for sorting.
* TODO
 */
public interface SortThing {

    void sortThingByTime(Thing thing);

    /**
     * needs more segregation.
     * TODO
     */
    void sortThingByExpressed();



    void sortThingByDatabaseTime(SortOrder sortOrder);
}
