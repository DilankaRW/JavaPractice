/* Super keyword for Variables */
// class AA{
//    int x =10;
// }

// class BB extends AA{
//    int x = 15;
//    public void print(){
//        System.out.println(x);
//        /* Output - 15 */
//        System.out.println(super.x); // Super keyword
//        /* Output - 10 */
//    }
// }
// public class Super_keyword {
//    public static void main(String[] args) {
//        BB obj = new BB();
//        obj.print();
//    }
// }


/* Super keyword for methods */
class AA{
   void show(){
       System.out.println("Hi");
   }
}

class BB extends AA{
   void show(){
       super.show(); // Super keyword
       System.out.println("Hello");
       /* Output - Hi, Hello */
   }
}
public class Super_keyword {
   public static void main(String[] args) {
       BB obj = new BB();
       obj.show();
   }
}


/* Super keyword for constructors */
// class Student{
//     int age;
//     String school;
//     String email;
//     Student(int age, String school, String email){
//         this.age = age;
//         this.school = school;
//         this.email = email;
//     }
// }

// class Kamal extends Student{
//     int marks;
//     Kamal(int age, String school, String email, int marks){
//         super(age, school, email); // Super keyword
//         this.marks = marks;
//     }
// }

// public class Super_keyword {
//     public static void main(String[] args) {
//         Kamal obj = new Kamal(15,"ABCD","hello@email", 75);
//         System.out.println(obj.marks);
//         /* Output - 75*/
//     }
// }