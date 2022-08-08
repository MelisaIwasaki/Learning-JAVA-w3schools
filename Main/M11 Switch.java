//switch

//to select one of many code blocks to be executed.

public class Main{
    public static void main(String[] args){
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");   //outputs Thursday(day 4)
                break;
        }
    }
}

//break:A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.

/*******************************************************************************/

//The default keyword

//default: is used as the last statement in a switch block, its does not need a break.

public class Main{
    public static void main(String[] args){
        int day = 4;
        switch(day){
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend"); //outputs:Looking forward to the Weekend
        }
    }
}
