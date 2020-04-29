
public class Calculation {
	
	int x=100;
	int y=200;
	
	/*void sum() //CASE1 - Not taking parameters and also not returning the value
	{
		System.out.println(x+y);
	}*/
	
	/*int sum() //CASE2 - Not taking parameters and also returning the value
	{
		return (x+y);         
	}*/
	
	/*void sum(int a, int b) //CASE3 - Taking parameters and but not returning the value
	{
		System.out.println(a+b);       
	}*/
	
	int sum(int a, int b) //CASE4 - Taking parameters and  returning the value
	{
		return(a+b);    
	}
	

	public static void main(String[] args) 
	{
		
		Calculation c=new Calculation();     //object should be created inside the main method only
		//c.sum();  //CASE1
		
		/*c.sum();  //CASE2           
		System.out.println(c.sum());*/
		
		//c.sum(100, 200); //CASE 3
		
		c.sum(100,200);
		System.out.println(c.sum(100,200)); //CASE 4
		
	}

}
