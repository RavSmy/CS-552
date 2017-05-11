//Ravela Smyth, CS 552, Midterm 1-A, 5/10/2017
import java.util.*;
import java.io.*;

public class MidtermA
{
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[])
	{
		System.out.println("Input your numbers, terminated by a non-number: ");

		ArrayList<Double> numbers = new ArrayList<Double>();

		while(scanner.hasNextDouble()) numbers.add(scanner.nextDouble());

		System.out.println("Even Average is: " + even_average(numbers));

	}

	public static double even_average(ArrayList<Double> numbers)
	{
		double average = 0, evens = 0;
		for(int i = 0 ; i < numbers.size() ; i++)
			if(numbers.get(i) > 0){	average+= numbers.get(i); 	evens++;	}
		return (evens > 0 ? average / evens : 0);
	}//even
}