 // CS 552, HW #4, Ravela Smyth

import java.util.*;

public class HW4 {

	 public static void main(String[] args){

			System.out.println(numberOf(new Character('s'), new String("sososSs")));
			System.out.println(rotateString(new String("Pineapple"), new Integer(0)));
			if(digitSequence(new String("-9999999999999999999999999999999999999999999999999999999")) == true){System.out.println("yes");}
			System.out.println(compareTo(new String("adf"),new String("10")));
			loveHate();
		 }

	 public static int numberOf( char c, String s ){
		 int i = 0, counter = 0;
		 do {
			 if(s.charAt(i) == c)
			 	counter++;
			 i++;
			 } while(i < s.length());

		 return counter;
		 }//numberOf


	public static String rotateString( String s, int n ){
			String output = s.concat(s);
			int rot = n%s.length();

			if (n > 0){
				output = output.substring(s.length()-rot , (s.length() * 2)-rot);
				}
			else {
				rot *= -1;
				output = output.substring(rot , s.length() + rot);
				}

			 return output;
		}//rotateString


	public static boolean digitSequence( String s ){

		int i = 0;
		if (s.length() == 0)
			return false;
		else if(s.charAt(i) == '-')
			i++;

		while (i < s.length()){
			if (s.charAt(i) < '0' || s.charAt(i) > '9' )
				return false;
			i++;
			}
		return true;
		}//digitSequence

	public static int compareTo( String digitSequence0, String digitSequence1 ) {


		if(!digitSequence(digitSequence0) || !digitSequence(digitSequence1)){
			System.out.println("Your digit is not a digit!"); System.exit(0); }

		if (Integer.parseInt(digitSequence0) > Integer.parseInt(digitSequence1))
			return 1;
		else if (Integer.parseInt(digitSequence0) < Integer.parseInt(digitSequence1))
			return -1;

		return 0;


		}//compareTo

	public static void loveHate(){
		int i = 1, hate = 1;

		Scanner scanner = new Scanner(System.in);

		String s;

		while(!(s = scanner.nextLine()).equals("")){
			i =1; hate = 1;
			while ( i < s.length()) {
					if (s.charAt(i) == s.charAt(i-1)){
						hate = 0; break;}
					i++;
				}
			System.out.println(hate == 0 ? "I love " + s + "!": "I hate " + s + "!");
			}
		}//lovehate

}