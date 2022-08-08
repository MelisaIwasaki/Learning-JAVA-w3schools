//For Each Loop

/*for (type variableName : arrayName) {
  // code block to be executed
} 

Which is used exclusively to loop through element in an array*/

public class Main{
    public static void main(String[] args){
        String[]cars = {"Volvo","BMW","Ford","Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}
