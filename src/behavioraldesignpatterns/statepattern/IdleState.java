package behavioraldesignpatterns.statepattern;

public class IdleState implements VendingState{
    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("coin inserted");
        product.setVendingState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        //not doing anything here
    }
}
