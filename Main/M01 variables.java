//Variables

//single-line comments, for short comments
/*multi-line comments, for longer*/

public class Main
{
	public static void main(String[] args) {    
	    String myText = "Hello";
	    int myNum = 5;            //integer(whole number) 4bytes
	    int myNum2;
	    float myFloatNum = 5.99f; //floating point number 4bytes
	    char myLetter = 'A';      //2bytes
	    boolean myBool = true;    //1bit
	    
	    myNum2 = 15;
	    
		System.out.println("Hello World");  
		System.out.println(myText);
		System.out.println(myNum);
		System.out.println(myNum2);
		System.out.println(myFloatNum);
		System.out.print(myLetter);
		System.out.print(myBool);
	}
}

/**************************************************************************************/

public class Main{
    public static void main(String[] args){
        String name = "Juana";
        String firstName = "Maria ";
        String lastName = "Luna";
        String fullName = firstName + lastName;
        int x = 5;
        int y = 6;
        
        System.out.println("Hello " + name);
        System.out.println(fullName);
        System.out.println(x + y);  //Print the value of x + y
    }
}

/**************************************************************************************/

public class Main{
    public static void main(String[] args){
        int x = 5, y = 6, z = 50;
        int a, b, c;
        a = b = c = 80;
        int minutesPerHour = 60;   //Good identifier: unique names
        int m = 60;   //Ok, but not so easy to understand what m actually is 
        
        System.out.println(x + y + z);
        System.out.println(a + b + c);
        
    }
}

