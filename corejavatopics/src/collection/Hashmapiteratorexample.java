package collection;

import java.util.HashMap;
import java.util.Map;

class employee5 {
	private int empid;
	private String name;
	private double salary;

	public employee5(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return this.empid % 31;
	}

	@Override
	public boolean equals(Object obj) {
		employee5 emp = (employee5) obj;
		if (this.empid == emp.empid && this.name.equals(emp.name) && this.salary == emp.salary) {
			return true;
		} else {
			return false;
		}
	}
}

public class Hashmapiteratorexample {

	public static void main(String[] args) {
		double sal = Double.parseDouble(args[0]);
		Map<Integer, employee5> empMap = new HashMap<Integer, employee5>();

		employee5 e = new employee5(1, "Deepak", 34000);
		empMap.put(1, e);

		e = new employee5(2, "Deepika", 24000);
		empMap.put(2, e);

		e = new employee5(3, "Diya", 21000);
		empMap.put(3, e);
		for (Integer empId : empMap.keySet()) {
			employee5 emp = empMap.get(empId);
			System.out.println(emp.getEmpid() + "\t" + emp.getName() + "\t" + emp.getSalary());
			if (emp.getSalary() > sal) {
				empMap.remove(emp.getEmpid());
			}
		}

	}

}
