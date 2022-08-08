//Special characters: backslash escape character

public class Main{
    public static void main(String [] args){
        String txt = "We are the so-called \"Vikings\" from the north"; //outputs: "Vikings",double quote
        String txt2 = "It\'s all right."; //outputs: It's, single quote
        String txt3 = "The character \\ is called backslash"; //outputs: The character \ ,backslash
    }
}

/*
\n :new line
\r :carriage return (caracteres de control de la codificación ASCII, Unicode, o EBCDIC, que hace que se mueva el cursor a la primera posición de una línea.)
\t :tab
\b :backspace
\f :form feed ->a printer command that causes the printer to start printing on a new sheet of paper(fuentes externas)
*/
