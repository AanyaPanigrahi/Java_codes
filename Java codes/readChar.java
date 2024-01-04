import java.util.Scanner;
public class readChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter char:");
        char ch=sc.next().charAt(0); //using indexing in string input
        System.out.println("entered char is "+ch);

        //for boolean
        System.out.println("enter bool val:");
        boolean b=sc.nextBoolean(); //true or false input
        System.out.println("entered boolean val "+b);
    }
}
