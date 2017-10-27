package common.model;

import java.time.ZonedDateTime;

public class Alarm extends Thing{

	private Thing alarmOn;
	private ZonedDateTime time;
    private boolean isOff;
  
}
