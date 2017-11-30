package common.model;

import common.model.BaseRelation;

public class HierachicalRelation extends BaseRelation{

    private HierachicalRelationEnum whatBisToA;


    enum HierachicalRelationEnum{
        ATTRIBUTE, COMPONENT, SUBSEQUENT;
    }
}

