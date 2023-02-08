package classes;

public class Employee {
	
	private int empid;
	private  String ename;
	
	public Employee(int empid, String ename) {
		this.empid=empid;
		this.ename=ename;
	}
	
		public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public static void main(String[] args) {
		Employee employee=new Employee(10,"vishnu");
		System.out.println("employee id:"+employee.getEmpid());
		System.out.println("employee name:"+employee.getEname());
		
	}
}
