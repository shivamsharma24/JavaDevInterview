package behavioraldesignpatterns.ObservablePattern.Observer;

import behavioraldesignpatterns.ObservablePattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    //constructor injection
    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is in stock!!Hurry up");
    }

    private void sendEmail(String emailId, String msg){
        System.out.println("mail send to "+emailId);
    }
}
