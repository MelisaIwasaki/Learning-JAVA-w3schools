//Class Attributes

//Create a class called "Main" with two attributes: x and y:

public class Main{
    int x = 5;
    int y = 3;
}

/*******************************************************************************/

//Accessing atributes

//Create an object called "myObj" and print the value of x:

public class main{
    int x = 5;
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}

/*******************************************************************************/

//Modify Attributes

//You can also modify attribute values

//Set the value of to 40:

public class Main{
    int x;
    public static void main(String[] args){
        Main myObj = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
    }
}

/*******************************************************************************/

//Or override existing values(o anular los valores existentes)

//Change the value of to 25:

public class Main{
    int x = 10;
    public static void main(String[] args){
        Main myObj = new Main();
        myObj.x = 25;
        System.out.println(myObj.x);
    }
}

/*******************************************************************************/

//If you don't want the ability to override existing values, declare the attribute as final:

public class Main{
    final int x = 10; //final=const
    public static void main(String[] args){
        Main myObj = new Main();
        myObj.x = 25; //will generate an error:cannot assign a value to a final variable.
        System.out.println(myObj.x);
    }
}

/*******************************************************************************/

//Multiple Objects

/*If you create multiple object of one class, you can change the attribute values in one object, without 
affecting the attribute values in the other*/

//Change the values of to 25 in,and leave in unchanged:

public class Main{
    int x = 5;
    public static void main(String[] args){
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        myObj2.x = 25;
        System.out.println(myObj1.x);  //outputs:5
        System.out.println(myObj2.x);  //outputs:25
    }
}

/*******************************************************************************/

//Multiple Attributes

//You can specify as many attributes as you want

public class Main{
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

