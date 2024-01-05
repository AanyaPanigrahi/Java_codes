import java.util.Scanner;
public class loopsQues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1.Count num of digits in input
        System.out.println("enter a: ");
        int a=sc.nextInt();
        int b=0;
        int c=a;
        if(a<0){
            a*=(-1);
        }
        while(a>0){
            b++;
            a/=10;
        }
        System.out.println("number of digits in"+c+" = "+b);

        //2.Sum of digits
        System.out.println("enter x: ");
        int x=sc.nextInt();
        int y=x; 
        int sum=0;
        if(x<0){
            x*=(-1);
        }
        while(x>0){
            int lastdig=x%10;
            sum+=lastdig;
            x/=10;
        }
        System.out.println("sum of digits of "+y+" = "+sum);

        //3.Reverse a num
        System.out.println("enter num: ");
        int num=sc.nextInt();
        int numm=num;
        int ans=0;
        if(num<0){
            num*=(-1);
        }
        while(num>0){
            int digit=num%10;
            ans=ans*10+digit;
            num/=10;
        }
        if(numm>0){
        System.out.println("reverse order of "+numm+" = "+ans);
        }
        else{
            System.out.println("reverse order of "+numm+" = "+(-ans));
        }

        //4.Sum of series
        //1-2+3-4..n
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int i=0;
        int sumee=0;
        while(i<n){
            i++;
            if(i%2!=0){
                sumee+=i;
            }else{
                sumee-=i;
            }
        }
        System.out.println("sum of series : "+sumee);

        //5.Factorial
        System.out.println("enter input : ");
        int input=sc.nextInt();
        int fact=1;
        for(int k=1;k<=input;k++){
            fact*=k;
        }
        if(input>=0){
        System.out.println("factorial of "+input+" = "+fact);
        }

        //6.u raised to power v
        System.out.println("enter u:");
        int u=sc.nextInt();
        System.out.println("enter v:");
        int v=sc.nextInt();
        int result=1;
        for(int q=1;q<=v;q++){
            result*=u;
        }
        System.out.println(u+" power "+v+" = "+result);

        /* pattern problems
        *****
        *****
        *****
         */
        System.out.println("box pattern");
        for(int o=1;o<=3;o++){
            for(int p=1;p<=5;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        //empty box
        System.out.println("empty box pattern");
        for(int o=1;o<=4;o++){
            for(int p=1;p<=6;p++){
                if(o==1||o==4||p==1||p==6){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //triangular
        System.out.println("triangular");
         for(int o=1;o<=5;o++){
            for(int p=1;p<=o;p++){
                System.out.print("*");
            }
            System.out.println();
        }

        //pyramid
        System.out.println("tri pyramid");
        int row=5;
        int copyrow=row;
        for(int o=1;o<=row;o++){
            for(int p=1;p<=(copyrow-1);p++){
                System.out.print(" ");
            }
            copyrow--;
            for(int m=1;m<=(o*2-1);m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
