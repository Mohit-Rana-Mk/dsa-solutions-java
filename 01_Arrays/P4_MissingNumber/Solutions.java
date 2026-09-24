class Solution {
    public int missingNumber(int[] nums) {
        int Sum = 0;
        int n = nums.length;
        int sum = (n*(n+1))/2;
        for (int i=0; i<n ; i++){
            Sum = Sum + nums[i]; 
        }
        return sum - Sum;
    }
}
