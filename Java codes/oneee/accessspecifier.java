package oneee;

public class accessspecifier {
    protected String str1="I am a public member";
    void printFromClass(){
        System.out.println("within class : "+str1);
    }
    public static void main(String[] args) {
        accessspecifier obj1=new accessspecifier();
        obj1.printFromClass();
        System.out.println("within class : "+obj1.str1);
        class2 obj2=new class2();
        obj2.printFromOutsideClass();
    }
}

class class2{
    void printFromOutsideClass(){
        accessspecifier obj = new accessspecifier();
        System.out.println("within package, outside class "+obj.str1);
    }
}

