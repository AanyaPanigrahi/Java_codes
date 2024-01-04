import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
         switch(expr){
            case x:
              code
              break;
            case y:
              code
              break;
         }

         takes either int or char
         */

        System.out.println("enter num 1/2/3");
         int num=sc.nextInt();
         switch(num){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("invalid");
         }

         System.out.println("enter char a/b");
         char ch=sc.next().charAt(0);
         switch(ch){
            case 'a':
            System.out.println("ayyyy");
            break;
            case 'b':
            System.out.println("beeee");
            break;
            default:
            System.out.println("invalid");
         }
    }
}
