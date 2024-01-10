import oneee.accessspecifier;
public class outsidepackageone {
    public static void main(String[] args) {
        accessspecifier obj3=new accessspecifier();
        System.out.println("outside package non child class: "+obj3.str1);
        class4 obj4=new class4();
        obj4.print();
        
    }

}

//child class        //parent class
class class4 extends accessspecifier{
    void print(){
        accessspecifier obj=new accessspecifier();
        System.out.println("outside package child class: "+obj.str1);
    }
}
