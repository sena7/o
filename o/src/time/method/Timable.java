package time.method;

import java.util.List;

import common.model.LifeTime;
import time.wrapper.RepeatedTime;

public interface Timable {

	public RepeatedTime generateRepeatedTime(LifeTime lifeTime);
	public List getFreeTimeList(List timeAllocated);
}
