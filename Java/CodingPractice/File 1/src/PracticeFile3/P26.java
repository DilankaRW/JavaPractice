// this keyword

package PracticeFile3;
public class P26 {
    String name;
    int age;
    P26 (String name, int age){ // Constructor method
        this.name = name; // this. keyword calls the variables created inside the class. (Not for the variables inside the constructor.)
        this.age = age;
    }
    public static void main(String[] args) {
        P26 obj = new P26("Aruna",26); // When calling the constructor, the relevant parameters should be given to it.
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
