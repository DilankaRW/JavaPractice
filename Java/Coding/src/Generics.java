//class Wow<T>{ // Generics type class - This is a generic class declaration where T is a type parameter. It means that Wow can be instantiated with any reference type.
//    void print(T x){
//        T y = (T) x;
//        System.out.println(y);
//    }
//}
//public class Generics {
//    public static void main(String[] args) {
//        Wow<Integer> obj = new Wow();
//        obj.print(34);
//        /* Output - 34 */
//    }
//}



public class Generics <T>{
    T[] arr = (T[]) new Object[3]; // // Generics type array

    public static void main(String[] args) {
        Generics obj = new Generics();
        obj.arr[0] = 32;
        obj.arr[1] = "Hello";
        System.out.println(obj.arr[1]);
    }
}
