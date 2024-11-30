// Method Overloading

package PracticeFile3;

public class P34 {
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
        P34 obj = new P34();
        obj.method(); // Output - Method 1

        obj.method(20); // Output - Method 2

        obj.method(20.5); // Output - Method 3
    }
}
