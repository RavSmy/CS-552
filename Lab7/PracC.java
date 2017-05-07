import java.io.*;
import java.util.*;

public class PracC{

	public static Scanner sc = new Scanner(System.in); 
     
	public static void main(String[] args){
		System.out.println(maximum(new int[]{10, 11, 12, 13, 12, 13, 1234}));
		System.out.println(sum(new int[][]{{ 1,2,3,4},{ 1,2,2,1,1}}));
	} //main

 	
	public static int maximum(int[] a){
		int max = 0;
		for(int i = 1 ; i < a.length; i++)
			if(a[max] < a[i]) max = i;
		return max;
	}

	public static int sum(int[][] a){
		int sum = 0;
		for(int i = 0 ; i <a.length ; i++)
			for(int j = 0 ; j < a[i].length; j++)
				sum += a[i][j];
		return sum;
	} 

	public static int[] even(int[] a){
		ArrayList evenlist = new ArrayList ();
        j=0;
        for (int i =0 ; i < a.length; i++)
            if(a[i]%2 == 0){
                evenlist.add(a[i]); j++;}    
        
        int even[]=evenlist.toArray(new int[j]);
        return even;    
	}
	
}

