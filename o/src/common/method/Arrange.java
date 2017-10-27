package common.method;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import common.model.Thought;
import constant.SortOrder;

public class Arrange implements Arrangeable {

	@Override
	public Map<LocalDateTime, Thought> arrangeNoteListByTimeCreated(List<Thought> noteList) {

		SortedMap<LocalDateTime, Thought> noteMap = new TreeMap<>();
		for (Thought n : noteList) {
			noteMap.put(n.getDateCreated(), n);
		}

		return noteMap;
	}

	@Override
	public String combineNoteTextByTimeCreatedOrder(Map<LocalDateTime, Thought> noteMap, SortOrder order) {
		StringBuffer combinedText = new StringBuffer();
		
		if (order == SortOrder.ASCENDING)
			for (Map.Entry<LocalDateTime, Thought> m : noteMap.entrySet()) {
				String textTrimmed = m.getValue().getText().trim();
				combinedText.append(textTrimmed);

				if (combinedText.length() != 0) {
					combinedText.append(" ");
				}

				if (!textTrimmed.endsWith(".")) {
					combinedText.append(".");
				}

			}
		else {

		}
		return combinedText.toString();
	}

}
