//Arrays

//Arrays are used to store multiple values in a single variable, instead of declaring separate variable for each value.

public class Main{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        
        System.out.println(cars[0]);      //outputs: Volvo
        System.out.println(cars.length);  //outputs: 4
    }
}

/*******************************************************************************/

//Change an array element

public class Main{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]); //Now outputs Opel instead of Volvo.
    }
}


