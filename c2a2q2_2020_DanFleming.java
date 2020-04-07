import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class c2_a2_q2_2020_DanFleming {

	public static void main(String[] args) throws FileNotFoundException {


		//telling where to get/send information
		String inFile = "input.txt";
		String outFile = "output.txt";

		try {
			File input = new File("input.txt");		
			Scanner sc = new Scanner(input);
			PrintWriter out = new PrintWriter(outFile);
			String start = "";
			String reverse = "";

			//using while loop to ensure program scans each line
			while(sc.hasNextLine()) {

				//the next line is to be scanned and added to the string
				start = start + "\n" + sc.nextLine();


			}

			//creating an array to be split at each new line
			String[] base = start.split("\\n");

			//loop to print last line to first line
			for (int i = base.length -1; i >=0; i--) {
				out.println(base[i]);

			}
			sc.close();
			out.close();

			//Exception handling
		} catch(Exception e) {
			System.out.println("File not found");
		}

	}



}
