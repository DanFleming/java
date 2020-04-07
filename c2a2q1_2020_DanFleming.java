

import java.util.Scanner;
import java.util.regex.Pattern;


public class c2_a2_q1_2020_DanFleming {

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		double total = 0;
		String lcase;
		String upcase;
		Scanner sc = new Scanner(System.in);


		System.out.println("Please enter three letters");	
		while(true) {
			String az = sc.nextLine();
			int x = az.length();


			//if input contains a number or has less than 3 characters

			if(!Pattern.matches("[a-zA-Z]+",az) || x < 3) { 	

				System.out.println("Invalid entry. Please try again.");
				sc.hasNext();
			} 

			//Previous conditions met:
			else if(Pattern.matches("[a-zA-Z]+",az) && x == 3)	{



				//defining different values for upper and lower case characters
				//Separating into substrings to make this easier
				lcase = az.replaceAll("[A-Z]", "");
				upcase = az.replaceAll("[^A-Z]", "");

				//lower case values

				for(int i = 0; i < lcase.length(); i++) {
					if (lcase.charAt(i) >= 'a' && lcase.charAt(i) <= 'z') {
						total += (int)lcase.charAt(i) - ((int)'a' - 1);
					}
				}
				//upper case values
				for(int i = 0; i < upcase.length(); i++) {
					if (upcase.charAt(i) >= 'A' && upcase.charAt(i) <= 'Z') {
						total += (int)upcase.charAt(i) - ((int)'A' - 101);
					}
				}


				//if modulus of the total divided by 5 is 0, then the total is a multiple of 5
				double confirm = (total % 5);
				while(true) {
					if (confirm != 0) {

						total = 0;


						System.out.println("Password incorrect. Please try again.");

						sc.hasNext();

					}


					else {
						System.out.println("You have entered " + az);
						System.out.println("The total value is " + total);
						System.out.println("Password unlocked!");


						break;
					}

					break;		} 

			}

		}
	}

}


