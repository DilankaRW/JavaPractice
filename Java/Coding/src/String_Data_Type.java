/* Strings are objects. The Java platform provides the String class to create and manipulate strings. */
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


//        char[] x = {'j','a','v','a'};
//        String str1 = new String(x);
//        System.out.println(str1);
        /* Output - java */


//        String str1 = "Hello Sri Lanka";
//        System.out.println(str1.length());
        /* Output - 15 */

//        String str1 = "Hello Sri Lanka";
//        System.out.println(str1.toUpperCase());
        /* Output - HELLO SRI LANKA */

//        String str1 = "Hello Sri Lanka";
//        System.out.println(str1.toLowerCase());
        /* Output - hello sri lanka */

//        String s1 = "Hello";
//        String s2 = "Sri Lanka";
//        System.out.println(s1+s2);
        /* Output - HelloSri Lanka */
//        System.out.println(s1.concat(s2));
        /* Output - HelloSri Lanka */

//        String s1 = "Hello";
//        String s2 = "Sri Lanka";
//        System.out.println(s1+" "+s2);
        /* Output - Hello Sri Lanka */
//        System.out.println(s1.concat(" ").concat(s2));
        /* Output - Hello Sri Lanka */

//        String s1 = "Hello";
//        System.out.println(s1.isEmpty());
        /* Output - false */

//        String s1 = "";
//        System.out.println(s1.isEmpty());
        /* Output - true */

//        String s1 = "Hello Ceylon";
//        System.out.println(s1.replace("Ceylon", "Sri Lanka"));
        /* Output - Hello Sri Lanka */

//        String s1 = "Hello Ceylon";
//        System.out.println(s1.replaceFirst("e", "E"));
        /* Output - HEllo Ceylon */

//        String s1 = "Hello Sri Lanka";
//        System.out.println(s1.contains("Sri"));
        /* Output - true */

        String s1 = "Hello Sri Lanka";
        System.out.println(s1.contains("Good"));
        /* Output - false */
    }
}
