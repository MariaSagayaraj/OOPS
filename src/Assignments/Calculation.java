package Assignments;

public class Calculation {
	int x,y,z;
	
	Calculation()    //constructor
	{
	
		x=100;
		y=200;
		z=300;
		
	}
	
	void sum()    //method
	{
		
		System.out.println("Sume of three number is" +(x+y+z));
	}
	

	public static void main(String[] args) 
	{
		Calculation c=new Calculation();
		c.sum();
	
	}
		
	}


