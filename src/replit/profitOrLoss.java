package replit;

public class profitOrLoss {
    public static String c_profits(int buyPrice, int sellPrice){
        int profit = sellPrice - buyPrice;
        if (profit > 0){
            return "profit";
        }else if(profit < 0 ){
            return "loss";
        }else {
            return "no loss";
        }
    }

    public static void main(String[] args) {
        System.out.println(c_profits(100,100));
    }


}
