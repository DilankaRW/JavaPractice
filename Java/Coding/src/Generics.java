class Wow<T>{
    void print(T x){
        T y = (T) x;
        System.out.println(y);
    }
}
public class Generics {
    public static void main(String[] args) {
        Wow<Integer> obj = new Wow();
        obj.print(34);
        /* Output - 34 */
    }
}
