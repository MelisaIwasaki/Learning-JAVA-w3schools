//Inheritance

/*In Java,it is possible to inherit attributes and methods from one class to another.We group the
"inheritance concept" into two categories:
-subclass(child):the class that inherits from another class.
-superclass(parent):the class being inherited from.
To inherit from a class,use the extend keyword.*/

//the car class(subclass)inherits the attributes and methods from the vehicle class(superclass).

class Vehicle{
    protected String brand = "Ford";  //vehicle attribute
    public void honk(){               //vehicle method
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle{
    private String modelName = "Mustang"; //car attribute
    public static void main(String[] args){
        Car myCar = new Car();            //Object
        myCar.honk();                     //honk() method(from the vehicle class)on the myCar Object
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

/*We set the brand attribute in vehicle to a protected access modifier.If it was set to private,the car class 
would not be able to access it.*/

/*******************************************************************************/

//The final keyword

//If you don't want other classes to inherit from a class,use the final keyword:

//If you try to access a final class,java will generate an ERROR.

final class Vehicle{
    
}
class Car extends Vehicle{
    
}

//Outputs: Main.java:9: error: cannot inherit from final Vehicle
