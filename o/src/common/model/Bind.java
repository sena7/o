package common.model;

import java.util.List;

import common.model.constant.BindRule;

/**
 * 
 * @author Sena Bak Binder is a Thing that can group other Things.<br>
 *         It is an aspect of the Thing. So, a Thing as the aspect should be
 *         created.
 * @see BindRule
 *
 */
public class Bind extends Thing {

    private BindRule bindRule;
    /**
     * The original Thing.
     */
    private Thing Binder;
    /**
     * As the type is List, it can have the order from a certain logical rule.<br>
     * However, it cannot represent the relationship between Things more than 2.
     * 
     */
    private List<Thing> boundList;

    /**
     * There is no more Thing to be added.
     */
    private Boolean isComplete;

    public BindRule getBindRule() {
	return bindRule;
    }

    public void setBindRule(BindRule bindRule) {
	this.bindRule = bindRule;
    }

    public Thing getBinder() {
	return Binder;
    }

    public void setBinder(Thing binder) {
	Binder = binder;
    }

    public List<Thing> getBoundList() {
	return boundList;
    }

    public void setBoundList(List<Thing> boundList) {
	this.boundList = boundList;
    }

    public Boolean getIsComplete() {
	return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
	this.isComplete = isComplete;
    }

    // Bind behaviours.

}
