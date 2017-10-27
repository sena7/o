package common.method;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Sortable {

	Set<String> sortStringSet(String text);
	Map<String, Integer> sortStringCount(List<String> textList);
	
}
