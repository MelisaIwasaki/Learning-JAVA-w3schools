//Abstraction

//Abstract classes and methods

/*Abstraction can be archieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier,used for classes and methods:
-Abstract class:is a restricted class that cannot be used to create objects(to access it,it must be 
inherited from another class).
-Abstract method:can only be used in an abstract class,and it does not have a body.The body is provided by
the subclass(inherited from).

An abstract class can have both abstract and regular methods*/

abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZ");
    }
}

//From the example above(arriba) it is not possible to create an object of the Animal class.

Animal myObj = new Animal(); //will generate an ERROR 

/*******************************************************************************/

/*To access the abstract class,it must be inherited from another class.Let's convert the Animal class
we used in the polymorphism to an abstract class:*/

abstract class Animal{                   //abstract class
    public abstract void animalSound();  //abstract method(does not have a body)
    public void sleep(){                 //regular method
        System.out.println("zzz");
    }
}
class Pig extends Animal{   //subclass(inherit from Animal)
    public void animalSound(){
        System.out.println("The pig sais: wee wee");
    }
}
class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();  //create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

/*Why and when to use abstract classes and methods?
to archieve security:hide certain details and only show the imprtant details of an object.*/
