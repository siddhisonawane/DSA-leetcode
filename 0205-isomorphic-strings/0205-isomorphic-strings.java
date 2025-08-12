import java.util.*;
class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map.containsKey(cs)) {
                if (map.get(cs) != ct) {
                    return false; 
                }
            } else {
                if (mapped.contains(ct)) {
                    return false; 
                }

                map.put(cs, ct);     
                mapped.add(ct);     
            }
        }

        return true;
    }
    public static void main(String args[]){
        String s="add";
        String t="egg";

        System.out.println(isIsomorphic(s,t));
    }
}