
/*
Leetcode problem number : 242
https://leetcode.com/problems/valid-anagram/
*/

import java.lang.*;
import java.util.*;
import java.io.*;

public class ValidAnagramMap {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> s_char = new HashMap<>();
        for(char c : s.toCharArray()){
            if(s_char.containsKey(c)){
                int count = s_char.get(c);
                s_char.put(c, count + 1);
            }else{
                s_char.put(c, 1);
            }
        }
        Map<Character, Integer> t_char = new HashMap<>();
        for(char c : t.toCharArray()){
            if(t_char.containsKey(c)){
                int count = t_char.get(c);
                t_char.put(c, count + 1);
            }else{
                t_char.put(c, 1);
            }
        }

        for(Character c : s_char.keySet()){
            if(t_char.get(c) == null){
              return false;
            }
            if(s_char.get(c).intValue() != t_char.get(c).intValue()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
      String[] data = new String[2];
      try{
        File fi = new File("anagram.txt");
        Scanner reader = new Scanner(fi);
        int idx = 0;
        while(reader.hasNextLine()){
            data[idx] = reader.nextLine();
            idx++;
        }
        reader.close();
      }catch(FileNotFoundException e){
        e.printStackTrace();
      }

      String s = data[0];
      String t = data[1];
      ValidAnagram va = new ValidAnagram();
      va.isAnagram(s,t);
    }
}
