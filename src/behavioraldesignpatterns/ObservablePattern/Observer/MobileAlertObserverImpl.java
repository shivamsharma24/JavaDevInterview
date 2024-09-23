package behavioraldesignpatterns.ObservablePattern.Observer;

import behavioraldesignpatterns.ObservablePattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product in hurry up!!!");
    }

    private void sendMsgOnMobile(String userName,String msg){
        System.out.println("msg sent to :: "+userName);
    }
}
