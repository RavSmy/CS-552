//Ravela Smyth, CS 552, Midterm 1-C, 5/10/2017

import java.io.*;
import java.util.*;
import java.math.*;

public class MidtermC
{
	public static void main(String args[])
	{
		int[] a = new int[]{1,-3,2};
		System.out.println(square(a));
		for(int i = 0 ; i < a.length; i++)
			System.out.println(a[i]);
		int[] b = (concat(new int[]{1,2,3}, new int[]{4,5,6,7,8}));
		for(int i = 0 ; i < b.length; i++)
			System.out.println(b[i]);
	}

	public static int square(int[] a)
	{
		int largest=0;
		for(int i=0; i< a.length ; i++)
		{
			a[i] *= a[i];
			if(Math.abs(a[i]) > largest)
				largest = a[i];
		}
		return largest;
	}

	public static int[] concat(int[] a, int[] b)
	{
		int[] total = new int[a.length+b.length];
		int k = 0;
		for(int i =0; i < a.length; i++)
			total[k++] = a[i];
		for(int i =0; i < b.length; i++)
			total[k++] = b[i];
		return total;
	}

}