import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); //sc object of scanner class

        System.out.println("enter num: ");
        int num1=sc.nextInt();
        //nextInt method of scanner class for taking integer input
        System.out.println("entered num is "+num1);

        System.out.println("enter name: ");
        String name=sc.next(); //next method for string input
        System.out.println("your name is "+name); //takes space as end

        /*
        String branch=sc.nextLine(); //string input
        //this method or func takes next line as end
        System.out.println("studying "+branch); 
        */

        System.out.println("practice:");
        System.out.println("float input:");
        float f=sc.nextFloat();
        System.out.println(f);
        System.out.println("double input:");
        double d=sc.nextDouble();
        System.out.println(d);
        //nextByte(),nextShort(),nextLong()
        
    }
}
