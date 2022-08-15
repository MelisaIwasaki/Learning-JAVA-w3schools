//Packages & API

/*A package in java is used to group related classes.Packages are divide into two categories:
-Built-in Packages(Packages from the java API)
-User-defined Packages(create your own packages)*/

/*Un paquete en java se usa para agrupar clases relacionadas.Se dividen en:
-Paquetes integrados(paquete de la API de java)
-Paquetes definidos por el usuario(crea sus propios paquetes)*/

/*******************************************************************************/

//Built-in Packages

/*The java API is a library of prewritten classes,that are free to use,included in the Java Development 
Environment.
The library contains components for managing input,database programming and much much more.
The library is divided into packages and classes.Meaning you can either import a single class(along with its 
methods and attributes),or a whole package that contain all the classes that belong to the specified package.
To use a class or package from the library,you need to use the keyword:import.*/

/*La API de java es una biblioteca de clases preescritas,de uso gratuito,incluidas en el entorno de 
desarrollo de java.
La biblioteca contiene componentes para administrar entradas,programar base de datos y mucho más.
La biblioteca se divide en paquetes y clases.Lo que significa que puede importar una sola clase 
(junto con sus métodos y atributos)o un paquete completo que contenga toda las clases que pertenecen 
al paquete especificado.
Para usar una clase o un paquete de la biblioteca,debe usar la palabra clave import.*/

import package.name.Class; //import a single Class
import package.name.*;     //import the whole package

/*******************************************************************************/

//Import a Class

/*If you find a class you want to use,for example,the scanner class,which is used to get user input,
write the following code:*/

import java.util.Scanner;

/*java.util is a package,while Scanner is a class of the jva.util package.

This package also contains date and time facilities,random-number generator and other utility classes.*/

//Using the Scanner class to get user input:

import java.util.Scanner;

class myClass{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System .out.println("Username is: " + userName);
    }
}

/*******************************************************************************/

//Import a Package

//To import a whole package,end the sentence with an asterisk sign(*).

import java.util.*;

/*******************************************************************************/

//User-defined Packages

/*To create your own package,you need to understand that Java uses a file system directory to store them.Just
like folders on your computer:*/

└── root
  └── my pack
    └── myPackageClass.java
    
//To create a package,use the package keyword:

package myPack;
class myPackageClass{
    public static void main(String[] args){
        System.out.println("This is my package!");
    }
}

