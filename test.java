import java.util.*;
class Employee
{
	String name;
	double salary;
	int empid;
	Employee(String n,int sal,int ID)
	{
		name =n;
		salary=sal;
		empid = ID;
	}

}
class Manager extends Employee
{
	
	Scanner s = new Scanner(System.in);
	void get_Data()
	{
		System.out.println("Employee Name:");
		name = s.next();
		System.out.println("Salary:");
		salary = s.nextInt();
		System.out.println("Employee ID:");
		empid = s.nextInt();
		//super;
	}
	double increaseSalary(double inc_sal)
	{
		//float inc_sal;
		//System.out.println("Salary Increase percentage:");
		//inc_sal = s.nextFloat();
		salary = (inc_sal)*(salary);
		return salary;
	}
}

class Test_04
{
	public static void main(String args[])
	{
		Manager a = new Manager();
		//Employee a1 = new Employee("Hardik",500000,1001);
		a.get_Data();
		System.out.println("Salary:"+a.increaseSalary(1.5));
	}
}

