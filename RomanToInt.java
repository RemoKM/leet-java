
/*
Leetcode problem number : 13
https://leetcode.com/problems/roman-to-integer/
*/
class RomanToInt {
    public int romanToInt(String s) {
        int total = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    if(i < s.length() -1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                        total -= 1;
                    }else{
                        total += 1;
                    }
                    break;

                 case 'V':
                    total += 5;
                    break;

                case 'X':
                    if(i < s.length() -1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                        total -= 10;
                    }else{
                        total += 10;
                    }
                    break;

                case 'L':
                    total += 50;
                    break;

                case 'C':
                    if(i < s.length() -1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                        total -= 100;
                    }else{
                        total += 100;
                    }
                    break;


                case 'D':
                    total += 500;
                    break;

                case 'M':
                    total += 1000;
                    break;
            }

        }
        return total;
    }
}
