// Method Overriding

package PracticeFile3;

public class P35 extends P34{
    public void method(){
        System.out.println("Method 4");
    }

    public static void main(String[] args) {
        P34 obj = new P35();
        obj.method(); // Output - "Method 4"
    }
}
