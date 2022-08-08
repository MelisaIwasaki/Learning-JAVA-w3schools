//While loop

//The while loop loops through a block of code as long as a specified condition is true.

public class Main{
    public static void main(String[] args){
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++; //do not forget to increase the variable used in the condition,otherwise the loop will never end.
        }
    }
}

/*******************************************************************************/

//The Do/While loop(repeat until)

public class Main{
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 5);
    }
}
