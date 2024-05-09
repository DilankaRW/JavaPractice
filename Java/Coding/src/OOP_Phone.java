/*
What is a Class -
A class is simply a representation of a type of object. Class is considered as the blueprint for the object.
*/
public class OOP_Phone {
    String name;
    String color;
    int ram;

    public void call(){
        System.out.println("Take a call from " + name);
    }

    public void browseInternet(){
        System.out.println("browse internet");
    }
    public static void main(String[] args) {
        /*
        What is an Object -
        An object is an instance of a class. It has its own state, behavior and identity.
        */
        OOP_Phone phone1 = new OOP_Phone();
        phone1.name = "samsung";
        phone1.color = "black";
        phone1.call();

        OOP_Phone phone2 = new OOP_Phone();
        phone2.name = "LG";
        phone2.call();
        System.out.println(phone1.color);

        /* Take a call from samsung */
        /* Take a call from LG */
        /* black */
    }
}
