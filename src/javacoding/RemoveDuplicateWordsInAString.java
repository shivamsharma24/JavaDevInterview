package javacoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsInAString {
    public static void main(String[] args) {
        String str="I am ukg I am in ukg software";

        String result = Arrays.stream(str.split("\\s+"))
                .distinct()
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
