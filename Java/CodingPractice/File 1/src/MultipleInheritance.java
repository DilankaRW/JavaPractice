// Diamond problem with multiple inheritance.

// The diamond problem is a common issue in multiple inheritance scenarios. Java does not support multiple inheritance for classes to avoid such complexities, but it does support multiple inheritance through interfaces.
public class MultipleInheritance {

    interface I {
        void foo();
    }
    class A implements I {
        public void foo() {}
    }

    class B implements I {
        public void foo() {}
    }

//    class C extends A, B { // won't compile
//        public void bar() {
//            super.foo();
//        }
//    }
}
