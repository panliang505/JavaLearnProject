import java.io.*;

public class Employee {
	int age;
	double salary;
	String name;
	String designation;
	
	// Employee ��Ĺ��캯��
	public Employee(String name) {
		this.name = name;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	
	public void SetDesignation(String designation) {
		this.designation = designation;
	}
	
	public void SetSalary(double salary) {
		this.salary = salary;
	}
	
	public void PrintEmployee() {
		System.out.println("���֣�" + name);
		System.out.println("���䣺" + age);
		System.out.println("ְλ��" + designation);
		System.out.println("нˮ��" + salary);
	}
}
