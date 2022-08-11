//OOP Object-Oriented Programming

/*Is about creating objects that contain both data and method.
OOP is faster and easier to execute.
OOP provides a clear structure for the programs.
OOP help to keep the java code DRY "don't repeat your self"(reducing the repetition of code),
and makes the code easier to maintain, modify and debug.
OOP makes it possible to create full reusable applications with less code and shorter development time.

Class->fruit  Objects-> apple,banana,mango
Class->car    Objects-> Volvo,Audi,Toyota

So, a class is template for objects, and an object is an instance of a class.

A class is like an object constructor or a "blueprint" for creating objects.*/

//Create an objects called "myObj" and print the value of x. 

public class Main{
    int x = 5;
	public static void main(String[] args) {
	    Main myObj = new Main();
	    System.out.println(myObj.x);
	}
}
