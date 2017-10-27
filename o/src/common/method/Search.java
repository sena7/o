package common.method;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import common.model.search.SearchedIndexSet;

public class Search implements Searchable {

	@Override
	public Set<Integer> searchTextCaseSensitive(String text, String searchTarget) {

		int textLength = text.length();
		int targetLength = searchTarget.length();
		char firstChar = text.charAt(0);
		Set<Integer> firstCharMatchIndexSet = new TreeSet<>();

		for (int i = 0; i < targetLength; i++) {
			if (searchTarget.charAt(i) == firstChar) {
				Boolean isMatch = true;
				for (int j = 1; j < textLength; j++) {
					if (text.charAt(j) != searchTarget.charAt(i + j)) {
						isMatch = false;

					}
				}
				if (isMatch == true) {
					firstCharMatchIndexSet.add(i);
				}

			}
		}

		return firstCharMatchIndexSet;
	}

	@Override
	public Set<Integer> searchTextWholeCaseSensitive(String text, String searchTarget) {
		int textLength = text.length();
		int targetLength = searchTarget.length();
		char firstChar = text.charAt(0);
		Set<Integer> firstCharMatchIndexSet = new TreeSet<>();

		for (int i = 0; i < targetLength; i++) {
			Boolean isWhiteSpaceBefore = false;
			if (i == 0) {
				isWhiteSpaceBefore = true;
			} else {
				isWhiteSpaceBefore = Character.isWhitespace(searchTarget.charAt(i - 1));
			}
			;

			if (searchTarget.charAt(i) == firstChar && isWhiteSpaceBefore) {
				Boolean isMatch = true;
				for (int j = 1; j < textLength; j++) {
					if (text.charAt(j) != searchTarget.charAt(i + j)) {
						isMatch = false;
						break;
					}

				}

				if (isMatch == true) {
					Boolean last = i + textLength == targetLength ? true : false;
					Boolean ws = false;
					if (!last) {
						ws = Character.isWhitespace(searchTarget.charAt(i + textLength + 1));
					}
					if (ws) {
						isMatch = false;
					}
					;
				}
				if (isMatch == true) {
					firstCharMatchIndexSet.add(i);
				}

			}
		}

		return firstCharMatchIndexSet;

	}

	@Override
	public Set<Integer> searchText(String text, String searchTarget) {
		return searchText(text.toUpperCase(), searchTarget.toUpperCase());
	}

	@Override
	public Set<Integer> searchTextWhole(String text, String searchTarget) {
		return searchTextWhole(text.toUpperCase(), searchTarget.toUpperCase());
	}

	@Override
	public List<SearchedIndexSet> searchedIndexSetList(String text, List<SearchedIndexSet> list, Boolean isCaseSensitive,
			Boolean isWholeText) {
		// TODO where to check null parameters ?
		for (SearchedIndexSet s : list) {
			s.setIsCaseSensitive(isCaseSensitive);
			s.setIsWholeText(isWholeText);
			s.setSearchText(text);
			s.setSearchTextLength(text.length());
			String searchTarget = s.getTargetText();
			if (isCaseSensitive & isWholeText) {
				s.setIndexSet(searchTextWholeCaseSensitive(text, searchTarget));
			} else if (isCaseSensitive & !isWholeText) {
				s.setIndexSet(searchTextCaseSensitive(text, searchTarget));
			} else if (!isCaseSensitive & isWholeText) {
				s.setIndexSet(searchTextWhole(text, searchTarget));
			} else {
				s.setIndexSet(searchText(text, searchTarget));
			}
			
		}

		return list;
	}

}
