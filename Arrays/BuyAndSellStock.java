public class BuyAndSellStock {
    public int buyStocks(int[] prices){
        
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =1;i<prices.length;i++){
            if(prices[i] < minProfit){
                minProfit = prices[i];
            }
            int profit = prices[i] - minProfit;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BuyAndSellStock ab = new BuyAndSellStock();
        int ans = ab.buyStocks(prices);
        System.out.println(ans);
        
    }
}
