package strings;

public class ConvertStringObjectToStringLiteral {
    public static void main(String[] args) {
        // Creating a String object using the new keyword
        String str1 = new String("Hello World");

        // Converting it to a String literal
        String str2 = str1.intern();

        // Comparing references
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str2 == \"Hello World\": " + (str2 == "Hello World")); // true
    }
}
