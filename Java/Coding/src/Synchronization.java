class Display{
    synchronized void print(){
        Thread t = Thread.currentThread();

        /* synchronized (this){
            // Content
        } */

        for (int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(t.getName());
            }catch (Exception e){}
        }
    }
}

class T extends Thread{
    Display c;

    T(Display c){
        this.c = c;
    }

    public void run(){
        c.print();
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Display obj = new Display();

        T t1 = new T(obj);
        T t2 = new T(obj);

        t1.start();
        t2.start();
    }
}

/*
Output (with synchronized) -
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
*/

/*
Output (without synchronized) -
Thread-0
Thread-1
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-0
Thread-1
*/