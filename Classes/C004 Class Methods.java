//Class Methods

//Inside main,call myMethod():

public class Main{
    static void myMethod(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        myMethod();
    }
}

/*******************************************************************************/

//Static vs. Non-Static

//An example to demonstrate the differeces between static and public methods:

public class Main{
    static void myStaticMethod(){ //static method
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){ //public method
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();        //Call the static method
        //myPublicMethod();      this would compile an error
        Main myObj = new Main(); //Create an object of main
        myObj.myPublicMethod();  //Call the public method on the object
    }
}

/*******************************************************************************/

//Access Methods with an object

//Create a Car object named myCar. Call the fullThrottle() and speed() method on the myCar object,and run the program.

public class Main{                  //create a main class
    public void fullThrottle(){     //create a fullThrottle() method
        System.out.println("The car is going as fast as it can");
    }
    
    public void speed(int maxSpeed){  //create a speed() method and add a parameter
        System.out.println("Max speed is: " + maxSpeed);
    }
    
    public static void main(String[] args){  //inside main,call the method on the myCar object 
        Main myCar = new Main();  //create a myCar object 
        myCar.fullThrottle();     //call the fullthrottle method
        myCar.speed(200);         //call the speed method
    }
}

/*******************************************************************************/

//Using Multiple Classes

//Main.java

public class Main{
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }
}

//Second.java

class Second{
    public static void main(String[] args){
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}

