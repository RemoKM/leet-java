/*
Leetcode problem : 169
https://leetcode.com/problems/majority-element/
*/
class MajorityElementBoyerMooreVoting {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElem = nums[0];
        for (int i =0; i< nums.length; i++){
            if(majorityElem == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                majorityElem = nums[i];
                count++;
            }
        }
       return majorityElem;
    }
}
