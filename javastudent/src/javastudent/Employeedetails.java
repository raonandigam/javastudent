package javastudent;

public class Employeedetails {
	static int id;
	static String name;
	static String manager;
	static double salary;

	
   public static void main(String[] args){
   
	Employeedetails employee = new Employeedetails();
	employee.id = 1503010448;
	employee.name = "Krishna";
	employee.manager = "Chaitanya";
	employee.salary = 5000;
	System.out.println("employee id is:" +id);
	System.out.println("employee name is:" +name);
	System.out.println("employee manager is:" + manager);
	
   }
}