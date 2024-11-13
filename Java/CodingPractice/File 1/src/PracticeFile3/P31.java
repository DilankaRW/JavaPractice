// Generics

package PracticeFile3;

class Wow<T>{ // Generics type class - This is a generic class declaration where T is a type parameter. It means that Wow can be instantiated with any reference type.
    void print(T x){
        T y = (T) x;
        System.out.println(y);
    }
}
public class P31 {
    public static void main(String[] args) {
        Wow<Integer> obj = new Wow();
        obj.print(34);
        // Output - 34
    }
}
