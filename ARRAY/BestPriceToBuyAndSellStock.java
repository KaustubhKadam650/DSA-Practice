public class BestPriceToBuyAndSellStock {
    
        public static int maxProfit(int[] prices) {
        if(prices == null || prices.length==0){
            return 0;
        }
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i< prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }else if(prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }return maxprofit;
    }
    
    public static void main(String[] args) {
        int [ ] prices ={7,1,3,5,6,4};

        System.out.println(maxProfit(prices));
    }
}
