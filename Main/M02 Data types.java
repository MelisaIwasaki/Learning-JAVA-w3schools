//Data types

//Primitive data types:byte, short, int, long, float, double, boolean and char.

/*integer types:byte,short,int,long / floating point types:float,double
        The most used are int and double*/
        
public class Main{
    public static void main(String[] args){
        
        byte byteNum = 100;     //byte:numbers from -128 to 127
        short shortNum = 5000;  //short:numbers from -32768 to 32767
        int intNum = 100000;    //int:numbers from -2147483648 to 2147483647
        long longNum = 15000000000L; //long:numbers from -9223372036854775808 to 9223372036854775807
        float floatNum = 5.75f; //you should end the value with an f for float and d for doubles
        double doubleNum = 19.99d;
        float f1 = 35e3f;       //scientific number with an "e" indicate the power of 10.
        double f2 = 12E4d;
        
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(f1);
        System.out.println(f2);
    }
}

/**************************************************************************************/

public class Main{
    public static void main(String[] args){
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        char myGrade = 'B';  //the character must be surrounded by single quotes
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;  //ASCII values
        String greeting = "Hello";  //string values must be surrounded by double quotes
        
        System.out.println(isJavaFun);   //outputs:true
        System.out.println(isFishTasty); //output:false
        System.out.println(myGrade);
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(greeting);
    }
}
