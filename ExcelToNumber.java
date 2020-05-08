/*
https://leetcode.com/problems/excel-sheet-column-number/
171
*/
class ExcelToNumber {
    public int titleToNumber(String s) {
        int total = 0;
        int len = s.length();

        for(int i = 0; i< len; i++){
            int c = s.charAt(i) - 64;
            total += Math.pow(26, len - i - 1) * c;
        }
        return total;

    }
}
