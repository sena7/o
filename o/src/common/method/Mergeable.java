package common.method;

import java.time.LocalDateTime;
import java.util.List;

import common.model.Thought;
import common.model.wrapper.MergedNote;

public interface Mergeable {
	
	public MergedNote mergeNoteList(List<Thought> noteList, LocalDateTime localDateTime);
	

}
