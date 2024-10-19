package ControlStatements;

public class ForLoopExample 
{

	public static void main(String[] args) 
	{
		//ForLoopExample example
		for(int i = 3; i < 5; i++)
        {
            System.out.println("Value of i: " + i);
        }
        
        //Nested For Loop Example
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 5; j++)
            {
               // System.out.println("Value of i: " + i + " and Value of j: " + j);
            }
        }

	}

}
