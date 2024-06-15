// Examples of overloading and overriding.
// When a class has two or more methods with the same name, they are called overloaded methods.
public class OverloadingOverriding {
    void print(String s){
        System.out.println(s);
    }

    void print(String s, int count){
        while (count > 0){
            System.out.println(s);
            count--;
        }
    }
}
