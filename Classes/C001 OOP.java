//OOP Object-Oriented Programming

/*Is about creating objects that contain both data and method.
OOP is faster and easier to execute.
OOP provides a clear structure for the programs.
OOP help to keep the java code DRY "don't repeat your self"(reducing the repetition of code),
and makes the code easier to maintain, modify and debug.
OOP makes it possible to create full reusable applications with less code and shorter development time.

Class->fruit  Objects-> apple,banana,mango
Class->car    Objects-> Volvo,Audi,Toyota

So, a class is template for objects, and an object is an instance of a class.

A class is like an object constructor or a "blueprint" for creating objects.*/


/*OOP Programación Orientada a Objetos

Se trata de crear objetos que contienen tanto datos como métodos.
OOP es mas rápido y mas fácil de ejecutar.
OOP proporciona una estructura clara para los programas.
OOP ayuda a mantener el código Java "No se repita",y hace que el código sea más fácil de mantener,
modificar y depurar.
OOP hace posible crear aplicaciones reutilizables completas con menos código y un tiempo de desarrollo más corto.

Entonces, una clase es una plantilla para objetos y un objeto es una instancia de clases.

Cuando se crean los objetos individuales,heredan todas las variables y métodos de la clase.

Una clase es como un constructor de objetos o un "modelo" para crear objetos.*/

/*OOP オブジェクト指向プログラミング

オブジェクト指向プログラミングには、手続き型プログラミングよりもいくつかの利点があります。
OOP より早く、より簡単に実行する。。
OOP　プログラムに明確な構造を提供する。。
OOP　Javaコードをドライに保つのに役立ち、「リピートしないように」コードの保守、変更、およびデバッグを容易する。
OOP　より少ないコードと短い開発時間で完全に再利用可能なアプリケーションを作成できる。

クラスはオブジェクトのテンプレートであり、オブジェクトはクラスのインスタンスです。

クラスはオブジェクトコンストラクター、又はオブジェクトを作成するための「ブループリント」のようなものです。*/


//Create an objects called "myObj" and print the value of x. 

public class Main{
    int x = 5;
	public static void main(String[] args) {
	    Main myObj = new Main();
	    System.out.println(myObj.x);
	}
}
