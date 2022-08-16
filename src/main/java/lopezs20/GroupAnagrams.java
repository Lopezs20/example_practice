package lopezs20;

import java.util.ArrayList;
import java.util.HashMap;
public class GroupAnagrams {
    public static ArrayList<String[]> group(String[] arrlst ){
        ArrayList<String[]> resolve = new ArrayList<>();

        if(arrlst.length == 0) return resolve;

        HashMap<String, ArrayList<String>> hashmap = new HashMap<>();
        for(String string : arrlst){
            char[] hash = new char[26]; // alphabet allocation
            for(char c : string.toCharArray()){
                hash[c - 'a'] += 1;
            }
            String key = new String(hash);
            //hashmap.computeIfAbsent(key, k -> new ArrayList<>());
        }
        return resolve;
    }
}
