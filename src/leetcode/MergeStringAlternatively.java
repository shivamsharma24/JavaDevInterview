package leetcode;

//Time Complexity is:  O(n + m)
//Space Complexity: O(n + m)
public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "shivam";
        String word2 = "sharmatyu";
        System.out.println(mergeAlternative(word1, word2));
    }

    public static String mergeAlternative(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        boolean flag = true;

        while (i < word1.length() && j < word2.length()) {
            if (flag) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }
        while (i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
