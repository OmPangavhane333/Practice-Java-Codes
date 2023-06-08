public class Stocks {

    public static int BuySellStocks(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        int n = prices.length;
        for (int i=0; i<n; i++){
            if(BuyPrice < prices[i] ){
                int profit = prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else {
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit is:- "+ BuySellStocks(prices));

    }
}
