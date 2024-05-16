//class AAA extends Thread{ // Inherit to Thread class
//    public void run(){ // This method should be named run.
//        for(int i = 0; i<10; i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(500); // for delay
//            }catch (Exception e){}
//        }
//    }
//}
//class BBB extends Thread{ // Inherit to Thread class
//    public void run(){ // This method should be named run.
//        for(int i = 0; i<10; i++){
//            System.out.println("World");
//            try {
//                Thread.sleep(500); // for delay
//            }catch (Exception e){}
//        }
//    }
//}
//public class Multithreading {
//    public static void main(String[] args) {
//        AAA obj1 = new AAA();
//        obj1.start();
//
//        try {
//            Thread.sleep(50); // for delay
//        }catch (Exception e){}
//
//        BBB obj2 = new BBB();
//        obj2.start();
//    }
//}


/************ Thread Create with Runnable Interface ************/

class AAA implements Runnable{ // Inherit to Runnable Interface
    public void run(){ // This method should be named run.
        for(int i = 0; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500); // for delay
            }catch (Exception e){}
        }
    }
}
class BBB implements Runnable{ // Inherit to Runnable Interface
    public void run(){ // This method should be named run.
        for(int i = 0; i<10; i++){
            System.out.println("World");
            try {
                Thread.sleep(500); // for delay
            }catch (Exception e){}
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        AAA obj1 = new AAA();
        Thread o1 = new Thread(obj1); // Thread object for class AAA
        o1.start();

        try {
            Thread.sleep(50); // for delay
        }catch (Exception e){}

        BBB obj2 = new BBB();
        Thread o2 = new Thread(obj2); // Thread object for class AAA
        o2.start();
    }
}