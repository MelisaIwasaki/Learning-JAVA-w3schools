//Enums

//An enum is a special "class" that represents a group of constants.

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

Level myVar = Level.MEDIUM;

/******************************************************************************/

//Enums inside a class

public class Main{
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

/******************************************************************************/

//Enum in a Swith Statement

enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class Main{
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;

        swith(myVar){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}

//outputs:Medium level

/******************************************************************************/

//Loop Through an Enum

//The enum type has a values() method,which return an array of all enum constants.

for( Level myVar : Level.values()){
    System.out.println(myVar);       //outputs: LOW MEDIUM HIGH
}
