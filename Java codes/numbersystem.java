import java.util.Scanner;
public class numbersystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //binary to decimal
        System.out.println("Enter binary number : ");
        int n=sc.nextInt();
        int power=1; //2^0
        int ans=0;
        while(n>0){
            int lastdig=n%10;
            if(lastdig==1){
                ans+=power;
            }
            power*=2;
            n/=10;
        }
        System.out.println("representation in decimal : "+ans);

        //decimal to binary
        System.out.println("enter decimal number : ");
        int m=sc.nextInt();
        int res=0;
        int lastdigit;
        int pow=1;//10^0
        while(m>0){
            if(m==1){
                lastdigit=1;
            }else{
                lastdigit=m%2;
            }
            res+=lastdigit*pow;
            pow*=10;
            m/=2;
        }
        System.out.println("representation in binary : "+res);
    }
}
