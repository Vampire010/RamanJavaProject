package ControlStatements;

import java.util.Scanner;

public class ATMmachine 
{

	public static void main(String[] args) 
	{
	        Scanner scanner = new Scanner(System.in);
	        
	        // Sample card and PIN data for validation
	        String validCardNumber = "1234567890";
	        int validPIN = 1234;
	        double balance = 5000.00;
	        int maxAttempts = 3;
	        boolean isCardValid = false;
	        boolean isAuthenticated = false;

	        // Step 1: Accept the card
	        System.out.println("Welcome to the ATM!");
	        System.out.print("Please insert your card (Enter card number): ");
	        String cardNumber = scanner.nextLine();

	        // Step 2: Check if the card is valid
	        if (cardNumber.equals(validCardNumber)) {
	            isCardValid = true;
	        } else {
	            System.out.println("Invalid card. Please try again.");
	        }

	        // Step 3: Ask for PIN if card is valid
	        if (isCardValid) {
	            int attempts = 0;
	            while (attempts < maxAttempts && !isAuthenticated) {
	                System.out.print("Please enter your PIN: ");
	                int enteredPIN = scanner.nextInt();
	                attempts++;

	                // Step 4: Check if the PIN is correct
	                if (enteredPIN == validPIN) {
	                    isAuthenticated = true;
	                    System.out.println("PIN correct! Access granted.");
	                } else {
	                    System.out.println("Incorrect PIN. Attempts remaining: " + (maxAttempts - attempts));
	                }
	            }

	            // If user exceeds maximum attempts, exit the program
	            if (!isAuthenticated) {
	                System.out.println("You have exceeded the maximum number of attempts. Card is locked.");
	                scanner.close();
	                return;
	            }

	            // Step 5: Display options
	            int choice;
	            do {
	                System.out.println("\nATM Menu:");
	                System.out.println("1. Deposit");
	                System.out.println("2. Withdraw");
	                System.out.println("3. Check Balance");
	                System.out.println("4. Exit");
	                System.out.print("Enter your choice: ");
	                choice = scanner.nextInt();

	                switch (choice) {
	                    case 1: // Deposit money
	                        System.out.print("Enter amount to deposit: ");
	                        double depositAmount = scanner.nextDouble();
	                        if (depositAmount > 0) {
	                            balance += depositAmount;
	                            System.out.println("Successfully deposited $" + depositAmount);
	                        } else {
	                            System.out.println("Invalid amount. Please enter a positive number.");
	                        }
	                        break;

	                    case 2: // Withdraw money
	                        System.out.print("Enter amount to withdraw: ");
	                        double withdrawAmount = scanner.nextDouble();
	                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
	                            balance -= withdrawAmount;
	                            System.out.println("Successfully withdrawn $" + withdrawAmount);
	                        } else if (withdrawAmount > balance) {
	                            System.out.println("Insufficient balance.");
	                        } else {
	                            System.out.println("Invalid amount. Please enter a positive number.");
	                        }
	                        break;

	                    case 3: // Check balance
	                        System.out.println("Your current balance is: $" + balance);
	                        break;

	                    case 4: // Exit
	                        System.out.println("Thank you for using our ATM. Have a great day!");
	                        break;

	                    default:
	                        System.out.println("Invalid choice. Please select an option from the menu.");
	                }
	            } 
	            while (choice != 4); // Loop until the user chooses to exit
	        }

	        scanner.close();
	}
}

/* Let's create a real-time example using an ATM machine scenario where the user has up to three attempts to enter the correct PIN code.
 *  In this case, a while loop is a suitable choice since we want to repeat the prompt
 * until the user either enters the correct PIN or exhausts their attempts.
 
 * 1. Accept a card.
 * 2. Check if the card is valid.
 * 3. Ask for PIN.
 * 4. Check if the PIN is correct.
 * 5. Display options (Deposit, Withdraw, Check Balance, Exit).
 * 6. Deposit money. 
*/