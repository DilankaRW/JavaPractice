// Create a record in Java

package PracticeFile3;

public class P14 {
    public record Person(String name, int age){}

    public static void main(String[] args) {
        Person person = new Person("Trump",70);
        System.out.println(person);
    }
}
