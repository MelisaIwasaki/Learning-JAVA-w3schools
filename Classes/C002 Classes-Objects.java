//Classes/Objects

//Multiple Objects

//Create two objects of Main

public class Main{
    int x = 5;
    public static void main(String[] args){
        Main myObj1 = new Main(); //object 1
        Main myObj2 = new Main(); //object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}

/*******************************************************************************/

//Using Multiple Classes

/*We have created two files in the same directory/folder.
1.Main.java
2.Second.java*/

//Main.java:

public class Main{
    int x = 5;
}

//Second.java:

class Second{
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
