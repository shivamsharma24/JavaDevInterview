package programs;

public class ReverseOfWords {
    public static void main(String[] args) {
        String str="HELLO ALL TODAY";

        System.out.println(reverseWords(str));
    }


    public static String reverseWords(String sentence) {
        StringBuilder stringBuilder= new StringBuilder();
        int start=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                if(stringBuilder.length()>0){
                    stringBuilder.insert(0," ");
                }
                stringBuilder.insert(0,sentence.substring(start,i));
                start=i+1;
            }
        }
        if(stringBuilder.length()>0){
            stringBuilder.insert(0," ");
        }
        stringBuilder.insert(0,sentence.substring(start));
        return stringBuilder.toString();
    }
}
