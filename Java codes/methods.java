import java.util.Scanner;
class algebra{
    int sum(int a,int b){
        int res= a+b;
        a++;
        return res;
    }
}
public class methods {

    static void welcome(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        welcome(); //call a function
        algebra obj=new algebra();
        Scanner sc= new Scanner(System.in);
        System.out.println("x:");
        int x=sc.nextInt();
        System.out.println("y:");
        int y=sc.nextInt();
        int sum = obj.sum(x,y); //actual parameters /copies get created
        System.out.println("sum is "+sum);
        System.out.println(x); //same as before not increm.

        //standard library methods
        //print() java.io package
        //sqrt(), floor(), pow(), min(), max()

        System.out.println(Math.sqrt(16)); //class is by default imported unlike scanner
        System.out.println(Math.floor(5.1)); //just smaller integer
        System.out.println(Math.ceil(5.1)); //just greater integer
        //double return type of all 3 func
    }

}
