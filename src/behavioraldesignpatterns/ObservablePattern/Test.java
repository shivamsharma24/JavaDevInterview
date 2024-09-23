package behavioraldesignpatterns.ObservablePattern;

import behavioraldesignpatterns.ObservablePattern.Observable.IPhoneObservableImpl;
import behavioraldesignpatterns.ObservablePattern.Observable.StocksObservable;
import behavioraldesignpatterns.ObservablePattern.Observer.EmailAlertObserverImpl;
import behavioraldesignpatterns.ObservablePattern.Observer.MobileAlertObserverImpl;

public class Test {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IPhoneObservableImpl();

        EmailAlertObserverImpl observer1= new EmailAlertObserverImpl("shivam@gmail.com",iphoneStockObservable);
        EmailAlertObserverImpl observer2= new EmailAlertObserverImpl("mini@gmail.com",iphoneStockObservable);
        MobileAlertObserverImpl observer3 = new MobileAlertObserverImpl("shivam", iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(10);
    }
}
