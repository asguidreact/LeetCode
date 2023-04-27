package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	public static boolean canConstruct(String ransomNote, String magazine)
	{
		Map<Character, Integer> map = new HashMap<>();
		for(char c : magazine.toCharArray())
		{
			int count = map.containsKey(c) ? map.get(c) + 1 : 1;
			map.put(c, count);
			//System.out.println(count);
		}
		
		for(char c: ransomNote.toCharArray())
		{
			int newCount = map.containsKey(c) ? map.get(c) - 1 : - 1;
			 if (newCount == -1) 
				 return false;
		     map.put(c, newCount);
			
			
			
			
		}
		
		
		
		return true;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	RansomNote r = new RansomNote();
			boolean result = canConstruct("aa","aab");
			System.out.println(result);
	}

}
