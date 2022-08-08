//Break and continue

//Break:can also be used to jump out of a loop.

public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            if(i == 4){
                break;
        }
        System.out.println(i);
    }
}
  
/*******************************************************************************/

//continue:break one iteration(in the loop)

public class Main{
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
    }
}
  
/*******************************************************************************/

//Break an continue in while loop

//Break in while loop

public class Main{
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
            if(i == 4){
                break;
            }
        }
    }
}
  
/*******************************************************************************/

//continue in while loop

public class Main{
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            if(i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
