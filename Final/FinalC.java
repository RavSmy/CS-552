// CS 552, FINAL C, Ravela Smyth

import java.util.*;
import java.io.*;

public class FinalC
{

	public static void main(String[] arg)
	{
		String[] s = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String d = concat(s, 'e');
		String e = "AABb82";
		System.out.println(d);
		System.out.println(ok(e));
	}//MAIN

	public static String concat(String[] s, char special)
	{
		ArrayList<String> concatenated = new ArrayList<String>();
		for(int i = 0 ; i < s.length; i++)
			if( s[i].indexOf(special) >= 0) concatenated.add(s[i]);
		return String.join("", concatenated);
	}//CONCAT

	public static boolean ok(String s)
	{
		int upper=0, lower=0, digit=0;
		for(int i =0; i < s.length(); i++)
		{
			if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') upper++;
			else if(Character.isDigit(s.charAt(i))) digit++;
			else if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z') lower++;
		}
		return(upper == 2 && lower ==2 && digit == 2 ? true : false);
	}//OK

}//FINAL C
