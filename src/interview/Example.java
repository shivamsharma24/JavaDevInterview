package interview;

public class Example {

    // Method with one parameter and public scope
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    // Overloaded method with two parameters and private scope
    private void display(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }

}