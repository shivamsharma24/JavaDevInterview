package interview;

public class MethodOverloadingWithObjectAndString {

    void display(Object obj) {
        System.out.println("Object method");
    }

    void display(String str) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        MethodOverloadingWithObjectAndString methodOverloadingWithObjectAndString= new MethodOverloadingWithObjectAndString();
        methodOverloadingWithObjectAndString.display(null);
    }
}
