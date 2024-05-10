/* Single Inheritance / Multilevel Inheritance / Hierarchical Inheritance */
/* Single Inheritance - Inheritance_Two extends to Inheritance_One */
/* Multilevel Inheritance - Inheritance_Three extends to Inheritance_Two then Inheritance_Three can access Inheritance_Two and Inheritance_One. */
/* Hierarchical Inheritance - Inheritance_Two extends to Inheritance_One and Inheritance_Three extends to Inheritance_One. */
public class Inheritance_One {
    String name;
    void call(){

    }
    void message(){

    }

    public static void main(String[] args) {
        Inheritance_One obj1 = new Inheritance_One();
    }
}
