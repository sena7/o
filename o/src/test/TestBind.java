package test;

import common.model.Bind;
import common.model.LifeTime;
import common.model.Thing;
import constant.SortOrder;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestBind {

    public static void main(String[] args) {
        Random random = new Random();
        List<Thing> thingList = new ArrayList<>();

        thingList.add(new Thing(random.nextInt(), new LifeTime(ZonedDateTime.of(2017, 11, 4, 12, 10, 1, 1, ZoneId.of("Europe/Paris")))));
        thingList.add(new Thing(random.nextInt(), new LifeTime(ZonedDateTime.of(2017, 11, 4, 12, 20, 1, 1, ZoneId.of("Europe/Paris")))));
        thingList.add(new Thing(random.nextInt(), new LifeTime(ZonedDateTime.of(2017, 11, 4, 12, 30, 1, 1, ZoneId.of("Europe/Paris")))));
        thingList.add(new Thing(random.nextInt(), new LifeTime(ZonedDateTime.of(2017, 11, 4, 12, 40, 1, 1, ZoneId.of("Europe/Paris")))));


        Bind bind = new Bind(thingList);

        List<Thing> boundList = bind.sortByTime(SortOrder.DESCENDING, LifeTime.TimeType.START);
        for (Thing t : boundList) {

            System.out.println(t.getLifeTime().getStartTime());
        }
    }
}
