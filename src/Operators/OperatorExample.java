package Operators;

public class OperatorExample 
{

	public static void main(String[] args) 
	{
		double num1=10;
		double num2=20;
		//int a, b,c,d;
		double	 num3=num1+num2;
		System.out.println("Using Third Variable: " + num3);
		
		// Assignment Operator
		num1+=num2;
		System.out.println("Using Addition Assignment Operator: " + num1);
		num1-=num2;
		System.out.println("Using Sub Assignment Operator: " + num1);
		num1/=num2;
		System.out.println("Using Div Assignment Operator: " + num1);
		num1*=num2;
		System.out.println("Using Mul Operator: " + num1);		
		num1%=num2;
		System.out.println("Using Mod Operator: " + num1);
		
        // Relational Operator
		
		System.out.println("Using Relational Operator >: " + (10>10));
		System.out.println("Using Relational Operator >=: " + (15>=15));
		System.out.println("Using Relational Operator <: " + (20<20));
		System.out.println("Using Relational Operator <=: " + (20<=20));
		System.out.println("Using Relational Operator !=: " + (1!=2));

		//Logical Operators
		
        System.out.println("Using Logical Operator &&: " + (10>5 && 10<20));
        System.out.println("Using Logical Operator &&: " + (10>5 && 21<20));

        
        System.out.println("Using Logical Operator ||: " + (10>5 || 10<20));
        
        System.out.println("Using Logical Operator! (not): " +!(10>5));
        
        // Conditional Operator
        
        int a=100, b=20;
        System.out.println("Using Conditional Operator (ternary operator): " + (a>b? a : b));
        
        //Unary Operators
        
        System.out.println("Using Unary Operator Pre(++): " + (++a));
        
        System.out.println("Using Unary Operator Post(++): " + (a++));
        System.out.println("Post Inc a: " + a);

        System.out.println("Using Unary Operator Pre(--): " + (--b));
        System.out.println("Using Unary Operator Post(--): " + (b--));
        System.out.println("Post Dec : " + b);

        
        System.out.println("a: " + a);
        System.out.println("b: " + b);

	}

}
