// CS 552 Ravela Smyth HW #2

import java.util.function.Function;
import java.util.Scanner;

public class HW2{

	public static void main(String[] args){

				print("SHOW: ");
		        show( new int[]{1,2,5,2,1} );

				print("REVERSE: ");
		        show(reverse(new int[]{3,4,4,3,1,8}));

				print("THE LARGER ARRAY IS: ");
		        show(max(new int[]{1,1,1,1,1}, new int[]{2,2,2}));

				print ("SAME?: ");
		        if (allSame(new int[]{1,1,1,1})){ println("ALL SAME");}
		        	else {println("NOT ALL SAME");}
		        if (allSame(new int[]{2,1,1,1})){ println("ALL SAME");}
		        	else {println("NOT ALL SAME");}
		        if (allSame(new int[]{1,1,1,2})){ println("ALL SAME");}
		        	else {println("NOT ALL SAME");}

				print ("DIFFERENT?: ");
		        if (allDifferent(new int[]{1,1,1,1})){ println("ALL DIFFERENT");}
		        	else {println("NOT ALL DIFFERENT");}
		        if (allDifferent(new int[]{2,1,1,1})){ println("ALL DIFFERENT");}
		        	else {println("NOT ALL DIFFERENT");}
		        if (allDifferent(new int[]{1,1,1,2})){ println("ALL DIFFERENT");}
		        	else {println("NOT ALL DIFFERENT");}

				print ("INCREASING?: ");
		        if (increasing(new int[]{1,1,5,0})){ println("INCREASING");}
		        	else {println("NOT INCREASING");}
		        if (increasing(new int[]{1,1,3,4})){ println("INCREASING");}
		        	else {println("NOT INCREASING");}

				print ("YOUR ARRAY WITHOUT ZEROS: ");
		        show(nonzero(new int[]{1,0,0,0,2,1,3,0,0,2}));

				print ("YOUR ARRAY WITHOUT CONSECUTIVE REPEATS: ");
		        show(withoutRepeats(new int[]{1,1,1,5,5,1,6,6}));

				print ("STATS: ");
		        showdouble(stats(new double[]{1,1,1,1,1}));

				print ("NEEDLE IN HAYSTACK: ");
		        if(find("hello", new String[]{"helllo","helloo","hello"}) != -1){println("FOUND!");}
		        	else {println("NOT FOUND!");}
		        if(find("hello", new String[]{"helllo","helloo","hellllo"}) != -1){println("FOUND!");}
		        	else {println("NOT FOUND!");}

				print ("CONCATENATION: ");
				println(concat(new String[]{"hello", "how", "are", "you"}));

		}

/* Print functions for coder*/
	public static void println(String a){
		System.out.println(a);
		}
	public static void print(String a){
		System.out.print(a);
		}


	public static void show( int a[] ){
		if (a.length==0){println("{}");}
		else for (int i=0; i<=a.length;i++)
				print(i==0 ? ("{"+a[i]) : (i==a.length ? "}\n" : ("," + a[i])));

		}

/* Printing for doubles for one of the double functions*/
	public static void showdouble( double a[] ){
			if (a.length==0){println("{}");}
			else for (int i=0; i<=a.length;i++)
				print(i==0 ? ("{"+a[i]) : (i==a.length ? "}\n" : ("," + a[i])));
			}


	public static  int[] reverse( int a[] ){
		int holder;
		for (int i=0;i<(a.length /2);i++){
				holder = a[i];
				a[i]=a[(a.length -1-i)];
				a[(a.length -1-i)] = holder;
			}
		return a;
		}


	public static int[] max( int[] a, int[] b ){
		int output[];
		output = (a.length>b.length ? a : b);
		return output;
		}


	public static boolean allSame( int[] a ){
		if(a.length==0|| a.length==1){return true;}
		int i=0, holder=a[i];
		for(i=0; i<a.length; i++){
				if (holder != a[i])
					return false;
			}
		return true;
		}


	public static boolean allDifferent( int[] a ){
		return (allSame(a) ? false : true);
		}


	public static boolean increasing( int[] a ){
		if ((a.length == 0) || (a.length == 1)) {return true;}
		for(int i=0, holder=a[i]; i<a.length;i++){
				if (holder>a[i])
					return false;
			}
		return true;
		}


	public static int[] nonzero( int[] a ){
		int count = 0;
		for (int i=0;i<a.length;i++){
				if (a[i] != 0)
					count++;
			}
		int array[]=new int[count];
		for (int i=0, j=0;i<(a.length);i++){
				if (a[i] != 0){
					array[j]=a[i];
					j++;}
			}
		return array;
		}


	public static int[] withoutRepeats( int[] a ){
		if (a.length==0) return a;
		int count = 1;
		for (int i=1;i<a.length;i++){
				if (a.length !=0){
					if (a[i] != a[i-1])
						count++;}
			}
		int array[]=new int[count]; array[0] = a[0];
		for (int i=1, j=1; i<a.length;i++){
				if (a[i]!= a[i-1]){
					array[j]=a[i];
					j++;}
			}
		return array;
		}


	public static double[] stats( double[] a ){
		if (a.length==0) return a;
		double output[] = new double[5];
		output[4]=1; output[0]=output[3]=a[0];output[3]=0;
		for(int i=0; i<a.length ; i++){
				if (output[0]>a[i]){output[0]=a[i];}
				else if (output[2]<a[i]){output[2]=a[i];}
				output[3] += a[i];
				output[4] *= a[i];
			}
		output[1] = (output[3] / 2.0);
		return output;
		}


	public static String concat( String[] a ){
		String output=a[0];
		for (int i=1; i<a.length;i++)
				output += a[i];
		return output;
		}


	public static int find( String needle, String[] haystack ){
		for (int i=0;i<haystack.length;i++)
				if (needle == haystack[i]){ return i;};
		return -1;
		}


}