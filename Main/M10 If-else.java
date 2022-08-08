//if...else

//Conditions and if statements

/*Logical conditions
a < b     a <= b
a > b     a >= b
a == b    a != b

Conditional statements
if :to specify a block of code to be executed, if a specify condition is true.
else :to specify a block of code to be executed, if the same condition is false.
else if :to specify a new condition to test, if the first condition is false.
switch :to specify many alternative blocks of code to be executed.
*/

public class Main{
    public static void main(String[] args){
        if(20 > 18){
            System.out.println("20 is greater than 18");
        }
        int x = 20;
        int y = 18;
        if(x > y){
            System.out.println("x is greater than y");
        }
    }
}

//Note that if is in lowercase letters.Uppercase letters(If or IF)will generate an error.

/*******************************************************************************/

//The else statement

public class Main{
    public static void main(String[] args){
        int time = 20;
        if(time < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening."); //outputs: Good evening.
        }
    }
}

/*******************************************************************************/

//The else if statement

public class Main{
    public static void main(String[] args){
        int time = 22;
        if(time < 10){
            System. out.println("Good morning.");
        }else if(time < 20){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");  //outputs: Good evening.
        }
    }
}

/*******************************************************************************/

//Short hand if..else (Ternary operator)

//Syntax:  variable = (condition) ? expressionTrue :  expressionFalse;

public class Main{
    public static void main(String[] args){
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
