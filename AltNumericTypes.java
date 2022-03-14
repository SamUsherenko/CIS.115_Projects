import java.util.*;
import javax.swing.*;
// TASK #2 (Alternate)
public class AltNumericTypes 
{
	public static void main(String[] args)
	{
	//Scanner object from keyboard
	Scanner keyboard = new Scanner(System.in);
	
    //Prompt the user for first name
	String fName;
    // Read the user's first name
	fName = JOptionPane.showInputDialog(null, "What is your first name?");
	
	// Prompt the user for last name
	String lName;
    // Read the user's lastName name
	lName = JOptionPane.showInputDialog(null, "What is your last name?");
	
    // Concatenate the user's first and last names
	String fullName = fName + " " + lName;
    // Print out the user's full name
	JOptionPane.showMessageDialog(null, "Your full name is " + fullName);
	
	keyboard.close(); // Close Keyboard
	System.exit(0); // Close GUI
	}
}
