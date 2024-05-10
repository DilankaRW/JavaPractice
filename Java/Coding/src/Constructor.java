public class Constructor {
    String name;
    /* Constructor method | The name of class is used for name of this method. / No return type (void)*/
    Constructor(){
        name = "Kamal";
        System.out.println("Welcome");
    }

    void meth(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
//        Constructors obj = new Constructors(); // Automatically call to Constructor method.
//        obj.meth();
        /* Output - Welcome, Hello */

        Constructor obj = new Constructor(); // Constructors(); this is Constructor. Automatically call to Constructor method.
        System.out.println(obj.name);
        /* Output - Welcome, Kamal */

    }
}
