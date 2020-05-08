/*
https://leetcode.com/problems/missing-number/submissions/
268
*/
class MissingNumber {
    public int missingNumber(int[] nums) {
       int sum = 0;
        int n = nums.length;
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i< n; i++){
            sum += nums[i];
        }
        return ((n*(n+1)/2)  - sum);
    }
}

/**
class Solution {
    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length+1];
        for(int i=0; i< nums.length; i++){
            count[nums[i]]++;
        }
        for(int i = 0; i< count.length; i++){
            if(count[i] == 0){
                return i;
            }
        }
        return -1;

    }
}
**/
