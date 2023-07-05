/*1. Body Mass Index (BMI) helps in specifying the weight category a person belongs to, depending on their
body weight. BMI is esƟmated using the following formula:
					BMI=weight in kilograms/(height in meters*height in meters)
Write a program that calculates and outputs the BMI. Assume various input values wherever required.
*/
package core_java_assignment;

import myLibrary.BasicIO;

public class BMI {

	public static void main(String[] args) {
		// Delcare
		double weight;
		double height;
		double bmi;
		try {
			//input
			BasicIO.printMessage("Enter your weight in kilograms : ");
			weight = BasicIO.readDouble();//assign weight
			BasicIO.printMessage("Enter your height in meters : ");
			height = BasicIO.readDouble();//assign height
			//process
			bmi = weight / Math.pow(height, 2);//compute BMI
			//output
			System.out.println("Your BMI : "+ bmi);

		} catch (NumberFormatException nfe) {
			BasicIO.printMessage("Error : ", nfe.getMessage());

		}catch(Exception ex) {
			BasicIO.printMessage("Error : ",ex.getMessage());
		}

	}

}
