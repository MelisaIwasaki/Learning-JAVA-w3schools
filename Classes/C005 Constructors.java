//Constructors

/*Is a special method that is used to initialize objects.The constructor is called when an object of 
a class is created. It can be used to set initial values for object attributes*/

//Create a constructor:

public class Main{  //create a Main class
    int x;          //create a class attribute
    public main(){  //create a class constructor for the Main class
        x = 5;      //set the initial value for the class attribute x.
    }
    public static void main(String[] args){
        Main myObj = new Main();     //create an object of class main(this will call the constructor)
        System.out.println(myObj.x); //outputs: 5
    }
}

/*******************************************************************************/

//Constructor Parameters

public class Main{
    int x;
    public main(int y){
        x = y;
    }
    public static void main(String[] args){
        Main myObj = new Main(5);
        System.out.println(myObj.x);    //outputs: 5
    }
}

/*******************************************************************************/

//You can have as many parameters as you want:

public class Main{
    int modelYear;
    String modelName;
    public Main(int year, String name){
       modelYear = year;
       modelName = name;
    }
    public static void main(String[] args){
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName); //outputs: 1969 Mustang
    }
}

