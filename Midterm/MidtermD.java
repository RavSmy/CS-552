//Ravela Smyth, CS 552, Midterm 1-D, 5/10/2017

import java.io.*;
import java.util.*;
import java.math.*;

public class MidtermD
{
	public static void main(String args[])
	{
		Student[] students = new Student[3];
		students[1] = new Student("Joe", 1234, 3.5);
		students[2] = new Student("BOb", 1234, 2.5);
		students[0] = new Student("Amy", 1234, 2);
		System.out.println(bOrBetter(students));
	}

	public static int bOrBetter(Student students[])
	{
		int howmany = 0 ;
		for(int i = 0 ; i < students.length; i++){
			if(students[i].getGPA() >=3) howmany++;}
		return howmany;
	}

}

class Student
{
	private String name;
	private int id;
	private double GPA;

	//Constructor
	public Student(String name, int id, double GPA)
	{	setName(name); setID(id); setGPA(GPA);	}

	//Accessor
	public String getName(){return name;}
	public int getID(){return id;}
	public double getGPA(){return GPA;}

	//Mutator
	public Student setName(String name){this.name = name; return this;}
	public Student setID(int id)
	{
		if(checkID(id) == 1){System.exit(1);}
		this.id = id; return this;
	}
	public Student setGPA(double GPA)
	{
		if(checkGPA(GPA) == 1){System.exit(1);}
		this.GPA = GPA; return this;
	}

	//Check Numbers
	public static int checkGPA(double GPA){return (GPA >= 0 && GPA <= 4 ? 0 : 1);}
	public static int checkID(int id){return (id >= 1000 && id <= 9999 ? 0 : 1);}

	//ToString
	public String toString(){
		   return name+"--"+id+"--"+GPA;
	   }
}