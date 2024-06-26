//public class Static_Keyword {
//    int x;
//    static int y;
//    void meth1(){
//    }
//    static void meth2(){
//    }
//    public static void main(String[] args) {
//
//        /* Static variables / methods can be directly accessed without creating any object. */
//        y=5;
//        meth2();
//
//        /* non-static variables / methods cannot be accessed directly */
////        x=4;
////        meth1();
//
//        /* If we want to access non-static variables / methods, we have to create an object in this way and access it. */
//        Static_Keyword obj = new Static_Keyword();
//        obj.x=4;
//        obj.meth1();
//
//        /* ****** Creating an object and accessing it has a big advantage. ***** */
//    }
//}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//public class Static_Keyword {
//    static String name1;
//    static String name2;
//    static String name3;
//
//    static void call1(){
//        System.out.println("take a call from "+ name1);
//    }
//    static void call2(){
//        System.out.println("take a call from "+ name2);
//    }
//    static void call3(){
//        System.out.println("take a call from "+ name3);
//    }
//    public static void main(String[] args) {
//        name1 = "samsung";
//        name2 = "nokia";
//        name3 = "huawei";
//
//        call1();
//        call2();
//        call3();
//
//        /* Output */
//        /* take a call from samsung */
//        /* take a call from nokia */
//        /* take a call from huawei */
//    }
//}


///////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Static_Keyword {
    String name;
    void call(){
        System.out.println("take a call from " + name);
    }
    public static void main(String[] args) {
        Static_Keyword phone1 = new Static_Keyword();
        Static_Keyword phone2 = new Static_Keyword();
        Static_Keyword phone3 = new Static_Keyword();
        phone1.name = "nokia";
        phone2.name = "samsung";
        phone3.name = "huawei";
        phone2.call();
        phone1.call();

        /* Output */
        /* take a call from samsung */
        /* take a call from nokia */
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

//public class Static_Keyword {
//    void call(String name){
//        System.out.println("take a call from " + name);
//    }
//    public static void main(String[] args) {
//        Static_Keyword phone = new Static_Keyword();
//        phone.call("nokia");
//    }
//    /* Output - take a call from nokia */
//}