//only 1 public class acceptable
//public class is prefered to have main function
class employee{
     int age=30;
    int salary;
    String name;
}
public class oops {
    //creating class
    //access modifier,class keyword,class name,body name
    //constructor!
    public static void main(String[] args) {
        //creating obj
        //className objName = new className();
        employee a=new employee();
        System.out.println(a.age); //30
        System.out.println(a.salary); //int - 0
        System.out.println(a.name); //string - null

        employee b=new employee();
        b.salary=100000;
        b.name="Ariana";
        b.age=28;
        System.out.println(b.age); //28
        System.out.println(b.salary); //100000
        System.out.println(b.name); //Ariana
        
    }
}
