class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        // ArrayList<Integer> list = new ArrayList<>();
        // int sum = 0; 
        // for(int i=0; i<arr.length; i++){
        //     sum += arr[i];
        //     list.add(sum);
        // }
        // return list;
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(prefix[i]);
        }
        return list;
        
    }
}