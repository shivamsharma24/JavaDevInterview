package interview;

public class CallByValueExample {
    public static void main(String[] args) {
        int n=5;
        modifyNumber(n);
        System.out.println("Value outside method is "+n);

    }

    public static void modifyNumber(int n){
        n=n+10;
        System.out.println("Value inside method is "+n);
    }
}
