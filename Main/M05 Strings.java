//Strings

/*A string in Java is actually an object, which contain methods that can perform certain operations on strings*/
//the length of a string(longitud)
public class Main{
    public static void main(String[] args){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String txt2 = "Hello ! ";
        
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt2.toUpperCase());  //outputs: HELLO ! (mayuscula)
        System.out.println(txt2.toLowerCase());  //outputs: hello ! (minuscula)
    }
}

/**************************************************************************************/

//the method returns the index (the position)of the first occurrence of a specified text in a strig(including whitespace).
//Java counts positions from zero.

public class Main{
    public static void main(String[] args){
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); //outputs: 7
    }
}
