class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptybottles=0;
        int drinkedbottles=0;

        while(numBottles>0){
            drinkedbottles+=numBottles;
            emptybottles+=numBottles;
            numBottles=emptybottles/numExchange;
            emptybottles=emptybottles%numExchange;
                 
            
        }
        return drinkedbottles;
        
    }
}