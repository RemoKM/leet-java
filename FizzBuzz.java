/*
Leetcode problem : 412
https://leetcode.com/problems/fizz-buzz/
*/

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzbuzz = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            if(i % 15 == 0){
                fizzbuzz.add("FizzBuzz");
            }else if(i % 5 == 0){
                fizzbuzz.add("Buzz");
            }else if(i % 3 == 0){
                fizzbuzz.add("Fizz");
            }else{
                fizzbuzz.add(Integer.toString(i));
            }
        }
        return fizzbuzz;

    }
}
