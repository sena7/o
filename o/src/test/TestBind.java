package test;

import common.model.Bind;
import common.model.Thing;

import java.util.ArrayList;
import java.util.List;

public class TestBind {

    public static void main(String[] args){
        Bind bind = new Bind();
        List<Thing> thingList = new ArrayList<>();

        thingList.add(new Thing("Hi"));
        thingList.add(new Thing(57));
        thingList.add(new Thing(new Thing("A Thing in the Thing")));
        bind.setBoundList(thingList);

        for(Thing t : bind.getBoundList()){
System.out.println(t);
        }
    }
}
