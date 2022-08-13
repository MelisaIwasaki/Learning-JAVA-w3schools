//Modifiers

/*The "public" keyword is an access modifier,meaning that it is used to set the access level for classes,
attributes,methods and contructors.
We divide modifiers into two groups:
Access modifiers:control the access level.
Non-Access modifiers:do not control access level,but provides other functionality.*/

/*La palabra clave public es un modificador de scceso,lo que significa que se utiliza para establecer
el nivel de acceso para clases, atributos, métodos y constructores.
Dividimos los modificadores en dos grupos:
Modificadores de acceso:controla el nivel de acceso.
Modificadores sin acceso:no controlan el nivel de acceso,pero proporcionan otra funcionalidad.*/

/*******************************************************************************/

//final

//If you don't want the ability to override existing attribute values,declare attribute as:

public class Main{
    final int x = 10;
    final double PI = 3.14;
    public static void main(String[] args){
        Main myObj = new Main();
        myObj.x = 50;  //cannot assing a value to a final variable
        myObj.PI = 25; //cannot assing a value to a final variable
        System.out.println(myObj.x);
    }
}

/*******************************************************************************/

//Static

//A method means that it can be accessed without creating an objects of the class,unlike.

//An example to demonstrate the differences between static and public methods.

public class Main{
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();        //call the static method
        //myPublicMethod(); this would output an error
        Main myObj = new Main(); //create an object of Main
        myObj.myPublicMethod();  //call the public method
    }
}

/*******************************************************************************/

//Abstract(resumen)

//An method belongs to an class,and it does not have a body.　(belong:pertenece)

//Main.java

abstract class Main{ 
    public String fname = "John";
    public int age = 24;
    public abstract void study(); //abstract method
}

class Student extends Main{  //Subclass(inherit from Main)
    public int graduationYear = 2018;
    public void study();                   //the body of the abstract method is provides here
        System.out.println("Studying all day long");
}

//Second.java

class Second{
    public static void Main(String[] args){
        //create an object of the Student class(which inherits attributes and methods from Main)
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation year: " + myObj.graduationYear);
        myObj.study();   //call abstract method
    }
}

