public class profitable_stock {
    public static void main(String[] args) {
        int prices[] = { 7,1,5,3,6,4};
        System.out.println(profitableStock(prices));
    }

    public static int profitableStock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                Maxprofit = Math.max(Maxprofit,profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return Maxprofit;
    }
}

