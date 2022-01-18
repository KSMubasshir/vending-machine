import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int coin, choice, change;
        vendingMachine vndngMchn = new vendingMachine();
        vendingMachineState vndngMchnSt;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Choice:\n1.Pepsi\n2.7Up");
            choice = scn.nextInt();
            System.out.println("Enter Coin:");
            coin = scn.nextInt();
            change = coin - vndngMchn.getPrice(choice);
            if (vndngMchn.isAvailable(choice)) {

                if (change >= 0) {
                    if (change == 0) {
                        vndngMchnSt = new deliverProductNoChangeState();
                        vndngMchnSt.reqActionforProductNChange(vndngMchn, choice, change);
                    } else {
                        vndngMchnSt = new deliverProductNChangeState();
                        vndngMchnSt.reqActionforProductNChange(vndngMchn, choice, change);
                    }
                } else {
                    vndngMchnSt = new deliverNoProductforInsfBalState();
                    vndngMchnSt.reqActionforProductNChange(vndngMchn, choice, change);
                }

            } else {
                vndngMchnSt = new deliverNoProductforInsfInventoryState();
                vndngMchnSt.reqActionforProductNChange(vndngMchn, choice, change);
            }

            System.out.println(vndngMchnSt);
        }

    }

}
