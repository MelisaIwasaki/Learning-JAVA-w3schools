//Inner classes (inner:interno; outer:externo)

//To access the inner class,create an object of the outer class,and then create an object of the inner class:

class OuterClass{
    int x = 10;
    
    class innerclass{
        int y = 5;
    }
}
public class Main{
    public static void Main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new innerClass();
        System.out.println(myInner.y + myOuter.x);    //outputs:15(5+10)
    }
}

/*******************************************************************************/

//Private Inner class

//Unlike a "regular"class,an inner class can be private or protected. (unlike:diferente a)

//If you don't want outside objects to access the inner class,declare the class as private.

class OuterClass{
    int x = 10;
    
    private class innerClass{
        int y = 5;
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.Innerclass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

/*If you try to access a private inner class from an outside class,an ERROR ocurrs:
Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();*/
    
/*******************************************************************************/ 

//Static Inner Class

/*An inner class can also be static,which means that you can access it without creating an object of the outer
class:*/ 

class OuterClass{
    int x = 10;
    
    static class InnerClass{
        int y = 5;
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);  //outputs:5
    }
}    

/*Just like static attributes and methods,a static inner class does not have access to members of the outer 
class.(just like:al igual que)*/

/*******************************************************************************/ 

//Access Outer Class From Inner Class

//One advantage(ventaja)of inner classes,is that they can access attributes and methods of the outer class:

class OuterClass{
    int x = 10;
    
    class InnerClass{
        public int myInnerMethod(){
            return x
        }
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());   //outputs:10
    }
}

