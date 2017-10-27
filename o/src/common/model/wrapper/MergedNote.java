package common.model.wrapper;

import java.util.List;

import common.model.Thought;

public class MergedNote extends Thought{

	private List<Thought> initialNoteList;

	public List<Thought> getInitialNoteList() {
		return initialNoteList;
	}

	public void setInitialNoteList(List<Thought> initialNoteList) {
		this.initialNoteList = initialNoteList;
	}
	
	

	@Override
	public String toString() {
		return "MergedNote [initialNoteList=" + initialNoteList + "]";
	}
	
	
}
