/* A for loop is a repetition control structure that allows you to efficiently write a loop that needs to be executed a specific number of times. */
public class For_Loop {
    public static void main(String[] args) {
//        for (int i = 1; i<=10; i++){
//            System.out.println(i);
//        }
        /* Output - 1,2,3,4,5,6,7,8,9,10 */


//        for (int i = 1; i<=10; i++){
//            System.out.println("Hello");
//        }
        /* Output - Hello is displayed ten times (Hello,Hello,Hello,Hello...) */


//        for (int i = 10; i>0; i--){
//            System.out.println("Hello");
//        }
        /* Output - Hello is displayed ten times (Hello,Hello,Hello,Hello...) */


//        for (int i = 10; i>0; i--){
//            System.out.println(i);
//        }
        /* Output - 10,9,8,7,6,5,4,3,2,1 */


//        String[] names = {"Kamal", "Nimal", "Saman"};
//        for (int i=0; i<3; i++){
//            System.out.println(names[i]);
//        }
        /* Output - Kamal, Nimal, Saman */


        String[] names = {"Kamal", "Nimal", "Saman"};
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        /* Output - Kamal, Nimal, Saman */

    }
}
