import java.io.*;
import java.util.*;
import java.text.*;

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
		
		int a = 5;
		int b = ++a;
		System.out.println("b = " + (b));
		System.out.println("b = " + (b++));
		System.out.println("b = " + (b));
		
		// instanceof 检查对象是否是特定类型
		boolean result = empTwo instanceof Employee;
		System.out.println("result = " + result);
	
		
		Integer i1 = 123;
		Integer i2 = 123;
		if (i1 == i2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (i1.equals(i2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("i1 = " + i1);
		int i3 = 123;
		System.out.println(((Integer)i3).equals(i1));
		
		Character c1 = '1';
		
		Date dNow = new Date( );
		SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd HH:mm:ss");
	    System.out.println("Current Date: " + ft.format(dNow));
	    System.out.printf("Current Date: %tT\n", dNow);
	    System.out.printf("yyyy-mm-dd: %tF\n", dNow);
	    
	    Calendar ca1 = Calendar.getInstance();
	    // 2018-2-28 月份是从0~11
	    ca1.set(2018,  2-1, 28);
	    int year = ca1.get(Calendar.YEAR);
	    int month = ca1.get(Calendar.MONDAY) + 1;
	    int day = ca1.get(Calendar.DAY_OF_MONTH);
	    System.out.println(year + "-" + month + "-" + day);
	}
}

