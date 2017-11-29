package time.method;

import java.util.List;

import common.model.Time;
import time.wrapper.RepeatedTime;

public interface Timable {

	public RepeatedTime generateRepeatedTime(Time time);
	public List getFreeTimeList(List timeAllocated);
}
