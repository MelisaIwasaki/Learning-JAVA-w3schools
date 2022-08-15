//Interface

//An interface is a completely "abstract class" that is used to group related methods with empty bodies:

interface Animal{              //interface
    public void animalSound(); //interface method(does not have a body)
    public void run();         //interface method(does not have a body)
}

/*To access the interface methods,the interface must be "implemented" (kinda like inherited)by another
class with the implements keyword(instead of extends).The body of the interface methods is provided by the 
implement class:*/

interface Animal{
    public void animalSound(); 
    public void sleep();
}
class Pig implements Animal{  //Pig "implements" the Animal interface
    public void animalSound{
        System.out.println("The pig says:wee wee");
    }
    public void sleep(){
        System.out.println("zzz");
    }
}
class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

/*Notes:
-Like abstract classes,interfaces cannot be used to create objects(it is not posible to create an "Animal" 
object in the myMainClass).
-Interface methods do not have a body:the body is provided by the implement class.
-On implementation of an interface,you must override all of its methods.
-Interface methods are by default abstract and public.
-Interface attributes are by default public,static and final.
-An inetrface cannot contain a constructor(as it cannot be used to create objects).

Why and when to use interface?
-To archieve security:hide certain(ocultar cierta) details and only show the important details of an objects
(interface)
-Java does not support "multiple inheritance"(a class can only inherit from one superclass).However,it can be 
archieved with interface,because the class can implement multiple interfaces.*/

/*Notas:
-Al igual que las clases abstractas,las interfaces no se pueden usar para crear objetos(no es posible crear 
un objeto "Animal" en myMainClass).
-Los métodos de interfaz no tienen cuerpo:el cuerpo lo proporciona la clase "implementar".
-En la implementación de una inetrfaz,debe anular todos sus métodos. 
-Los métodos de interfaz son por defecto abstract y public.
-Los atributos de la interfaz son por defecto public,static y final. 
-Una interfaz no puede contener un constructor(ya que no se pude usar para crear objetos).

Por qué y cuándo usar intefaces?
-Para lograr la seguridad,oculte ciertos detalles y solo muestre los detalles impotantes de un objeto(interfaz).
-Java no admite "herencia múltiple"(una clase solo puede heredar de una superclase).Sin embargo,se puede lograr
con interfaces,porque la clase puede implementar múltiples interfaces.*/

/*******************************************************************************/

//Multiple interfaces

interface FirstInterface{
    public void myMethod(); //interface method
}
interface SecondInterface{
    public void myOtherMethod();
}
class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void myOtherMethod(){
        System.out.println("Some other text..");
    }
}
class Main{
    public static void main(String[] args){
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

