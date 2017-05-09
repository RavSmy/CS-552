// CS 552, PT D, Ravela Smyth

import java.util.*;
import java.io.*;

public class PD{
	public static void main(String args[]){
			System.out.println( new Student("Joe", 1234, 3.5));
			System.out.println("--"+array_average()+"--");
	}

	public static double average(Student[] a){
			double average = 0;
			for(int i = 0 ; i < a.length ; i++)
				average += a[i].getGPA();
			return average / a.length;
	}//average

	public static double array_average(){
			double average = 0;
			Student students[] = new Student[3];

			students[0] = new Student("Joe", 1234, 2);
      		students[1] = new Student("Rav", 2345, 4);
      		students[2] = new Student("Bob", 9999, 3);

			return average(students);
	}

}//D


class Student {

	private String name;
	private int student_number;
	private double GPA;

   //Constructor method
   public Student(String nameVal, int numberVal, double gpaVal)
   {
	   if(gpaVal < 0 || gpaVal > 4 || numberVal < 1000 || numberVal > 9999)
		   {   System.out.println("Out of bounds!");  System.exit(1);   }

		name = nameVal;
		student_number = numberVal;
		GPA = gpaVal;
   }

   //Mutator methods
   public Student setGPA(double gpa)
   {
	    if(gpa < 0 || gpa > 4)
		   {   System.out.println("Out of bounds!");  System.exit(1);   }

		Student student_new = new Student(name, student_number, gpa);
		return student_new;
	}

   //Accessors methods
   public String getName()  {return name;}
   public int getNumber()   {return student_number;}
   public double getGPA()   {return GPA;}


   //toString

   public String toString(){
	   return name+"--"+student_number+"--"+GPA;
	   }

 }

