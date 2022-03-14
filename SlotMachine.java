/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 	
 * 	Programmer: Samuel Usherenko
 * 
 * 	Date: March 14, 2022
 * 
 *	Description: This Program Simulates a slot machine
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *	Features:
 * 
 * 1. How much money they will be gambling 
 * with (and storing value)
 * 
 * 2. Randomize numbers that correlate 
 * with "items" on slot machine
 * 
 * 3. Choose 3 items to determine multiplier
 * 		- If 0 or 1 match, gamble = 0
 * 		- If 2 match, gamble = 2x
 * 		- If 3 match, gamble = 3x
 * 
 * 4. Prompt user if they wish to continue to play or 
 * display stored value	
 * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
import java.util.*;
public class SlotMachine
{
	public static void main(String [] args) 
	{
		//Generate random values
		Random value = new Random();
		
		//User input
		Scanner keyboard = new Scanner(System.in);
		
		// To play game
		int repeat;	 // Read playGame: "y" or "n"
		int gamble;		// To hold user's gamble amount
		int total = 0;		// To hold user's total winnings
		
		// Create slots
		String slot1 = ""; 
		String slot2 = ""; 
		String slot3 = "";
		
		// Create random number holders for slots
		int random1;
		int random2;
		int random3;
		
		// Welcome User and get input
		System.out.println("Welcome to Sam's Slot Machine");
		System.out.println("Spin the Slots! Press '1' to Pull, '2' to Quit");
		repeat = keyboard.nextInt();
		
		if (repeat == 1)
		{
		do
		{			
			// Promt User for wager and store input
			System.out.print("How much will you be gamling? $");
			// Get user input
			gamble = keyboard.nextInt();
			
			// Generate Random values for slots
			random1 = value.nextInt(5);
			random2 = value.nextInt(5);
			random3 = value.nextInt(5);
			
			// Change random1 to an item
			if (random1 == 0)
			{
				slot1 = "Cherries";
			}
			if (random1 == 1)
			{
				slot1 = "Oranges";
			}
			if (random1 == 2)
			{
				slot1 = "Plums";
			}
			if (random1 == 3)
			{
				slot1 = "Bells";
			}
			if (random1 == 4)
			{
				slot1 = "Melons";
			}
			if (random1 == 5)
			{
				slot1 = "Bars";
			}
			// Change random1 to an item
			if (random2 == 0)
			{
				slot2 = "Cherries";
			}
			if (random2 == 1)
			{
				slot2 = "Oranges";
			}
			if (random2 == 2)
			{
				slot2 = "Plums";
			}
			if (random2 == 3)
			{
				slot2 = "Bells";
			}
			if (random2 == 4)
			{
				slot2 = "Melons";
			}
			if (random2 == 5)
			{
				slot2 = "Bars";
			}
			
			// Change random3 into an item
			if (random3 == 0)
			{
				slot3 = "Cherries";
			}
			if (random3 == 1)
			{
				slot3 = "Oranges";
			}
			if (random3 == 2)
			{
				slot3 = "Plums";
			}
			if (random3 == 3)
			{
				slot3 = "Bells";
			}
			if (random3 == 4)
			{
				slot3 = "Melons";
			}
			if (random3 == 5)
			{
				slot3 = "Bars";
			}
			// Output Values
			System.out.println("-----------------------------------------------");
			System.out.println("|" + slot1 + " " + "|" + slot2 + " " + "|" + slot3 + " " + "|");
			System.out.println("-----------------------------------------------");
			
			// If statements to determine multiplier
			if (slot1 == slot2 && slot1 == slot3)
			{ // Multiply Gamble by x3
				total = total + (gamble * 3);
				System.out.println("You won 3x your gamble! Your total is: $" + total);
			}
			else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3)
			{ // Multiply Gamble by x2
				total = total + (gamble * 2);
				System.out.println("You won 2x your gamble! Your total is: $" + total);
			}
			else
			{ // Multiply Gamble by 0
				total = total + (gamble * 0);
				System.out.println("You won $0. Your total is: $" + total);
			}
			//Ask user if they want to keep playing
			System.out.println("-----------------------------------------------");
			System.out.print("Want to spin again? Press '1' to Pull, '2' to Quit: ");
			// Get user input
			repeat = keyboard.nextInt();
		} 	// Keep loop while user wants to play
		while (repeat == 1);
		}
		if (repeat == 2)
		{	// Print total won
			System.out.println("Your take home winnings are : $" + total);
		}
	}
}
