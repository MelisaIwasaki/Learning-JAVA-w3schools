//Methods

//static means that the method belongs to the main class and not an objects of the main class.
//void means that this method does not have a return value.

public class Main{
    static void myMethod(){
        System.out.println("I just got executed!");  //outputs: I just got executed!
    }
    public static void main(String[] args){
        myMethod();   //outputs: I just got executed!
        myMethod();   //I just got executed!
        myMethod();   //I just got executed!
    }
}
