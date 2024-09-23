package behavioraldesignpatterns.templatepattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();

    //so that implementation class cannot override
    //this is the template method which defines the order of steps to execute the task
    public final void sendMoney() {
        //step1
        validateRequest();

        //step2
        debitAmount();

        //step3
        calculateFees();

        //step4
        creditAmount();
    }
}
