import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            /*

            if statement
            if else statement

            if else if->
             if(condition){
                //code
             } else if(cond 2){
                //code
             } else{
                //code
             }

             */

             //nested if else
             System.out.println("enter num");
             int input=sc.nextInt();
             if(input>=0){
                System.out.println("positive");
                if(input%2==0){
                    System.out.println("even");
                }else{
                    System.out.println("odd");
                }
             }else{
                System.out.println("negative");
             }

             //using conditional statements
             //&& ||
             //if(a && b)..

             //ternary works similarly
             //?:
            String s=input>=0?"yes":"no";
            System.out.println(s);

        }
    }
}
