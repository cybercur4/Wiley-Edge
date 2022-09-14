package Question1;

import java.util.Arrays;
import java.util.Objects;

class Employee implements Comparable<Employee>{
	int empid;
	String empName;
	String empDept;
	int empBasicSalary;
	int empGrossSalary;
	Employee(int empid,	String empName,String empDept,int empBasicSalary){
	this.empid=empid;
	this.empName=empName;
	this.empDept=empDept;
	this.empBasicSalary=empBasicSalary;
}
	void calculateGrossSalary() {
		double hra=0.12*empBasicSalary;
		double da=0.08*empBasicSalary;
		double empGrossSalary=empBasicSalary+hra+da;
	}
	@Override
	public String toString() {
		return empid + "   " + empName + "    " + empDept + "     "
				+ empBasicSalary + "     " + empGrossSalary;
	}
	@Override
	public int compareTo(Employee compareEmployee) {
		int compareSalary=((Employee)compareEmployee).empBasicSalary;
		return this.empBasicSalary-compareSalary;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empBasicSalary == other.empBasicSalary && Objects.equals(empDept, other.empDept)
				&& empGrossSalary == other.empGrossSalary && Objects.equals(empName, other.empName)
				&& empid == other.empid;
	}
}	
public class Main {
	static void sortEmployees(Employee employee[]) {
		Arrays.sort(employee);
	}
	public static void main(String args[]) {
		Employee employee[]=new Employee[5];
		employee[0]=new Employee(1,"RAj","CSE",24000);
		employee[1]=new Employee(2,"Deepak","EE",42000);
		employee[2]=new Employee(3,"Praveen","ECE",44000);
		employee[3]=new Employee(4,"Shahvez","ME",12000);
		employee[4]=new Employee(5,"Brijesh","BE",18000);
		System.out.println("ID    NAME    DEPARTMENT    SALARY    GROSS SALARY");
		sortEmployees(employee);
		for(int i=0;i<employee.length;i++) {
			employee[i].calculateGrossSalary();
			System.out.println(employee[i]);
		}
		Employee employee2=new Employee(6,"Akash", "ME", 42000);
		Employee employee3=new Employee(6,"Akash", "ME", 42000);
		if(employee2.equals(employee3))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
	}
}
