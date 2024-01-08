class company{
    //constructor has same name as class
    //no return type
    company(){
        System.out.println("constructor of company class");
    }
}
class person{
    String name;
    int age;
}
class Algebra{
    int x;
    int y;
    Algebra(int a,int b){
        x=a;
        y=b;
    }
    int add(){
        return x+y;
    }
    int sub(){
        return x-y;
    }
    int mul(){
        return x*y;
    }
}
public class constructor {
    public static void main(String[] args) {
        
        company abc=new company(); //user defined
        person xyz=new person(); //default constructor

        Algebra example=new Algebra(3,4); //parameterised constructor
        System.out.println(example.add());
        System.out.println(example.sub());
        System.out.println(example.mul());
    }
}
