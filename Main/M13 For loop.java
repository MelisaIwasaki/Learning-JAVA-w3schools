//For Loop

/*for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
statement 1: Sets a variable before the loop starts(int i = 0).
statement 2: Defines the condition for the loop to run.
statement 3: Increase a value(i++)each time the code block in the loop has been executed.*/

public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        for(int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }
    }
}

