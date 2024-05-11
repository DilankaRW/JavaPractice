/********* Method Overloading *********/
public class Polymorphism {
    public void method(){
        System.out.println("Method 1");
    }
    public void method(int x){
        System.out.println("Method 2");
    }
    public void method(double y){
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.method();
        /* Output - Method 1*/

        obj.method(10);
        /* Output - Method 2*/

        obj.method(10.5);
        /* Output - Method 3*/
    }
}
