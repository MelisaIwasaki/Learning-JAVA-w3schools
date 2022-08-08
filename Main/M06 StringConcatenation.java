//String Concatenation
//the + operator can be used between to string to combine then

public class Main{
    public static void main(String[] args){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); //an empty text to create a space
    }
}

/**************************************************************************************/

//You can also use the concat() method to concatenate two strings

public class Main{
    public static void main(String[] args){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}

/**************************************************************************************/

//Numbers and strings

//Java use the + operator for both addition and Concatenation
//Number are added. String are concatenated.

public class Main{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = x + y;    //z will be 30(an integer/number)
        
        String a = "10";
        String b = "20";
        String c = a + b; //c will be 1020(a string)
        
        String d = a + y ; //d will be 1020(a string)->string + int = string
        
        
    }
}

