//Loop through an array

//You can loop through the array element with the for loop,and use the length property to specify how many times the loop should run.
//cars.length = dimF
 
public class Main{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i < cars.length; i++){ 
            System.out.println(cars[i]);
        }
    }
}

/*******************************************************************************/

//Loop through an array with for each

//which is used exclusively to loop through elements in arrays.
/*for (type variable : arrayname) {
  ...
}*/

public class Main{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}
