//Scope

//Variables are only accessible inside the region they are created.

public class Main{
    public static void main(String[] args){
        //code here cannot use x
        int x = 100;
        //code here can use x
        System.out.println(x);
    }
}

//Block Scope

//A block of code refers to all of the code between curly braces.

public class Main{
    public static void main(String[] args){
        //code here cannot use x
        { //This is a block
          //code here cannot use x
          int x = 100;
          //code here can use x
          System.out.println(x);
        } //the block ends here
        //code here cannot use x
    }
}

/*A block of code may exist on its own(la llave puede existir por si mismo) or it can belong to an,
if, while or for statement*/
