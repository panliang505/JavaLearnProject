package com.runoob.test;

public class Puppy {

	int puppyAge;
	String puppyName;
	
	public Puppy() {
		//System.out.println("С����û�����֡�");
	}
	public Puppy(String name) {
		//System.out.println("С���������ǣ�" + name);
		puppyName = name;
	}
	
	public void SetAge(int age) {
		puppyAge = age;
	}
	
	public int GetAge() {
		System.out.println("С���������ǣ�" + puppyAge);
		return puppyAge;
	}
	
	public String GetName() {
		System.out.println("С���������ǣ�" + puppyName);
		return puppyName;
	}
	
	
	
	public static void main(String []args) {
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.SetAge(3);
		myPuppy.GetName();
		myPuppy.GetAge();
	}
	
}
