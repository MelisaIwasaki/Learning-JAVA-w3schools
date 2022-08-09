//Method Overloading

//Multiple method can have the same name with different parameters.

int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

//Which has two method that add numbers of different type.

public class Main{
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    
    static double plusMethodDouble(double x, double y){
        return x + y;
    }
    
    public static void main(String[] args){
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("Int: " + myNum1);
        System.out.println("Double: " + myNum2);
        
    }
}

/*instead to defining two methods that should do the same thing, it is better to overload one.
In the example below, we overload the plusMethod method to work for both int and double*/

public class Main{
    static int plusMethod(int x, int y){
        return x + y;
    }
    
    static double plusMethod(double x, double y){
        return x + y;
    }
    
    public static void main(String[] args){
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("Int: " + myNum1);
        System.out.println("Double: " + myNum2);
    }
}
