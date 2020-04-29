
public class StudentMainClass {

	public static void main(String[] args) 
	{
		//1.Assign values by using reference variable
		
		Student s1= new Student(1010,"Maria", 'a'); //3. Assign values by using constructor
		
		/*s1.SID = 1010;
		s1.StudentName= "John";
		s1.Grade='a';*/
		
		//2.Assign values by using method
		
		/*s1.getvalues(1000,"Maria",'A');*/
		
		s1.display();


	}

}
