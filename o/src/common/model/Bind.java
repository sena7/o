package common.model;

import common.method.SoftThingCollection;
import constant.SortOrder;

import java.time.ZonedDateTime;
import java.util.*;

public class Bind extends Thing implements SoftThingCollection {

    /**
     * lazy initialisation required. <br>
     * binder can be null.
     */
    private Thing binder;

    private Collection<Thing> boundList;

    public Thing getBinder() {
        return binder;
    }

    public void setBinder(Thing binder) {
        this.binder = binder;
    }

    public Collection<Thing> getBoundList() {
        return boundList;
    }

    public void setBoundList(Collection<Thing> boundList) {
        this.boundList = boundList;
    }

    public Bind(Collection<Thing> things) {
        super();
        this.boundList = things;

    }

    @Override
    public Collection<Thing> sortByTime(SortOrder sortOrder, Time.TimeType timeType) {
        List<Thing> result = new ArrayList<>();


        List<ZonedDateTime> timeList = new ArrayList<>();
        List<Thing> bucket = new ArrayList<>();
        bucket.addAll(this.boundList);
        //inserted, ascending

        for (Thing t : bucket) {
           timeList.add(t.getTime().getStartTime());

        }

        Collections.sort(timeList);


        for(ZonedDateTime dt : timeList){
            for(Thing t : bucket){
                 if(dt.equals(t.getTime().getStartTime()))
                     result.add(t);
            }
        }
        return result;



    }

    @Override
    public Map<String, Collection<Thing>> sortByExpressedType() {
        return null;
    }

    @Override
    public Collection<Thing> sortByDatabaseTime(SortOrder sortOrder, DatabaseTime.DatabaseTimeType databaseTimeType) {
        return null;
    }


    private Collection<Thing> sort(Collection<Thing> c){
        return null;
    }
}
