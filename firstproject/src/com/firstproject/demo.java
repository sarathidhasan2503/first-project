package com.firstproject;
class polymorphism
{
	void add(int a,int b)
	{
		System.out.println("Sum Of A&B is= "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Sum Of A&B&C is= "+(a+b+c));
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println("Sum Of A&B&C&D is= "+(a+b+c+d));
	}
}

class A
{
	void display()
	{
		System.out.println("Class A exicuted");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Class A exicuted");
	}
}
public class demo {
	public static void main(String[] Args)
	{
		//Polymorphism concept
		polymorphism poly=new polymorphism();
		poly.add(10,20);
		poly.add(10,20,30);
		poly.add(10,20,30,40);
		//inheritance concept
		A parent=new A();
		parent.display();
		B child=new B();
		child.display();
	}

}
