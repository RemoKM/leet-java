/*
https://leetcode.com/problems/pascals-triangle/submissions/
118
*/

class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> final_list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            inner.add(0,1);
            for(int j = 1; j< inner.size()-1; j++){
                inner.set(j, inner.get(j) + inner.get(j+1));
            }
            final_list.add(new ArrayList<Integer>(inner));
        }
        return final_list;

    }
}
