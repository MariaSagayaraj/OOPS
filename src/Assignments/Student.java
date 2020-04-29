package Assignments;

public class Student {
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
  void getstudata(int ID,String Name) 
	{
		SID=ID;
		Sname=Name;	
	}
  
  void display() 
  {
	   System.out.println(SID+ " " +Sname);
  }
   
   void getStumarks(int S1,int S2, int S3) 
   {
	   S1=Sub1;
	   S2=Sub2;
	   S3=Sub3;
   }
   
   
   void totalmarks()
   {
	  int totalmarks = (Sub1+Sub2+Sub3);
	  System.out.println("Total marks earned is " +totalmarks);
	 
   }

	public static void main(String[] args) 
	{
		Student st1= new Student();
		st1.SID=1;
		st1.Sname="Maria";
		st1.Sub1=100;
		st1.Sub2=99;
		st1.Sub3=98;
		st1.display();
		st1.totalmarks();
		
	}

}
