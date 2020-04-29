
public class Student {
	int SID;
	String StudentName;
	char Grade;
	
	Student(int ID,String Name,char g)           //Constructor
	{
		SID=ID;
		StudentName=Name;
		Grade=g;
	}
	
	void getvalues(int ID,String Name,char g)      //method
	{
		SID=ID;
		StudentName=Name;
		Grade=g;
		
	}
	
	void display() 
	{
		System.out.println(SID+ " " +StudentName+ " " +Grade);
	}
	

}
