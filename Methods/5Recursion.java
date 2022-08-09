//Recursion

/*Recursion is the technique of making a fuction call itself.This technique provides a way to break
complicated problems down into simple problem which a easier to solve*/

/*Use recursion to add all of the numbers up to 10*/

public class Main{
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
    }
    
    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1); //10 + sum(9)
        }else{
            return 0;
        }
    }
}

/*10 + sum(9)
10 + 9 + sum(8)
10 + 9 + 8 + sum(7)
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
when k is 0, the program stops there and returns the result.
*/

//Halting condition

/*In this example, the function adds a range of numbers between a start and an end.The halting condition
for this recursive function is when end is not greater than start*/

public class Main{
    public static void main(String[] args){
        int result = sum(5, 10);
        System.out.println(result);
    }
    
    public static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end - 1); //10 + sum(5,9)
        }else{
            return end;
        }
    }
}
