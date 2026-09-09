class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int sellPrice = 0;
        for(int i = 0; i<prices.length; i++){
            if (prices[i]< minPrice){
                minPrice=prices[i];
            }
            int price = prices[i] -minPrice;
            sellPrice = Math.max(sellPrice, price);
        }
        return sellPrice;
    }
}