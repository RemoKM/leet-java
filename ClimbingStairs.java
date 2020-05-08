/**
https://leetcode.com/problems/climbing-stairs/
70
**/

class ClimbingStairs {
    public int climbStairs(int n) {
        int num = 2;
        if(n == 1){
            return 1;
        }else if(n == 2){
            return num;
        }else{
            int prev = 1;
            for(int i = 0; i< n-2; i++){
                int temp = num;
                num += prev;
                prev = temp;
            }
        }
        return num;

    }
}
