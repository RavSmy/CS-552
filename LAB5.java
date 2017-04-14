// CS 552, LAB 5, Ravela Smyth

import java.util.*;
import java.io.*;


public class LAB5{
	public static void main(String arg[]){

		try{
			f();
			System.out.println("A ok");
			}
		catch (ABC1Exception a){System.out.println("ABC1 catastrophe");}
		catch (ABC2Exception b){System.out.println("ABC2 catastrophe");}
		catch (ABCException c){System.out.println("ABC catastrophe");}

		}
	public static void f() throws ABCException {

		Random rand = new Random();
		int rand_num = rand.nextInt(4);

		if (rand_num == 0){throw new ABCException();}
		else if (rand_num == 1){throw new ABC1Exception();}
		else if(rand_num == 2){throw new ABC2Exception();}

		}
	}


class ABCException extends Exception{}

class ABC1Exception extends ABCException{}

class ABC2Exception extends ABCException{}