//Make Package 1 code for Addition
package Calculation;
public class Addition
{
	public void sum(int a, int b)
	{
		System.out.println("Sum of a and b is "+(a+b));
	}
}

//Make Package 2 code for Subtraction
package Calculation;
public class Subtraction
{
	public void sub(int a, int b)
	{
		System.out.println("Subtraction of a and b is "+(a-b));
	}
}

//Make Package 3 code for Division
package Calculation;
public class Division
{
	public void Divi(int a, int b)
	{
		int c;
		if(a>b)
		{
			c=a/b;
		}
		else
		{
			c=b/a;
		}
		System.out.println("Division of a and b is "+c);
	}
}

//Make Package 4 code for Multiplication
package Calculation;
public class Multiplication
{
	public void Multi(int a, int b)
	{
		System.out.println("Multiplication of a and b is "+(a*b));
	}
}

// Main Code

import Calculation.*;

class Test_03
{
	public static void main(String args[])
	{
		Addition a = new Addition();
		a.sum(10,10);
		Subtraction s=new Subtraction();
		s.sub(5,10);
		Multiplication m=new Multiplication();
		m.Multi(10,10);
		Division d = new Division();
		d.Divi(5,2);
	}
}
