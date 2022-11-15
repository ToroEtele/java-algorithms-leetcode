public class MaximizeProfits {
    //Dynamic Programming Solution
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;   //If there are no prices return 0

        int minStockPrice = prices[0];  //We will keep track of the minimum stock price
        int bestDeal = 0;               //And the best deal currently


        for (int i = 0; i < prices.length; i++) {   //Loop trough every day's prices
            minStockPrice = Math.min(prices[i], minStockPrice); //If the price is less than minimum, swap => we need to keep track only
            //of the smallest price because that gives the maximum profit on the following days
            bestDeal = Math.max(prices[i] - minStockPrice, bestDeal);   //Calculate the profit since the minimum price, ans swap if better
        }

        return bestDeal;
    }

    //Greedy Solution
    public static int maxProfitGreedy(int[] prices) {
        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {
            if(min<prices[i])                   //if the min is less than current price
                max=Math.max(prices[i]-min,max);//calculate the profit between them, if bigger than max save it
            else
                min=prices[i];                  //else save the new min price
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Dynamic programming solution:" + maxProfit(prices));
        System.out.println("Greedy solution:" + maxProfitGreedy(prices));
    }
}
