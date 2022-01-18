public class deliverNoProductforInsfInventoryState implements vendingMachineState {

    String output;

    @Override
    public void reqActionforProductNChange(vendingMachine vndngMchn, int choice, int change) {
        output="Drinks = None\n";
        output+="Change = 0\n";
    }

    @Override
    public String toString() {
        return output + "Product can't be delivered due to insufficient inventory";
    }

}
