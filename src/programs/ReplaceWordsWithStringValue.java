package programs;

import java.util.Arrays;
import java.util.List;

public class ReplaceWordsWithStringValue {
    public static void main(String[] args) {
        String[] a = {"cat", "bat", "rat"};
        String sentence = "the cattle is battle and rattle";

        List<String> wordList = Arrays.asList(a);

        for (String word : wordList) {
            sentence = sentence.replaceAll(word + "\\w*", word);
        }
        System.out.println(sentence);
    }
}