import java.util.HashMap;
import java.util.Map;

public class InterviewPractice {

public static boolean isAnagram(String s1, String s2){	
	if(s1.length() != s2.length()){
		return false;
	}
	Map <Character, Integer> map1 = new HashMap<Character, Integer>();

	//add all characters of string1 to map1, accounting for doubles in the map values
	for(int i = 0; i < s1.length(); i++){
		if(!map1.containsKey(s1.charAt(i))){//if map does not contain key, add it, place value as one
			map1.put(s1.charAt(i), 1);
		}
		else{//if map does contain key, update value +1, remove old pair, and add new updated pair
			int x = map1.get(s1.charAt(i)) + 1;
			map1.remove(s1.charAt(i));
			map1.put(s1.charAt(i), x);
		}
	}
	Map <Character, Integer> map2 = new HashMap<Character, Integer>();//creating second map for string2

	for(int i = 0; i < s2.length(); i++){//either length could work here
		if(map1.containsKey(s2.charAt(i))){//only care about this if the first map has the value, otherwise they arent Anagrams anyway :)
			if(!map2.containsKey(s2.charAt(i))){//if map2 doesnt contain a char from string2, add it
				map2.put(s2.charAt(i), 1);
			}
			else{//if map2 already has char from s2, then update value, remove old input and add updated input
				int x = map2.get(s2.charAt(i)) + 1;
				map2.remove(s2.charAt(i));
				map2.put(s2.charAt(i), x);
	
				if ( x > (map1.get(s2.charAt(i)))){ //make sure that the new value is not more then whats in s1, otherwise they arent anagrams :) 
					return false;
				}
			}	
		}
		else{
			return false;
		}
	}
	return true;//all tests passed
}

	public static void main(String [] args){
		
		if(isAnagram("aatc", "caat")){
			System.out.print("ANAGRAM!");
		}
		else{
			System.out.print("NOT ANAGRAM!");
		}
		
	}

}

