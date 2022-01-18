public class deliverProductNChangeState implements vendingMachineState {

    String output;

    @Override
    public void reqActionforProductNChange(vendingMachine vndngMchn, int choice, int change) {
        output="Drinks = ";
        if(choice==1){
            output+="Pepsi\n";
            vndngMchn.noOfPepsi--;
            vndngMchn.balance+=vndngMchn.priceOfPepsi;
        }
        else{
            output+="SevenUp\n";
            vndngMchn.noOfSevenUp--;
            vndngMchn.balance+=vndngMchn.priceOfSevenUp;
        }
        
        output+="Change = "+change+"\n";
    }

    @Override
    public String toString() {
        return output + "Product and change delivered";
    }

}
