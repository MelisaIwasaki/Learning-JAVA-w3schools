//Encapsulation

/*The meaning of encapsulation,is to make sure that "sensitive" data is hidden from users.To archive this,
you must:
-Declare class variables/attributes as private.
-Provide public get and set methods to access and update the value of a private variable.

The get method returns the variable value and the set method set the value.

Why encapsulation?
-Better control of class attributes and methods.
-Class attributes can be made read-only(if you only use the get method),or write-only(if you only use the 
set method).
-Flexible:the programmer can change one part of the code without affecting other parts.
-Increased segurity of data.*/


/*El significado de encapsulación es asegurarse de que los datos "sensibles"estén ocultos para los usuarios.
Para lograr esto debes:
-Declarar variables/atributos de clase como private.
-Proporcionar métodos públicos get y set para acceder y actualizar el valor de una variable private.

El método get devuelve el valor de la variable y el método set establece el valor.

Por qué encapsulación?
-Mejor control de los atributos y métodos de clase.
-Los atributos de clase se pueden hacer de solo lectura(si solo usa el método get) o de solo escritura(si solo
usa el método set).
-Flexible:el programador puede cambiar una parte del código sin afectar otras partes. 
-Mayor seguridad de los datos.*/


//Get and set

public class Person{
    private String name; //private=restricted access
    
    public String getName(){ //Getter
        return name;
    }
    
    public void setName(String newName){ //Setter
        this.name = newName;
    }
}

/*******************************************************************************/

//However,as the name variable is declared as private,we cannot access it from outside this class:
//(however:sin embargo)

public class Main{
    public static void main(String[] args){
        Person myObj = new Person();
        myObj.name = "John"; //ERROR
        System.out.println(myObj.name); //ERROR
    }
}

/*******************************************************************************/

//Instead we use the getName() and setName() methods to access and update the variable.(instead:en cambio)

public class Main{
    public static void main(String[] args){
        Person myObj = new Person();
        myObj.setName = "John";  //set the value of the name variable to "john"
        System.out.println(myObj.getName()); //outputs:John
        
    }
}

