package test.common;

import common.model.LifeTime;
import common.model.Thing;
import org.junit.jupiter.api.Test;
import test.TestJavaAPIs;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TestThing extends TestJavaAPIs {
    @Test
    public void testThingBuilder() {
        Thing thing01 = new Thing.Builder(new String("just a note")).build();
        thing01.setStatus(Thing.Status.ACTIVE);
        assertEquals(thing01.getExpressed(), "just a note");
        assertNotNull(thing01.getLifeTime());
        assertNotNull(thing01.getLifeTime().getStartTime());
        assertNull(thing01.getLifeTime().getEndTime());
        assertEquals(thing01.getStatus(), Thing.Status.ACTIVE);
    }
    @Test
    public void testLifeTime(){
        LifeTime lifeTime = new LifeTime(ZonedDateTime.of(2018, 3, 1, 9, 30, 0, 0, ZoneId.of(ZoneId.SHORT_IDS.get("EST"))));
        lifeTime.setEndTime(ZonedDateTime.of(2018, 3, 1, 15, 30, 30, 100, ZoneId.of(ZoneId.SHORT_IDS.get("EST"))));
        assertNotNull(lifeTime.getDuration());
        System.out.println(lifeTime.getDuration());
    }
}
