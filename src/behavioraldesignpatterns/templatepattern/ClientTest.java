package behavioraldesignpatterns.templatepattern;

public class ClientTest {
    public static void main(String[] args) {
        PaymentFlow obj = new PayToFriend();
        obj.sendMoney();
    }
}
