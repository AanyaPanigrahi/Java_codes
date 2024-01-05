import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //loops to avoid code repitition & run multiple times

        //while
        System.out.println("enter num");
        int num=sc.nextInt();
        //sum of n natural nums
        int sum=0;
        while(num>0){
            sum+=num;
            num--;
        }
        System.out.println("sum is "+sum);

        //for(initialisation;termination;pattern){}
        //printing all nums <= input from 1
        System.out.println("input num");
        int input=sc.nextInt();
        for(int i=1;i<=input;i++){
            System.out.println(i);
        }

        //all optional conditions
        //can init before, end with break inside, pattern within code
        //factorial of n
        System.out.println("enter n ");
        int n=sc.nextInt();
        int i=1;
        int res=1;
        for(;;){
            if(i>n){
                break; //terminates loop
            }
            res*=i;
            i++;
        }
        System.out.println("factorial of n "+res);

        //do while(runs atleast once)
        do{
            System.out.println(n);
            n--;
        }while(n>0);

        //first multiple of 5 and 7
        int ans;
        System.out.println("multiple check");
        //while(true){with break}
        for(int j=1;;){
            if(j%5==0 && j%7==0){
                ans=j;
                break;
            }
            j++;
        }
        System.out.println("ans: "+ans);

        //continue keyword
        //1-10,multiples of 2 excluded
        //use of labels
        printloop:for(int k=1;k<=10;k++){
            if(k%2==0){
                continue printloop; //skips that iteration
            }
            System.out.println(k);
        }
    }
}
