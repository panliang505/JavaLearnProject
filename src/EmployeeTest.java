import java.io.*;

public class EmployeeTest {
	public static void main(String [] args) {
		
		Employee empOne = new Employee("��ɢ");
		Employee empTwo = new Employee("����");
		
		empOne.SetAge(25);;
		empOne.SetDesignation("��������Ա");
		empOne.SetSalary(8000);
		empOne.PrintEmployee();
		
		empTwo.SetAge(28);
		empTwo.SetDesignation("�߼�����Ա");
		empTwo.SetSalary(25000);
		empTwo.PrintEmployee();
		
	}
}
