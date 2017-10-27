package test;

import java.time.Clock;
import java.time.Duration;
import java.time.ZonedDateTime;

public class test {

	public static void main(String[] args) {
		//LocalDateTime t = LocalDateTime.now();
		//System.out.println(t);
	
		ZonedDateTime t1 = ZonedDateTime.of(2016, 9, 27, 9, 0, 00, 200, Clock.systemDefaultZone().getZone());
				//ZonedDateTime.now();
		System.out.println(t1.toLocalDateTime());
		System.out.println(t1.toOffsetDateTime());
		System.out.println(t1.getOffset());
		System.out.println(t1.getZone());
		
		ZonedDateTime t2 =ZonedDateTime.of(2017, 8, 27, 12, 0, 30, 500, Clock.systemDefaultZone().getZone());
		
		Duration d = Duration.between(t1, t2);
		System.out.println(d.toDays());
		System.out.println(d.toHours());
		System.out.println(d.toMillis());
		System.out.println(d.toMinutes());
		System.out.println(d.toNanos());
		
		
	}

}
