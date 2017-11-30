package common.model;

public class NonHierachicalRelation extends BaseRelation{
    private NonHierachicalRelationEnum relation;


    enum NonHierachicalRelationEnum{
        ASPECT, OPPOSITE;
    }

}
