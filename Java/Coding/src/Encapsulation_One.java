/*
Encapsulation is the process of binding data and methods in a single unit.
In encapsulation, data(variables) are declared as private and methods are declared as public.
The main advantage of encapsulation is that data is hidden and protected from randomly access by outside non-member methods of a class.
*/
public class Encapsulation_One {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}