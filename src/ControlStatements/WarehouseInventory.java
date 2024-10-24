package ControlStatements;

public class WarehouseInventory 
{
	    // Method to add stock
	    public static void addStock(int[] stock, int productIndex, int quantity) 
	    {
	        if (productIndex >= 0 && productIndex < stock.length) 
	        {
	            stock[productIndex] += quantity;
	            System.out.println("Added " + quantity + " units to product " + productIndex);
	        }
	    }

	    // Method to sell stock
	    public static void sellStock(int[] stock, int productIndex, int quantity) 
	    {
	        if (productIndex >= 0 && productIndex < stock.length && stock[productIndex] >= quantity) 
	        {
	            stock[productIndex] -= quantity;
	            System.out.println("Sold " + quantity + " units of product " + productIndex);
	        }
	        else 
	        {
	            System.out.println("Insufficient stock to sell " + quantity + " units of product " + productIndex);
	        }
	    }

	    // Method to check for low stock
	    public static void checkLowStock(int[] stock, int threshold) 
	    {
	        for (int i = 0; i < stock.length; i++) 
	        {
	            if (stock[i] < threshold) 
	            {
	                System.out.println("Warning: Stock for product " + i + " is below the threshold (" + stock[i] + " units left).");
	            }
	        }
	    }

	    // Method to display the current stock status
	    public static void displayStockStatus(int[] stock)
	    {	    	
	        System.out.println("Current stock status:");
	        for (int i = 0; i < stock.length; i++) 
	        {
	            System.out.println("Product " + i + ": " + stock[i] + " units");
	        }
	    }
	    
		 public static void main(String[] args)
		 {
		        // Step 1: Initialize an array with stock quantities
		        int[] stockQuantities = {50, 120, 75, 30, 15}; // Stock levels for 5 different products

		        // Step 2: Update stock quantities
		        addStock(stockQuantities, 2, 20);  // Adding 20 units to the stock of product 2
		        sellStock(stockQuantities, 4, 10); // Selling 10 units from product 4

		        // Step 3: Check stock levels and alert if any product falls below the threshold
		        int threshold = 20;
		        checkLowStock(stockQuantities, threshold);

		        // Step 4: Display the current stock status of all products
		        displayStockStatus(stockQuantities);
		  }
}
