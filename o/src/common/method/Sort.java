package common.method;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import common.method.utils.StringUtils;

public class Sort implements Sortable {
    
    private Search search = new Search();
	
	@Override
	public Set<String> sortStringSet(String text) {
		int addCnt = 0;

		Set<String> stringSet = new TreeSet<>();
		String trimmedText = text.trim();

		int textLength = trimmedText.length();

		int wordStart = 0;
		int wordEnd = 0;

		Boolean running = true;
		while (running) {
			System.out.println("word start " + wordStart);
			Boolean whiteSpaceExists = false;
			for (int i = wordStart; i < textLength; i++) {

				if (Character.isWhitespace(trimmedText.charAt(i))) {
					whiteSpaceExists = true;
					wordEnd = i - 1;
					break;
				}
				;
			}

			if (whiteSpaceExists) {
				// 1 Add the word

				String word = trimmedText.substring(wordStart, wordEnd + 1);
				if (StringUtils.isMoreThanOneChar(word)) {
					stringSet.add(word);
					addCnt += 1;

				}

				// 2 find the next none null index and set it the start index
				for (int j = wordEnd + 2; j < textLength; j++) {
					if (!Character.isWhitespace(trimmedText.charAt(j))) {
						wordStart = j;
						break;
					}
				}

			} else {
				wordEnd = textLength - 1;
				String word = trimmedText.substring(wordStart, wordEnd + 1);
				if (StringUtils.isMoreThanOneChar(word)) {
					stringSet.add(word);
					addCnt += 1;
				}
				running = false;
			}

			System.out.println("word end " + wordEnd);
		}
		System.out.println("addCnt " + addCnt);

		return stringSet;
	}

	@Override
	public Map<String, Integer> sortStringCount(List<String> textList) {
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(String text: textList){
			Set<String> wordSetFromText = sortStringSet(text);
			for(String word: wordSetFromText){
				
				Boolean keyExists = map.keySet().contains(word);
				int wordCnt = search.searchText(word, text).size();
			   // the word exists in the map, then update the entry with the new count
				if(keyExists){
					map.replace(word, map.get(word)+wordCnt); 
				}
				// the word does not exist in the map, then insert the new entry
				else{map.put(word, wordCnt);}
			}
		}
		return map;
	}

}
