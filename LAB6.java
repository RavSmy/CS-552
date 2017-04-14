// CS 552, LAB #6, Ravela Smyth

import java.util.*;
import java.io.*;

public class L4{
	public static Scanner input = new Scanner(System.in);
	public static void main(String args[]){

		BufferedReader reader = null;
		BufferedWriter writer = null;

		try{

		String inputfile = input.nextLine();
		reader = new BufferedReader(new FileReader(inputfile));
		String outfile = input.nextLine();
		writer = new BufferedWriter (new FileWriter(outfile));


		ArrayList<String> lines = new ArrayList<String>();
		String currentline = reader.readLine();

		while (currentline != null){
			lines.add(currentline);
			currentline = reader.readLine();

		}


				for (int i = 0; i < lines.size(); i++){
					System.out.println(i);
					int STRPOS = lines.size()-1-i;
					int STRLEN = lines.get(STRPOS).length();

					char thisline[] = new char[STRLEN];

		 			for (int j = 0 ; j < STRLEN; j++){
						char CHARPOS = lines.get(STRPOS).charAt(lines.get(STRPOS).length() - j - 1);
							if(Character.isUpperCase(CHARPOS)){
								thisline[j] = Character.toLowerCase(CHARPOS);
								}
							else {
								thisline[j] = Character.toUpperCase(CHARPOS);
								}
						}//for
					writer.write(thisline);
					writer.newLine();

					}//for

		writer.close();
		reader.close();

		}
			catch (IOException error){
						System.out.println("Error");
						System.exit(1);
				}

	} //main


}