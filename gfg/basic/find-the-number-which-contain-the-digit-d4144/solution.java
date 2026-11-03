class Solution {
    public List<Integer> findNumbers(int n, int d) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(d == 0){
            list.add(d);
        }
        for(int i=1; i<=n; i++){
            int num = i;
            while(num>0){
                int digit = num % 10;
                if(digit == d){
                    list.add(i);
                    break;
                }
            num = num/10;
                
            }
            
        }
        return list;
    }
}