public class Abstract_Class_Method_Two extends Abstract_Class_Method_One{
    void drink(){
        System.out.println("Drinking");
    }

    /* After entering a content to the abstract method contained in the abstract class, the abstract method can be called through the object. */
    void run(){ // Abstract_Class_Method_One's method
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Abstract_Class_Method_Two obj = new Abstract_Class_Method_Two();
        obj.drink();
        obj.eat();
    }
}
