package common.method.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import common.method.Arrange;
import common.model.Thought;
import constant.SortOrder;
import test.TestJavaAPIs;

public class TestArrange extends TestJavaAPIs {
	
	private static Arrange arrange = new Arrange();
	
	List<Thought> noteList = new ArrayList<>();
	
	{
	
	
	Thought note1 = new Thought();
	note1.setDateCreated(LocalDateTime.of(2017, 1, 1, 0, 0, 0));
	note1.setText("Note 1.");
	
	Thought note2 = new Thought();
	note2.setDateCreated(LocalDateTime.of(2017, 1, 2, 0, 0, 0));
	note2.setText("Note 2.");
	
	Thought note3 = new Thought();
	note3.setDateCreated(LocalDateTime.of(2017, 1, 3, 0, 0, 0));
	note3.setText("Note 3.");
	
	Thought note4 = new Thought();
	note4.setDateCreated(LocalDateTime.of(2017, 1, 4, 0, 0, 0));
	note4.setText("Note 4.");


	Thought note5 = new Thought();
	note5.setDateCreated(LocalDateTime.of(2017, 1, 5, 0, 0, 0));
	note5.setText("Note 5.");
	
	noteList.add(note1);
	noteList.add(note5);
	noteList.add(note2);
	noteList.add(note4);
	noteList.add(note3);
	}
	
	@Test
	public void testArrangeNoteListByTimeCreated() {
	
		Map<LocalDateTime, Thought> map = arrange.arrangeNoteListByTimeCreated(noteList);
	    assertEquals(5, map.size());
	    //assertEquals(LocalDateTime.of(2017, 1, 5, 0, 0, 0);
	};
	@Test
	public void testCombineNoteTextByTimeCreatedOrder(){
		
		String textCombined = arrange.combineNoteTextByTimeCreatedOrder(arrange.arrangeNoteListByTimeCreated(noteList), SortOrder.ASCENDING);
		assertEquals("Note 1. Note 2. Note 3. Note 4. Note 5", textCombined);
	};
}
