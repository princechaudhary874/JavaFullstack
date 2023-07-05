/*3. Write a program that starts with the string variable first set to your first name and the string variable last
set to your last name. Both names should be all lower-case. Your program should then create a new
string that contains your full name in pig latin with the first letter capitalized for the first and last name.
Use only the pig latin rule of moving the first leƩer to the end of the word and adding “ay.” Output the
pig laƟn name to the screen. Use the substring and toUpperCase methods to construct the new name.
For example, given
first = "walt";
last = "savitch";
the program should create a new string with the text “Altway Avitchsay” and print it.*/

package core_java_assignment;

import myLibrary.BasicIO;

public class PigLatin {
	public static void main(String[] args) {
		//Declare
		String firstName;
		String upperF1;
		String splitF1;
		String concatF1;
		String remainingF1;
		String lastName;
		String lowerL1;
		String splitL1;
		String concatL1;
		String remainingL1;
		
		
		try {
			//input
			BasicIO.printMessage("Enter your first name in lower case : ");
			firstName=BasicIO.readString();
			BasicIO.printMessage("Enter your last name in lower case : ");
			lastName=BasicIO.readString();
			//process
			//pig Latin of first name
			upperF1=firstName.substring(1, 2).toUpperCase();//second letter of first name is changed into upper case
			splitF1=firstName.substring(0,1);//first letter of first name is taken
			remainingF1=firstName.substring(2, firstName.length());//letter except first and second letter of first name is taken
			//concatF1=upperF1+remainingF1+splitF1+ ay
			concatF1=upperF1.concat(remainingF1).concat(splitF1).concat("ay");
			
			//pig Latin of last name
			lowerL1=lastName.substring(1, 2).toUpperCase();//second letter of last name is changed into upper case
			splitL1=lastName.substring(0,1);//first letter of last name is taken
			remainingL1=lastName.substring(2, lastName.length());//letter except first and second letter of second name is taken
			//concatF1=upperF1+remainingF1+splitF1+ ay
			concatL1=lowerL1.concat(remainingL1).concat(splitL1).concat("ay");
			//output
			BasicIO.printMessage("Pig Latin of first name : ",concatF1);
			BasicIO.newLine();
			BasicIO.printMessage("Pig Latin of last name : ",concatL1);
			
		} catch (Exception ex) {
			BasicIO.printMessage("Error : ",ex.getMessage());
		}
	}
}
