public class String_Data_Type {
    public static void main(String[] args) {

//        String s1 = "Java";
//        String s2 = "Java";
//        if (s1==s2)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        /* Output - Yes */


//        String s1 = new String("Java");
//        String s2 = new String("Java");
//        if (s1==s2)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        /* Output - No */


        char[] x = {'j','a','v','a'};
        String str1 = new String(x);
        System.out.println(str1);
        /* Output - java */
    }
}
