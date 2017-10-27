package common.model.search;

import java.util.Set;

public class SearchedIndexSet {
 
	private String searchText;
	private String targetText;
	
	private int searchTextLength;
	private Boolean isCaseSensitive;
	private Boolean isWholeText;
	
	private Set<Integer> indexSet;

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public String getTargetText() {
		return targetText;
	}

	public void setTargetText(String targetText) {
		this.targetText = targetText;
	}

	public int getSearchTextLength() {
		return searchTextLength;
	}

	public void setSearchTextLength(int searchTextLength) {
		this.searchTextLength = searchTextLength;
	}

	public Boolean getIsCaseSensitive() {
		return isCaseSensitive;
	}

	public void setIsCaseSensitive(Boolean isCaseSensitive) {
		this.isCaseSensitive = isCaseSensitive;
	}

	public Boolean getIsWholeText() {
		return isWholeText;
	}

	public void setIsWholeText(Boolean isWholeText) {
		this.isWholeText = isWholeText;
	}

	public Set<Integer> getIndexSet() {
		return indexSet;
	}

	public void setIndexSet(Set<Integer> indexSet) {
		this.indexSet = indexSet;
	}
	
	
	
}
