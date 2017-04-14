// CS 552, Ravela Smyth, LAB #2

import java.io.*;

public class LAB2{

	public static void main(String args[]) {

		if(anagram("hello", "olleh") == true){System.out.println("SAME!");}
			else {System.out.println("NOT SAME!");}
		if(anagram("hello", "llohe") == true){System.out.println("SAME!");}
			else {System.out.println("NOT SAME!");}

		}


	public static boolean anagram(String s1, String s2){
		 int firststring[] = track(s1);
		 int secondstring[] = track(s2);

		 for(int i=0; i < 26; i++){
		 		if (firststring[i] != secondstring[i])
		 			return false;
			}//for

		 return true;
		}

	public static int[] track(String stng){
		int[] tracker = new int[26];

		for(int i=0; i < stng.length() ; i++){
				tracker[stng.charAt(i) - 'a'] += 1;
			}//for

			return tracker;
		}//track


}