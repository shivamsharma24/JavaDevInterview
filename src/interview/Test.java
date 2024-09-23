package interview;

class A {
     static int i = 10;
}

class B extends A {
    static int i = 20;
}

public class Test {
    public static void main(String[] args) {
        A a1 = new B();
        System.out.println(a1.i);  // What will be printed?
    }
}