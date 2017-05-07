import java.io.*;
import java.util.*;

public class PracA{

	public static Scanner sc = new Scanner(System.in);
     
	public static void main(String[] args){
		double average = 0 ; 
		int num_input = 0;

		while(sc.hasNextDouble()){
			average+=sc.nextDouble();
			num_input++;
		}	
		
		System.out.println(num_input > 0 ? average/num_input : "No Data!");
	}//main

 

}
