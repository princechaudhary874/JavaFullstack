/*2. The video game machines at your local arcade output coupons according to how well you play the game.
You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to
gumballs. Write a program that defines a variable iniƟally assigned to the number of coupons you win.
Next, the program should output how many candy bars and gumballs you can get if you spend all of your
coupons on candy bars first, and any remaining coupons on gumballs.
*/ 
package core_java_assignment;

import myLibrary.BasicIO;

public class Coupon {

	public static void main(String[] args) {
		//Declare
		int coupon;
		int candyBars;
		int gumballs;
		int remaining;
		try {
			//input
			BasicIO.printMessage("Enter your coupon won in game : ");
			coupon=BasicIO.readInt();//assign coupon
			//processing
			candyBars=coupon/10;//redeem candyBars
			remaining=coupon%10;//remaining coupons
			gumballs=remaining/3;//redeem gumballs
			System.out.println("You can redeem "+candyBars+" candy bars first .");
			System.out.println("You can redeem "+gumballs+" gumballs for remaining coupon.");
			
		} catch (NumberFormatException nfe) {
			BasicIO.printMessage("Error : ",nfe.getMessage());
		}catch(Exception ex) {
			BasicIO.printMessage("Error  : ",ex.getMessage());
		}
	}

}
