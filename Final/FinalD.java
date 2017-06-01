// CS 552, FINAL D, Ravela Smyth

import java.io.*;
import java.util.*;
import java.math.*;

public class FinalD
{
	public static void main(String args[])
	{
		Employee[] employees = new Employee[3];
		employees[1] = new Employee("MEGhan", 123, 12341);
		employees[2] = new Employee("Julie", 125, 12341);
		employees[0] = new Employee("Amy", 125, 12341);
		System.out.println(duplicate(employees));
	}//MAIN

	public static boolean duplicate(Employee employees[])
	{
		for(int i = 0 ; i < employees.length; i++){
			for(int j = i+1 ; j < employees.length; j++){
				if(employees[i].getID() == employees[j].getID()) return true;}}
		return false;
	}//DUPLICATE

}//FINAL D

class Employee
{
	private String name;
	private int id;
	private double SALARY;

	//Constructor
	public Employee(String name, int id, double SALARY)
	{	setName(name); setID(id); setSALARY(SALARY);	}

	//Accessor
	public String getName(){return name;}
	public int getID(){return id;}
	public double getSALARY(){return SALARY;}

	//Mutator
	public Employee setName(String name){this.name = name; return this;}
	public Employee setID(int id)
	{
		if(checkID(id) == 1){System.exit(1);}
		this.id = id; return this;
	}
	public void setSALARY(double SALARY)
	{
		if(checkSALARY(SALARY) == 1){System.exit(1);}
		this.SALARY = SALARY;
	}

	//Check Numbers
	public static int checkSALARY(double SALARY){return (SALARY >= 0 && SALARY <= 1000000 ? 0 : 1);}
	public static int checkID(int id){return (id >= 100 && id <= 999 ? 0 : 1);}

	//ToString
	public String toString(){
		   return name+", "+id+": "+SALARY;
	   }

	//Double Salary?
	void doubleSalary(){
		if(checkSALARY(SALARY*2) == 1){System.exit(1);}
		this.SALARY = SALARY*2; }

}//EMPLOYEE