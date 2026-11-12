class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = finish[i];
            
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int ans = 0;
        //1st activity
        ans = 1;
        int lastFinish = activities[0][2];
        for(int i=1; i<finish.length; i++){
            if(activities[i][1] > lastFinish){
                ans++;
                lastFinish = activities[i][2];
            }
        }
        return ans;
    }
}
