package common.model;

import java.util.List;

import time.Time;

public class Do extends Thing {

	private List<Thing> doer;
	private Boolean isDone;
	private Boolean isSelfTargeted;
	private List<Thing> target;
	private Time time;

	public List<Thing> getDoer() {
		return doer;
	}

	public void setDoer(List<Thing> doer) {
		this.doer = doer;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}

	public Boolean getIsSelfTargeted() {
		return isSelfTargeted;
	}

	public void setIsSelfTargeted(Boolean isSelfTargeted) {
		this.isSelfTargeted = isSelfTargeted;
		// set this target with this driver if the action is self targeted.
		if (isSelfTargeted == true) {
			this.setTarget(doer);
		}
	}

	public List<Thing> getTarget() {
		return target;
	}

	public void setTarget(List<Thing> target) {
		this.target = target;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	// public void setIsSelfTargeted(Boolean isSelfTargeted) {
	// this.isSelfTargeted = isSelfTargeted;
	// // set this targetList with this driverList if the action is self targeted.
	// if (isSelfTargeted == true) {
	// this.setTargetList(doer);
	// }
	// }

}
