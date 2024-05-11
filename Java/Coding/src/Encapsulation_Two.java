/*
Encapsulation is the process of binding data and methods in a single unit.
In encapsulation, data(variables) are declared as private and methods are declared as public.
The main advantage of encapsulation is that data is hidden and protected from randomly access by outside non-member methods of a class.
*/
public class Encapsulation_Two {
    public static void main(String[] args) {
        Encapsulation_One obj = new Encapsulation_One();
        obj.setName("Kamal");
        System.out.println(obj.getName());
        obj.setAge(25);
        System.out.println(obj.getAge());
    }
}