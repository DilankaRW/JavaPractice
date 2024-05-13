public interface Abstract_Interface_One {
    int number = 10; // final variable - variables created inside an interface are final variables. no need final keyword.

    /* In an interface, only methods without a body are used. (Abstract Method) */
    /* void test(){} // Interface abstract methods cannot have body. */
    void eat(); // Abstract method - method created inside an interface are abstract method. no need Abstract keyword.
    void drink();
    void run();

}
