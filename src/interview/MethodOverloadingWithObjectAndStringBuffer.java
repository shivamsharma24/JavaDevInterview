package interview;

public class MethodOverloadingWithObjectAndStringBuffer {

    void display(StringBuffer obj) {
        System.out.println("StringBuffer method");
    }

    void display(String str) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        MethodOverloadingWithObjectAndStringBuffer methodOverloadingWithObjectAndString= new MethodOverloadingWithObjectAndStringBuffer();
       //methodOverloadingWithObjectAndString.display(null);

//        To hande this null in this case we need to explicit cast null
    }
}
