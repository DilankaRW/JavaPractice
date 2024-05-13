public class Abstract_Interface_Two implements Abstract_Interface_One {
    /* The "implements" keyword is used when inheriting an interface. */
    public void eat(){ // Implements method in Abstract_Interface_One
        System.out.println("Eating");
    }
    public void drink(){ // Implements method in Abstract_Interface_One
        System.out.println("Drinking");
    }
    public void run(){ // Implements method in Abstract_Interface_One
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Abstract_Interface_One x = new Abstract_Interface_Two();
        System.out.println(Abstract_Interface_One.number);
        // Abstract_Interface_One.number = 15; // Cannot assign a value to final variable 'number'
    }
}
