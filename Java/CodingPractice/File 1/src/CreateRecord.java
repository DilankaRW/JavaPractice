// Create a record in Java.

public class CreateRecord {
    public record Person(String name, int age) {}
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);
    }
}
