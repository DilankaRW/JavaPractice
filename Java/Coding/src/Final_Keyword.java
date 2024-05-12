/************ final for Variable ************/
public class Final_Keyword {
    public static void main(String[] args) {
        final double  g = 9.81;
//        g = 45; // Cannot assign a value to final variable 'g'
        System.out.println(g);
    }
}


/************ final for Method ************/
//class Parent{
//    final public void say(){
//        System.out.println("Hiii");
//    }
//}
//class Child extends Parent{
//    public void say(){ //'say()' cannot override 'say()' in 'Parent'; overridden method is final
//        System.out.println("Hello");
//    }
//}
//public class Final_Keyword {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.say();
//    }
//}

/************ final for Class ************/
//final class Parent{
//}
//class Child extends Parent{ // Cannot inherit from final 'Parent'
//}

