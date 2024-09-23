package behavioraldesignpatterns.statepattern;

public class VendingMachine {

    private VendingState vendingState;

    public VendingState getVendingState() {
        return vendingState;
    }

    public void setVendingState(VendingState vendingState) {
        this.vendingState = vendingState;
    }
}
