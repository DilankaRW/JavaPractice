/********* Method Overriding *********/
public class Polymorphism_Two extends Polymorphism {
    public void method(){
        System.out.println("Method 4");
    }
    public static void main(String[] args) {
        Polymorphism_Two obj = new Polymorphism_Two();
        obj.method();

        /* This is Method Overriding */
        /* Output - "Method 4"  (Without Polymorphism_Two's method, output will be "Method 1" (Because the class has been Inherit (extended).)) */
    }
}
