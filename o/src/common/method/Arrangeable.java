package common.method;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import common.model.Thing;
import common.model.Thought;
import constant.SortOrder;

public interface Arrangeable {

   public Map<LocalDateTime,Thought> arrangeNoteListByTimeCreated(List<Thought> noteList);

   public String combineNoteTextByTimeCreatedOrder(Map<LocalDateTime,Thought> noteMap, SortOrder order);

   
   //lambda expression TestJavaAPIs
   //public List<Thing> filterSubstantialThings();
}
