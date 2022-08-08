//Math

//The Java math class has many method that allows you to perform mathematical tasks on numbers.

//Math.max(x, y);
//Math.sqrt(x);

public class Main{
    public static void main(String[] args){
        Math.max(5, 10); //method can be used to find the highest value of x and y.
        Math.min(5, 10); //method can be used to find the lowest value of x and y.
        Math.sqrt(64);   //method return the square root of x.(raiz cuadrada)
        Math.abs(-4.7);  //method return the absolute(positive)value of x.
        Math.random();   //return a random number between 0.0(inclusive)and 1.0(exclusive).
        int randomNum = (int)(Math.random()*101); //0 to 100
        
    }
}
