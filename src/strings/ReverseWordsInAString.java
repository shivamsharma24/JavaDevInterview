package strings;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Shivam is awesome";
        String result = reverseWord(s);
        System.out.println(result);
    }

    public static String reverseWord(String input) {
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i].trim());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
