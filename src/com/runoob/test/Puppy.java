package com.runoob.test;

public class Puppy {

	int puppyAge;
	String puppyName;
	
	public Puppy() {
		//System.out.println("小狗还没有名字。");
	}
	public Puppy(String name) {
		//System.out.println("小狗的名字是：" + name);
		puppyName = name;
	}
	
	public void SetAge(int age) {
		puppyAge = age;
	}
	
	public int GetAge() {
		System.out.println("小狗的年龄是：" + puppyAge);
		return puppyAge;
	}
	
	public String GetName() {
		System.out.println("小狗的名字是：" + puppyName);
		return puppyName;
	}
	
	
	
	public static void main(String []args) {
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.SetAge(3);
		myPuppy.GetName();
		myPuppy.GetAge();
	}
	
}
