//Ravela Smyth, CS 552, Midterm 1-B, 5/10/2017

import java.io.*;
import java.util.*;

public class MidtermB
{
	public static void main(String args[])
	{
		System.out.println(smallestPrimeFactor(945));
		System.out.println(digits("asdfjka123dhsdkjfha&*(&#45678fasdf9aasdf"));
	}

	public static int smallestPrimeFactor(int n)
	{
		if(n%2 == 0) return 2;
		for(int i = 3 ; i < n/2 ; i++)
			if((n%i == 0) && (isPrime(i) == 0))
				return i;

		return n;
	}

	public static int isPrime(int n)
	{
		for(int i = 3 ; i < n/2 ; i++)
			if(n%i == 0)
				return 1;
		return 0;
	}

	public static String digits(String s)
	{
		String corrected="";
		for(int i = 0 ; i < s.length(); i++)
			if(s.charAt(i) >= '0' && s.charAt(i) <='9')
				corrected += s.charAt(i);
		return corrected;
	}

}