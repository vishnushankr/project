package oops;


class child  {
	int bonus = 1000;
	
}
public class SingleInheritance extends child {
	float salary = 1000;



	public static void main(String[] args) {
		SingleInheritance c = new SingleInheritance();
		System.out.println("salary is "+c.salary);
		System.out.println("bonus is "+c.bonus);

	}

}
