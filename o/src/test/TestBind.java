package test;

import common.model.Bind;
import common.model.Thing;
import common.model.Time;
import constant.SortOrder;

import java.util.ArrayList;
import java.util.List;

public class TestBind {

    public static void main(String[] args){

        List<Thing> thingList = new ArrayList<>();

        thingList.add(new Thing("Hi"));
        thingList.add(new Thing(57));
        thingList.add(new Thing(new Thing("A Thing in the Thing")));
        Bind bind = new Bind(thingList);

         bind.sortByTime(SortOrder.ASCENDING, Time.TimeType.START);
        for(Thing t : bind.getBoundList()){
        System.out.println(t.getTime().getStartTime());
        }
    }
}
