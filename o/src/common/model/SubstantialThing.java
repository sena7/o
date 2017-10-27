package common.model;

public class SubstantialThing extends Thing {
	private Boolean isComplete; // can be the meaningful unit as a whole. function fully as an independent
								// thing.
	private Boolean isIntellectual; // has its own will and can make decisions

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}

	public Boolean getIsIntellectual() {
		return isIntellectual;
	}

	public void setIsIntellectual(Boolean isIntellectual) {
		this.isIntellectual = isIntellectual;
	}

}
