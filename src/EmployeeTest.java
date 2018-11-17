import java.io.*;

public class EmployeeTest {
	public static void main(String [] args) {
		
		Employee empOne = new Employee("张散");
		Employee empTwo = new Employee("刘耳");
		
		empOne.SetAge(25);;
		empOne.SetDesignation("初级程序员");
		empOne.SetSalary(8000);
		empOne.PrintEmployee();
		
		empTwo.SetAge(28);
		empTwo.SetDesignation("高级程序员");
		empTwo.SetSalary(25000);
		empTwo.PrintEmployee();
		
	}
}
