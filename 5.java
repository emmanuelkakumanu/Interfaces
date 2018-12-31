
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
interface in1
{
	void method1();
}
interface in2
{
	void method1();
}
class Ideone implements in1,in2
{
	public void method1()
	{
		System.out.println("method1 implemented");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		obj.method1();
	}
}
