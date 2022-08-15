//Polymorphism

/*Polymorphism means "many forms",and it occurs when we have many classes that are related to each other by
inheritance*/

class Animal{    //superclass
    public void animalSound(){  //method
        System.out.println("The animal make a sound");
    }
}
class Pig extends Animal{   //subclasses
    public void animalSound(){
        System.out.println("The pigs sais:wee wee ");
    }
}
class Dog extends Animal{   //subclasses
    public void animalSound(){
        System.out.println("The dog sais:bow wow");
    }
}

/*******************************************************************************/

//Now we can create Pig and Dog objects and call the animalSound() method both of them:

class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig sais: wee wee");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog sais: bow wow");
    }
}    
class Main{
    public static void main(String[] args){
        Animal myAnimal = new Animal(); //create a Animal object
        Animal myPig = new Pig();       //create a Pig object
        Animal muDog = new Dog();       //create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}   
    
/*why and when to use inheritance and polymorphism?  
it is use for code reusability(reutilizacion):reuse attributes an methods of an existing class when you create 
a new class.*/ 
