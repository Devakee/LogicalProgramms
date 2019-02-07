package demoPackage;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharUsingHasmap {

	public static void main(String[] args) 
	{
		String str="JavaJ2EE";
		char[] strArray=str.toCharArray();
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		for (char c : strArray) {
			
			if(charCountMap.containsKey(c))
			{
				System.out.println(charCountMap.put(c, charCountMap.get(c)+1));
			}
			else
			{
				System.out.println(charCountMap.put(c, 1));
			}
		}
		
		
		Set<Character> charsInString = charCountMap.keySet();
		 for (Character ch : charsInString)
	        {
	            if(charCountMap.get(ch) > 1)
	            {
	                //If any char has a count of more than 1, printing it's count
	                System.out.println(ch +" : "+ charCountMap.get(ch));
	            }
	        }
	    }

	

}
