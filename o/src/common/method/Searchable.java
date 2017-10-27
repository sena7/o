package common.method;



import java.util.List;
import java.util.Set;

import common.model.search.SearchedIndexSet;

public interface Searchable {

 public List<SearchedIndexSet> searchedIndexSetList(String text, List<SearchedIndexSet> list, Boolean isCaseSensitive, Boolean isWholeText);
	
 public Set<Integer> searchText(String text, String searchTarget);
 
 public Set<Integer> searchTextWhole(String text, String searchTarget);
 
 public Set<Integer> searchTextCaseSensitive(String text, String searchTarget);
 
 public Set<Integer> searchTextWholeCaseSensitive(String text, String searchTarget);
 
 
 
}
