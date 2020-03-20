/*
Leetcode problem : 283
https://leetcode.com/problems/move-zeroes/
*/
class MoveZeros {
    public void moveZeroes(int[] nums) {
        int nonZeroIdx = 0;
        int len = nums.length;
        for(int i = 0; i< len; i++){
            if(nums[i] != 0){
                nums[nonZeroIdx] = nums[i];
                nonZeroIdx++;
            }
        }

        for(int i = nonZeroIdx; i < len; i++){
            nums[i] = 0;
        }


    }
}
