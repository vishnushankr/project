package structural_pattern;

import java.util.ArrayList;
import java.util.List;
//for hirerachy of classes
 class Employee1 {
   private String name;
   private String dept;
   private int salary;
   private List<Employee1> subordinates;

   // constructor
   public Employee1(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee1>();
   }

   public void add(Employee1 e) {
      subordinates.add(e);
   }

   public void remove(Employee1 e) {
      subordinates.remove(e);
   }

   public List<Employee1> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }   
}
 public class CompositeExample {
	   public static void main(String[] args) {
	   
	      Employee1 CEO = new Employee1("John","CEO", 30000);

	      Employee1 headSales = new Employee1("Robert","Head Sales", 20000);

	      Employee1 headMarketing = new Employee1("Michel","Head Marketing", 20000);

	      Employee1 clerk1 = new Employee1("Laura","Marketing", 10000);
	      Employee1 clerk2 = new Employee1("Bob","Marketing", 10000);

	      Employee1 salesExecutive1 = new Employee1("Richard","Sales", 10000);
	      Employee1 salesExecutive2 = new Employee1("Rob","Sales", 10000);

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);

	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee1 headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee1 employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }		
	   }
	}