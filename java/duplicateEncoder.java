/*
The goal of this exercise is to convert a string to a new string
where each character in the new string is "(" if that character appears only once in the original string, 
or ")" if that character appears more than once in the original string. 
Ignore capitalization when determining if a character is a duplicate.
*/

import java.util.*;

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    
    Hashtable<String, String> appearanceDict = new Hashtable<String, String>();
    String[] chars = word.split("");
 
    for (String ch: chars) {
      if (word.indexOf(ch) == word.lastIndexOf(ch)) {
        appearanceDict.put(ch, "(");      
      } else {
        appearanceDict.put(ch, ")");
      }
    }
    
    String wordToBeReturned = "";
    for (String ch: chars) {
      String parenthesisToBeAdded = appearanceDict.get(ch);
      wordToBeReturned = wordToBeReturned + parenthesisToBeAdded;
    }
    
    return wordToBeReturned;
  }
}