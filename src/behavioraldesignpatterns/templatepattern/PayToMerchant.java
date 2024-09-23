package behavioraldesignpatterns.templatepattern;

public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validation logic of pay to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("1% fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit amt logic of pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit amt logic of pay to friend");
    }
}
