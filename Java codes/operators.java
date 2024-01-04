import java.util.Scanner;
public class operators {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        /*
        arithmetic (+ - / % *)
        relational (== > < >= <= !=)
        == equals to, = assign

        logical (combining statements and checking true/false)
        && (both T=T) AND
        || (oneT=T) OR
        ! (T=F,F=T) NOT

        assignment
        = += -=..
        a+=b -> a=a+b

        unary
        +,-(sign)
        ++,--(increment/decrement post/pre)

        precedence(priority/power)
        associativity(order for same prec) L to R / R to L
        */

        System.out.println(1+2+"abc"); //3 + abc (L to R)
        System.out.println("abc"+1+2); //abc1 + 2

        boolean a=false;
        boolean b=false;
        boolean c=true;
        System.out.println(a==b==c); //first F=F is T, then T==T is true

        //bitwise opertors(operates on binary representation of numbers)
        //OR |
        System.out.println(9|10);
        //1001|1010=1011 i.e.11
        //AND &
        System.out.println(9&10); //8
        //XOR ^
        System.out.println(9^10); //3
        //complement ~ inverts bits
        //~9
        //Shift bitwise operators
        //left shift << (*2)
        System.out.println(9<<3); //3 times = 9 *(2^3) = 72
        //right shift >> (/2)
        System.out.println(80>>3); // div by (2^3) =10
    }
}
}
