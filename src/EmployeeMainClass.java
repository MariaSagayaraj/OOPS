
public class EmployeeMainClass {

		public static void main(String args[]) 
		{
			Employee emp1 = new Employee();   // Creating object
			emp1.ID=100;
			emp1.Name="Maria";
			emp1.Salary=10000;
			emp1.Dnumber=110;
			emp1.Designation="Manager";
			emp1.display();
			
			Employee emp2 = new Employee();
			emp2.ID=101;
			emp2.Name="Prabha";
			emp2.Salary=15000;
			emp2.Dnumber=111;
			emp2.Designation="Director";
			emp2.display();
			
			
		}

	}
