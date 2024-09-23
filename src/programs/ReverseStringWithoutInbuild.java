package programs;

public class ReverseStringWithoutInbuild {
    public static void main(String[] args) {
        String str = "shivam sharma";
        char[] ch = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        System.out.println(new String(ch));
    }
}
