import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
interface in1
{
	 void method1();
}
class Id implements in1
{
	public void method1()
	{
		System.out.println("method1 implemented ");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Id o=new Id();
		o.method1();
	}
}
