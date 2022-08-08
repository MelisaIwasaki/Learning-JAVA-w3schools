//Type casting

/*Widening casting(automatically):converting a smaller type to a large type size.
    byte -> short -> char -> int -> long -> float -> double
  Narrowing casting(manually):converting a larger type to a smaller size type.
    double -> float -> long -> int -> char -> short -> byte*/

//Widening casting

public class Main{
    public static void main(String[] args){
        int myInt = 9;
        double myDouble = myInt; //automatic casting: int to double
        
        System.out.println(myInt);   //outputs 9
        System.ou.println(myDouble); //outputs 9.0
        
    }
}

/**************************************************************************************/

//Narrowing casting

public class Main{
    public static void main(String[] args){
        double myDouble = 9.78d;
        int myInt = (int) myDouble; //manual casting: double to int
        
        System.out.println(myDouble); //outputs 9.78
        System.out.println(myInt);    //outputs 9
    }
}
