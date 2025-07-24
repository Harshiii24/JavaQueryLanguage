package DB;

public class Employee {
	String name;
	int empid;
	int depno;
	int managerno;
	String hireDate;
	double sal;
	double comm;
	String job;
	
	public Employee() {
	}
	
	public Employee(String name,int empid,int depno,int managerno,String job,String hireDate
			,double sal,double comm) {
		super();
		this.name = name;
		this.empid = empid;
		this.depno = depno;
		this.managerno = managerno;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.job = job;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", empid=" + empid + ", depno=" + depno + ", managerno=" + managerno
				+ ", hireDate=" + hireDate + ", sal=" + sal + ", comm=" + comm + ", job=" + job + "]";
	}
}
