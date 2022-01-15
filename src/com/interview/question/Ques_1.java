package com.interview.question;

import java.util.HashSet;

public class Ques_1 {

	public static void main(String[] args) {
		String str="acbcdab";
		String longSubString=longestSubString(str);
		System.out.println(longSubString);

	}

	private static String longestSubString(String str) {
		
		HashSet<Character> set=new HashSet<Character>();
		String longesttillNow="";
		String longestOverAll="";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(set.contains(c)) {
				longesttillNow="";
				set.clear();
			}
			set.add(c);
			longesttillNow+=c;
			if(longesttillNow.length() > longestOverAll.length()) {
				longestOverAll=longesttillNow;
			}
			
		}
		return longestOverAll;
		
	}

}
