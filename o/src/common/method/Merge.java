package common.method;

import java.time.LocalDateTime;
import java.util.List;

import common.model.Thought;
import common.model.wrapper.MergedNote;

public class Merge implements Mergeable{

	@Override
	public MergedNote mergeNoteList(List<Thought> noteList, LocalDateTime date) {
		MergedNote mergedNote = new MergedNote();
		mergedNote.setInitialNoteList(noteList);
		for(Thought n: noteList){
			
		}
		
		
		return mergedNote;
	}

}
