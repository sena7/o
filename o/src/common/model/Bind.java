package common.model;

import java.util.List;

public class Bind extends Thing{

    /**
     * lazy initialisation required. <br>
     * binder can be null.
     */
    private Thing binder;

    private List<Thing> boundList;

    public Thing getBinder() {
        return binder;
    }

    public void setBinder(Thing binder) {
        this.binder = binder;
    }

    public List<Thing> getBoundList() {
        return boundList;
    }

    public void setBoundList(List<Thing> boundList) {
        this.boundList = boundList;
    }



}
