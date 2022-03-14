import java.util.*;
/**
This program allows the user to order a pizza.
*/
public class PizzaOrder 
{
	public static void main(String[] args)
	{
		// Create a Scanner object to read input.
	      Scanner keyboard = new Scanner (System.in);
	String firstName;			  // User's first name
	boolean discount = false;	  // Flag for discount
	double disCount = 0;		  // Discount for Owners
	int inches;					  // Size of the pizza
	char crustType;				  // For type of crust
	String crust = "Hand-tossed"; // Name of crust
	double cost = 10.99;          // Cost of the pizza
	final double TAX_RATE = .08;  // Sales tax rate
	double tax;					  // Amount of tax
	double pizzaCost;			  // Adjust cost for discount
	double total;			      // To calculate total cost
	char choice;				  // User's choise
	String input;				  // User input
	String toppings = "Cheese ";  // List of toppings
	int numberOfToppings = 0;     // Number of toppings
	
	// Prompt user and get first name.
	System.out.println("Welcome to Mike and " +
	                   "Diane's Pizza");
	System.out.println("---------------------------------");
	System.out.print("Enter your first name:  ");
	firstName = keyboard.nextLine();
	
	// Determine if user is eligible for discount by
	// having the same first name as one of the owners.	
	// ADD LINES HERE FOR TASK #1
	String mike;
	mike = "Mike";		
	String diane;
	diane = "Diane";	
	if (firstName.equalsIgnoreCase(mike) || firstName.equalsIgnoreCase(diane))
	{
		discount = true;
	}		
	
	// Prompt user and get pizza size choice.
	System.out.println("-----------------------------------------------");
	System.out.println("Pizza Size   (inches)	 	 	 Cost");
	System.out.println(" 		10 			$10.99");
	System.out.println(" 		12 			$12.99");
	System.out.println(" 		14 			$14.99");
	System.out.println(" 		16 			$16.99");
	System.out.print("What size pizza would you like? ");
	inches = keyboard.nextInt();
	// Set price and size of pizza ordered.
	// ADD LINES HERE FOR TASK #2
	
	// While loop makes sure user inputs 10, 12, 14 or 16
	while ((inches < 10) || (inches > 16) || (inches == 13) || (inches == 15))
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Sorry this size is not an option,"
				+ " please choose 10, 12, 14 or 16 inch pizza.");
		System.out.print("What size pizza would you like? ");
		System.out.println();
		inches = keyboard.nextInt();
	}
	if (inches == 10)
	{
		cost = 10.99f;
	}
	if (inches == 12)
	{
		cost = 12.99f;
	}
	else if (inches == 14)
	{
		cost = 14.99f;
	}
	else  if (inches == 16)
	{
		cost = 16.99f;
	}
	// Consume the remaining newline character.
	keyboard.nextLine();
	// Prompt user and get crust choice.
	System.out.println("-----------------------------------------------");
	System.out.println("What type of crust " +
	                   "do you want? ");
	System.out.println();
	System.out.println("(H)Hand-tossed");
	System.out.println("(T) Thin-crust");
	System.out.println("(D) Deep-dish ");
	System.out.print("Enter H, T, or D): ");             
	input = keyboard.nextLine();
	crustType = input.charAt(0);
	
	// Set user's crust choice on pizza ordered.
	// ADD LINES FOR TASK #3
	switch (input)
	{
	case "H":	
	case "h":
		crust = "Hand-tossed";
	break;	
	
	case "T":	
	case "t":
		crust = "Thin-crust";
	break;
	
	case "D":	
	case "d":
		crust = "Deep-dish";
	break;
	}	
	
	// Prompt user and get topping choices one at a time.
	System.out.println("-----------------------------------------------");
	System.out.println("All pizzas come with cheese.");
	System.out.println();
	System.out.println("Additional toppings are " +
	                   "$1.25 each, choose from:");
	System.out.println("Pepperoni, Sausage, " +
	                   "Onion, Mushroom");
	System.out.println("-----------------------------------------------");
	
	// If topping is desired,
	// add to topping list and number of toppings
	System.out.print("Do you want Pepperoni? (Y/N): ");
	System.out.println();
	input = keyboard.nextLine();
	choice = input.charAt(0);
	if (choice == 'Y' || choice == 'y')
	{
	   numberOfToppings += 1;
	   toppings = toppings + "Pepperoni ";
	}
	System.out.println("-----------------------------------------------");
	System.out.print("Do you want Sausage? (Y/N): ");
	System.out.println();
	input = keyboard.nextLine();
	choice = input.charAt(0);
	if (choice == 'Y' || choice == 'y')
	{
	   numberOfToppings += 1;
	   toppings = toppings + "Sausage ";
	}
	System.out.println("-----------------------------------------------");
	System.out.print("Do you want Onion? (Y/N): ");
	System.out.println();
	input = keyboard.nextLine();
	choice = input.charAt(0);
	if (choice == 'Y' || choice == 'y')
	{
	   numberOfToppings += 1;
	   toppings = toppings + "Onion ";
	}
	System.out.println("-----------------------------------------------");
	System.out.print("Do you want Mushroom? (Y/N): ");
	System.out.println();
	input = keyboard.nextLine();
	choice = input.charAt(0);
	if (choice == 'Y' || choice == 'y')
	{
	   numberOfToppings += 1;
	   toppings = toppings + "Mushroom ";
	}
	// Add additional toppings cost to cost of pizza.
	cost = cost + (1.25 * numberOfToppings);
	// Display order confirmation.
	System.out.println("-----------------------------------------------");
	System.out.println("Your order is as follows: ");
	System.out.println();
	System.out.println(inches + " inch pizza");
	System.out.println(crust + " crust");
	System.out.println(toppings);
	System.out.println("-----------------------------------------------");
	
	// Apply discount if user is eligible.
	// ADD LINES FOR TASK #4 HERE
	if (discount == true)
	{
		System.out.println("You are eligible for a $2.00 discount!");
		disCount = 2;
		System.out.println("-----------------------------------------------");
	}
	//Add discount if applicable
	pizzaCost = cost - disCount;
	// EDIT PROGRAM FOR TASK #5
	// SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
	System.out.printf("The cost of your order " +
	                  "is: $%.2f\n",(pizzaCost));	
	// Calculate and display tax and total cost.
	tax = pizzaCost * TAX_RATE;
	System.out.printf("The tax is: $%.2f\n", tax);
	total = tax + pizzaCost;
	System.out.printf("The total due is: $%.2f\n", total);
	System.out.println("-----------------------------------------------");
	System.out.println("Your order will be ready " +
	                   "for pickup in 30 minutes. ");
	System.out.println("Thank you for your business!");
	keyboard.close();		//To close keyboard
	}
}