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

//class A{
//    void show(){
//        System.out.println("Hi");
//    }
//}
//class B extends A{
//    void show(){
//        super.show(); // Super keyword
//        System.out.println("Hello");
////        Output - Hi
////        Hello
//    }
//}
//public class P17 {
//    public static void main(String[] args) {
//        B obj = new B();
//        obj.show();
//    }
//}

// Super keyword for constructors

class Student{
    int age;
    String school;
    String email;
    Student (int age, String school, String email){
        this.age = age;
        this.school = school;
        this.email = email;
    }
}

class  Kamal extends Student{
    int marks;
    Kamal(int age, String school, String email, int marks){
        super(age,school,email); // Super keyword
        this.marks = marks;
    }
}

public class P17 {
    public static void main(String[] args) {
        Kamal obj = new Kamal(15,"ABCD","hello@email.com",50);
        System.out.println(obj.marks);
    }
}