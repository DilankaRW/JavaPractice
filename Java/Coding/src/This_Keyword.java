public class This_Keyword {
    String name;
    int age;

    This_Keyword (String name, int age){  // Constructor method
        this.name = name; // this. keyword calls the variables created inside the class. (Not for the variables inside the constructor.)
        this.age = age;
    }

    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword("Gayan",25);  // When calling the constructor, the relevant parameters should be given to it.
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
