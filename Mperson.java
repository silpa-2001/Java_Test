import java.io.*;
import java.util.*;
class Person
{
	public void identity()
	{
		System.out.println("This person is a human...");
	}
}
class Teacher extends Person
{
	public void identity()
	{
		System.out.println("This person is also a teacher...");
	}	
}
class Father extends Person
{
	public void identity()
	{
		System.out.println("This person is also a father...");
	}
}
public class MPerson
{
	public static void main(String args[])
	{
		Person p=new Person();
		p.identity();
		Teacher t=new Teacher();
		t.identity();
		Father f=new Father();
		f.identity();
	}
}