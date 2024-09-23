package shivam.functionalinterface;

@FunctionalInterface
public interface FunctionalCalci {
    int abstractMethod(int x,int y);

    default void display(int result){
        System.out.println("Result is "+result);
    }

    static void greet(){
        System.out.println("Welcome");
    }

}

