class Employee extends Object{ // No need to extends to Object class. it's already extended to all classes.
    String name = "Kamal";
    int age = 15;
    void run(){
    }
    void eat(){
    }
}
public class Object_Class extends Employee{
    public static void main(String[] args) {

        Object o1 =new Object(); // Object from Object class (java default class (Parent class of all classes))
        System.out.println(o1.getClass());
        /* Output - class java.lang.Object */

        Employee obj = new Employee();
        System.out.println(obj.getClass());
        /* Output - class Employee */
    }
}
