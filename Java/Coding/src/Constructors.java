/* Constructor Overloading */
/* Constructors can be overloaded, meaning you can define multiple constructors with different parameter lists. This allows objects to be initialized in different ways. */
public class Constructors {
    int rupees;
    Constructors(){
        rupees = 0;
    }
    Constructors(int x){
        rupees = x;
    }

    public static void main(String[] args) {
        Constructors Kamal = new Constructors();
        Constructors Sunil = new Constructors(20);
        System.out.println(Kamal.rupees);
        /* Output - 0 */
        System.out.println(Sunil.rupees);
        /* Output - 20 */
    }
}
