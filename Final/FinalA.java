// CS 552, FINAL A, Ravela Smyth

import java.util.*;
import java.io.*;

public class FinalA
{
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] arg)
	{
		double output[] = stats();
		System.out.print("Min: " + output[0] + "   Max:" + output[2] + "    Avg:" + output[1]);
	}//MAIN

	public static double[] stats()
	{
		double current, triple_array[] = new double[3];
		int i = 0;

		System.out.println("Gimme some #'s: ");

		while(input.hasNextDouble())
		{
			current = input.nextDouble();
			if(i == 0){	triple_array[0] = current; triple_array[2] = current; }
			else if (triple_array[0] > current){triple_array[0] = current;}
			else if (triple_array[2] < current){triple_array[2] = current;}
			triple_array[1]+= current;
			i++;
		}

		triple_array[1] = triple_array[1] / i;
		return triple_array;
	} // STATS

}//FINAL A