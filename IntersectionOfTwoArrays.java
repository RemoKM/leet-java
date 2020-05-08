
/*
https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
350
*/
class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> num_freq = new HashMap<>();
        for(int i = 0; i< nums1.length; i++){
            int c = num_freq.getOrDefault(nums1[i],0);
            num_freq.put(nums1[i], c+1);
        }
        for(int i = 0; i< nums2.length; i++){
            int c = num_freq.getOrDefault(nums2[i],0);
            if(c > 0){
                arr.add(nums2[i]);
                num_freq.put(nums2[i], c-1);
            }

        }
        int[] f_arr = new int[arr.size()];
        for(int i = 0; i< f_arr.length; i++){
            f_arr[i] = arr.get(i);
        }
        return f_arr;
    }
}
/**



class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> arr = new ArrayList<>();
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]){
                p1++;
            }else if(nums1[p1] > nums2[p2]){
                p2++;
            }else{
                arr.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int[] f_arr = new int[arr.size()];
        for(int i = 0; i< f_arr.length; i++){
            f_arr[i] = arr.get(i);
        }
        return f_arr;
    }


}
**/
