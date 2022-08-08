//Multi-Dimensional Arrays

//A multidimensional array is an array of arrays.

public class Main{
    public static void main(String[] args){
        int [][] myNumbers = {{1, 2, 3, 4},{5,6,7}};
        int x = myNumbers[1][2];
        System.out.println(x); //outputs 7
    }
}

/*******************************************************************************/

//We can also use a for loop inside another for loop to get the element of a two dimensional array.

public class Main{
    public static void main(String[] args){
        int [][] myNumbers = {{1, 2, 3, 4},{5,6,7}};
        for(int i = 0; i < myNumbers.length; ++i){
            for(int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
