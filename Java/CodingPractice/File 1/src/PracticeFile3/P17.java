// Super keyword

package PracticeFile3;

// Super keyword for Variables

//class A{
//    int x = 10;
//}
//class B extends A{
//    int x=15;
//    public void print(){
//        System.out.println(x);
//        // output - 15
//        System.out.println(super.x); // Super keyword
//        // output - 10
//    }
//}
//public class P17 {
//    public static void main(String[] args) {
//        B obj = new B();
//        obj.print();
//    }
//}


// Super keyword for methods

class A{
    void show(){
        System.out.println("Hi");
    }
}
class B extends A{
    void show(){
        super.show(); // Super keyword
        System.out.println("Hello");
//        Output - Hi
//        Hello
    }
}
public class P17 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}