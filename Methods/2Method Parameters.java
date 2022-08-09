//Method Parameters

public class Main{
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }
    
    public static void main(String[] args){
        myMethod("Liam");   //outputs: Liam Refsnes
        myMethod("Jenny");  //Jenny Refsnes
        myMethod("Anja");   //Anja Refsnes
    }
}

/*when a parameter is passed to the method,it is called an argument.So from the example above: fname is a 
parameter, while Liam, Jenny and Anja are arguments*/

/*******************************************************************************/

//Multiple Parameters

public class Main{
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    
    public static void main(String[] args){
        myMethod("Liam", 5);   //Liam is 5
        myMethod("Jenny", 8);  //Jenny is 8
        myMethod("Anja", 31);  //Anja is 31
    }
}

/*When you are working in multiple parameters, the method call must have the same number of arguments as there 
are parameters, and the arguments must be passed in the same order*/

/*******************************************************************************/

//Return values

/*If you want the method to return a value, you can use a primitive data type(such as int,char,etc)
instead of void, and use the return keyword inside the method*/

public class Main{
    static int myMethod(int x){
        return 5 + x;
    }
    
    public static void main(String[] args){
        System.out.println(myMethod(3));    //outputs: 8(5+3)
    }
}

/*******************************************************************************/

//Two parameters

//You can also store the result in a variable(recommended, as it is easier to read and maintain)

public class Main{
    static int myMethod(int x, int y){
        return x + y;
    }
    
    public static void main(String[] args){
        int z = myMethod(5, 3);
        System.out.println(z);  //outputs:8(5+3)
    }
}

/*******************************************************************************/

//A method with if-else

public class Main{
    static void checkAge(int age){
        if(age < 18){
            System.out.println("Access denied-You are not old enough!");
        }else{
            System.out.println("Access granted-You are old enough!");
        }
    }
    public static void main(String[] args){
        checkAge(20);  //outputs:Access granted-You are old enough!
    }
}
