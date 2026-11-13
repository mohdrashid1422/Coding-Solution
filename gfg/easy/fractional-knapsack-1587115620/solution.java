class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double ans = 0; 
        double ratio[][] = new double[val.length][2];
        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){ // totol value add 
                capacity = capacity - wt[idx];
                ans = ans + val[idx];
            }else{
                // fractional value 
                ans = ans + (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return ans;
    }
}