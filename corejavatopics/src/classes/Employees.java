package classes;

import java.util.Scanner;

public class Employees {
	private String empname;
	private char gender;
	private double yearsofexp;
	private String designation;
	private double basicsalary;
	private String status;
	public double promoteEmp;

	public Employees(String empname, char gender) {
		this.empname = empname;
		this.gender = gender;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getYearsofexp() {
		return yearsofexp;
	}

	public void setYearsofexp(double yearsofexp) {
		this.yearsofexp = yearsofexp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employees employee = new Employees("vishnu", 'm');
		System.out.println("employee name" + employee.getEmpname());
		System.out.println("employee gender" + employee.getGender());
		System.out.println("Enter the experience of employee");
		employee.setYearsofexp(sc.nextFloat());
		if (employee.getYearsofexp() >= 3) {
			employee.setDesignation("ITA");
			employee.setBasicsalary(15000);
			employee.setStatus("Active");
		} else {

			employee.setDesignation("ASE");
			employee.setBasicsalary(10000);
			employee.setStatus("Active");
		}

		System.out.println("designation is:" + employee.getDesignation());
		System.out.println("salary is:" + employee.getBasicsalary());
		System.out.println("status of the employee is : " + employee.getStatus());

		switch (employee.getDesignation()) {
		case "ASE":
			employee.setDesignation("ITA");
			employee.setBasicsalary(15000 + (10000 * 5 / 100));
			employee.setStatus("active");
			System.out.println("designation is:" + employee.getDesignation());
			System.out.println("incremented salary is" + employee.getBasicsalary());
			System.out.println("status is :" + employee.getStatus());

		case "ITA":
			employee.setDesignation("AST");
			employee.setBasicsalary(18000 + (15000 * 8 / 100));
			employee.setStatus("active");
			System.out.println("designation is :" + employee.getDesignation());
			System.out.println("incremented salary is:" + employee.getBasicsalary());
			System.out.println("status is:" + employee.getStatus());

		case "AST":
			employee.setDesignation("ASC");
			employee.setBasicsalary(20000 + (18000 * 10 / 100));
			employee.setStatus("active");
			System.out.println("designation is:" + employee.getDesignation());
			System.out.println("incremented salary is:" + employee.getBasicsalary());
			System.out.println("status is:" + employee.getStatus());
			break;
		default:
			System.out.println("invalid");

		}
	}
}
