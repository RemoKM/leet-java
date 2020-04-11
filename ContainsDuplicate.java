/*
Leetcode problem number : 217
https://leetcode.com/problems/contains-duplicate/
*/
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for(int x : nums){
            num_set.add(x);
        }

        if(num_set.size() != nums.length){
            return true;
        }
        return false;

    }
}
