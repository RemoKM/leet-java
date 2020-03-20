/*
Leetcode problem : 169
https://leetcode.com/problems/majority-element/
*/
class MajorityElementMap {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if(countMap.containsKey(nums[i])){
                int count = countMap.get(nums[i]);
                countMap.put(nums[i], count + 1);
            }
            else{
                countMap.put(nums[i], 1);
            }
        }
        for(Integer key : countMap.keySet()){
            if(countMap.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}
