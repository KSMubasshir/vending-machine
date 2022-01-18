public class vendingMachine{
    
    public int noOfPepsi;
    public int noOfSevenUp;
    public int priceOfPepsi;
    public int priceOfSevenUp;
    public int balance;
    private vendingMachineState vndngMchnSt;

    public vendingMachine() {
        noOfPepsi=2;
        noOfSevenUp=2;
        priceOfPepsi=15;
        priceOfSevenUp=12;
        balance=100;
    }
    
    public vendingMachineState getVendingMachineState() {
        return vndngMchnSt;
    }

    public void setVendingMachineState(vendingMachineState vendingMachineState) {
        this.vndngMchnSt = vendingMachineState;
    }
    public int getBalance(){
        return balance;
    }
    public int getPrice(int choice){
        if(choice==1){
            return priceOfPepsi;
        }
        else{
            return priceOfSevenUp;
        }
    }
    public boolean isAvailable(int choice){
        if(choice==1){
            if(noOfPepsi==0){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(noOfSevenUp==0){
                return false;
            }
            else{
                return true;
            }
        }
    }
    
}
