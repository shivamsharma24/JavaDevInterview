package javacoding;

public class Print1To100WithoutLoops {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n){
        if(n>100)
            return;
        System.out.println(n);
        n++;
        print(n);
    }
}
