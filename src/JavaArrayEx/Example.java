package JavaArrayEx;

public class Example
{

	public static void main(String[] args) 
	{
		//Decalreing an Array		
		int[] arrayevenNumbers={2,4,6,8,10};
		String[] fruitNames = {"Apples", "Banannan","Orange","Kiwi"};
		
		int arrayElementsCount = arrayevenNumbers.length;
        
        //Printing the values of the Array using the index
        for(int i = 0; i < arrayElementsCount; i++)
        {
            System.out.println("Value at index " + i + " is: " +  arrayevenNumbers[i]);
        }
	}
}
