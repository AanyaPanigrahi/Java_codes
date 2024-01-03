import java.util.Scanner;
public class sumofnums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first num: ");
        int num1=sc.nextInt();
        System.out.println("enter second num: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum: "+sum);

    }
}
