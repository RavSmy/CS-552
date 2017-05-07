import java.io.*;
import java.util.*;

public class PracB{

	public static Scanner sc = new Scanner(System.in);
     
	public static void main(String[] args){
		int n = 5; 
		System.out.println(prime_check(n) == 0 ? n + ": NOT PRIME": n + ": PRIME");
		triangle(n);
		System.out.println(n + "! = "+factorial(n));
		System.out.println(spouse("Mrs. ABC"));
	} //main

 	public static int prime_check(int i){
		for(int a = 3 ; a < i/2 ; a++){
			if(i%a == 0) return 0;		
		}
		return 1;
	}

	public static void triangle(int n){
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= i; j++)
				System.out.print(j == i ? "$\n" : "$");		
	} 

	public static long factorial(int n){
		int factorial = 1;
		for(int i = 1; i <=n; i++)
			factorial *= i;
		return factorial;			
	}

	public static String spouse(String name){
		return(name.startsWith("Mrs.") ? "Mr"+ name.substring(name.lastIndexOf('.')) :
			 			 "Mrs"+ name.substring(name.lastIndexOf('.')));	
	}
	
}

/*
public static boolean prime(int n) prime's job is to return whether n is a prime number. As you probably recall, a prime number is a number greater than 1 with no factors between 1 and the number itself. The 4 smallest prime numbers are 2, 3, 5, and 7. If you have a favorite algorithm for testing whether n is prime, you're welcome to use it; or, you're welcome to use the following algorithm:  If n is less than 4, then we're done: n is prime iff it's greater than1  Otherwise, if n is even then we're done: n isn't prime  Otherwise, for f taking on the values 3, 5, 7, 9, 11, ... {   If f is greater than n/f then we're done: n is prime   If n is divisible by f, then we're done: n is not prime  }
public static String spouse(String name)
*/
