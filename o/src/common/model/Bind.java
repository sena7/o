package common.model;

import common.method.SoftThingCollection;
import constant.SortOrder;

import java.time.ZonedDateTime;
import java.util.*;

import static common.model.Time.TimeType.START;

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
    public List<Thing> sortByTime(SortOrder sortOrder, Time.TimeType timeType) {
        List<Thing> result = new ArrayList<>();


        List<ZonedDateTime> timeList = new ArrayList<>();
        List<Thing> thingListTmp = new ArrayList<>();
        thingListTmp.addAll(this.boundList);
        //inserted, ascending

        switch (timeType) {
            case START:
                for (Thing t : thingListTmp) {
                    timeList.add(t.getTime().getStartTime());

                }
                break;
            case END:
                for (Thing t : thingListTmp) {
                    timeList.add(t.getTime().getEndTime());

                }
                break;

        }

        Collections.sort(timeList);
        if (SortOrder.DESCENDING.equals(sortOrder)){
            Collections.reverse(timeList);
        }


            switch (timeType) {
                case START:
                    for (ZonedDateTime dt : timeList) {
                        for (Thing t : thingListTmp) {
                            System.out.println("dt.equals(t.getTime().getStartTime()) : " + dt.equals(t.getTime().getStartTime()) + " " + t.getTime().getStartTime());
                            if (dt.equals(t.getTime().getStartTime()))
                                result.add(t);
                        }
                    }
                    break;
                case END:
                    for (ZonedDateTime dt : timeList) {
                        for (Thing t : thingListTmp) {
                            System.out.println("dt.equals(t.getTime().getEndTime()) : " + dt.equals(t.getTime().getEndTime()));
                            if (dt.equals(t.getTime().getEndTime()))
                                result.add(t);
                        }
                    }
                    break;
            }

        System.out.println("result size: " + result.size());
        return result;


    }

    @Override
    public Map<String, Collection<Thing>> sortByExpressedType() {
        return null;
    }

    @Override
    public List<Thing> sortByDatabaseTime(SortOrder sortOrder, DatabaseTime.DatabaseTimeType databaseTimeType) {
        return null;
    }


    private List<Thing> sort(Collection<Thing> c) {
        return null;
    }
}
