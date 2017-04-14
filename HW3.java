// CS 552 Ravela Smyth HW #3

import java.util.*;


public class HW3 {

	public static void main(String[] args){

			show(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
			show(reverse(new ArrayList<Integer>(Arrays.asList(1,2,3,4))));
			show(max(new ArrayList<Integer>(Arrays.asList(1,1,3,2)), new ArrayList<Integer>(Arrays.asList(1,2,2,4,4))));
			if (allSame(new ArrayList<Integer>(Arrays.asList(1,1,1,1)))) {System.out.println("SAME");}
			if (allDifferent(new ArrayList<Integer>(Arrays.asList(1,2,2,2)))) {System.out.println("DIFFERENT");}
			if (increasing(new ArrayList<Integer>(Arrays.asList(1,2,3,4)))) {System.out.println("INCREASING");}
			show(nonzero(new ArrayList<Integer>(Arrays.asList(1,0,0,2,0,3,0,0,0,4))));
			show(withoutRepeats(new ArrayList<Integer>(Arrays.asList(0,1,1,2,2,3,4,4))));
			showd(stats(new ArrayList<Integer>(Arrays.asList(2,1,1))));
			System.out.println(concat(new ArrayList<String>(Arrays.asList("sally","hello","jello"))));
			System.out.println(find("hello", new ArrayList<String>(Arrays.asList("hello","g","jello"))));
		}

	public static void show( ArrayList<Integer> a){
		if (a.size() == 0)
			System.out.print("{}\n");
		for(int i=0; i < a.size();i++)
			System.out.print(i==0 ? "{"+a.get(i)+"," : (i==(a.size()-1) ? a.get(i)+"}\n" : a.get(i)+","));
		}//show

	public static void showd( ArrayList<Double> a){
		if (a.size() == 0)
			System.out.print("{}\n");
		for(int i=0; i < a.size();i++)
			System.out.print(i==0 ? "{"+a.get(i)+"," : (i==(a.size()-1) ? a.get(i)+"}\n" : a.get(i)+","));
		}//show



	public static ArrayList<Integer> reverse( ArrayList<Integer> a ){
		ArrayList<Integer> output =new ArrayList<Integer>();
		int holder;
		for (int i = 0; i<a.size();i++)
			output.add(a.get(a.size()-i-1));
		return output;
		}//reverse

	public static ArrayList<Integer> max( ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> output =new ArrayList<Integer>();
		for (int i = 0 ; i < a.size() && i < b.size() ; i++)
			output.add(a.get(i) < b.get(i) ? b.get(i) : a.get(i) );
		return output;
		}//max

	public static boolean allSame( ArrayList<Integer> a){
		for (int i =1; i<a.size(); i++)
			if (a.get(i) != a.get(i-1))
				return false;
		return true;
		}

	public static boolean allDifferent( ArrayList<Integer> a){
		return (allSame(a)? false : true);
		}

	public static boolean increasing( ArrayList<Integer> a) {
		for (int i =1; i<a.size(); i++)
					if (a.get(i) < a.get(i-1))
						return false;
		return true;
		}

	public static ArrayList<Integer> nonzero( ArrayList<Integer> a){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i =0 ; i<a.size(); i++)
			if (a.get(i) != 0 )
				output.add(a.get(i));
		return output;
		}

	public static ArrayList<Integer> withoutRepeats( ArrayList<Integer> a){
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(a.get(0));
			for (int i =1 ; i<a.size(); i++)
				if (a.get(i) != a.get(i-1) )
					output.add(a.get(i));
			return output;
		}

	 public static ArrayList<Double> stats( ArrayList<Integer> a ){
		ArrayList<Double> output = new ArrayList<Double>();
		output.add((double)a.get(0)); output.add(1.0); output.add((double)a.get(0)); output.add(0.0); output.add(1.0);

		for (int i=0; i<a.size(); i++) {
			output.set(3, (double)(output.get(3) + a.get(i)));
			output.set(4, (double)(output.get(4) * a.get(i)));

			if (a.get(i) > output.get(2)){
				output.set(2, (double)a.get(i));}
			else if(a.get(i) < output.get(0)){
				output.set(0, (double)a.get(i));}
			}

		output.set(1, (output.get(3)/(double)(a.size())));

		return output;
		}

	public static String concat( ArrayList<String> a ){
		String output=a.get(0);
				for (int i=1; i<a.size();i++)
						output += a.get(i);
		return output;
		}

	public static int find( String needle, ArrayList<String> haystack ){

		for(int i =0 ; i< haystack.size(); i++)
			if (needle.equals(haystack.get(i)))
				return i;
		return -1;
		}

	}//main