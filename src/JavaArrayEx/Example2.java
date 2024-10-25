package JavaArrayEx;

public class Example2 
{

	public static void main(String[] args)
	{
		int arr[][] = {
							{1,3,5,7},
							{2,4,6,8},
							{9,11,13,15},
							{12,14,16,18}
											
					  };
		//hnadling row
		for (int i = 0; i < arr.length; i++)
		{
			//Handling column
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //to print each row in new line.	
		}

	}

}
