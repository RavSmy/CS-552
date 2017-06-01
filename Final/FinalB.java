// CS 552, FINAL B, Ravela Smyth

import java.util.*;
import java.io.*;

public class FinalB
{

	public static void main(String[] arg)
	{
		int a[] = {1,2,3,4,5,6,7}, b[] = {1,5,7,8}, c[] = {8,9}; int d[] = concat(a, b, c); int e[] = intersect(a,b);
		for(int i = 0 ; i < d.length; i++)
			System.out.println(d[i]);
		for(int i = 0 ; i < e.length; i++)
			System.out.println(e[i]);
	}//MAIN

	public static int[] concat(int[] a, int[] b, int[] c)
	{
		int concatinated[] = new int[a.length + b.length + c.length];
		for(int i =0; i < a.length; i++) concatinated[i] = a[i];
		for(int i =0; i < b.length; i++) concatinated[i+a.length] = b[i];
		for(int i =0; i < c.length; i++) concatinated[i+b.length+a.length] = c[i];
		return concatinated;
	}//CONCAT

	public static int[] intersect(int[] a, int[] b)
	{
		ArrayList<Integer> inter = new ArrayList<Integer> ();

		for(int i = 0 ; i < a.length; i++)
			if (found(a[i], b) == 1)
				inter.add(a[i]);
		int intersecting[] = convert(inter);
		return intersecting;
	}//INTERSECT

	public static int found(int n, int b[])
	{
		for(int i = 0 ; i < b.length; i++) if(n == b[i]) return 1;
		return 0;
	}//FOUND

	public static int[] convert(ArrayList<Integer> ints)
	{
		int output[] = new int[ints.size()];
		for(int i = 0 ; i < ints.size(); i++) output[i] = ints.get(i);
		return output;
	}//CONVERT

}//FINAL B