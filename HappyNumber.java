/*
https://leetcode.com/problems/happy-number/
202
*/
class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> count = new HashSet<>();
        int num = n;
        while(true){
            int sum = 0;
            while (num > 0){
                int x = num % 10;
                sum += x*x;
                num = num/10;
            }

            if(count.contains(sum)){
                return false;
            }else if(sum == 1){
                return true;
            }else{
                count.add(sum);
                num = sum;
            }
        }


    }
}
