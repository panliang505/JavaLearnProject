import java.io.*;

public class Employee {
	int age;
	double salary;
	String name;
	String designation;
	
	// Employee 类的构造函数
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
		System.out.println("名字：" + name);
		System.out.println("年龄：" + age);
		System.out.println("职位：" + designation);
		System.out.println("薪水：" + salary);
	}
}
