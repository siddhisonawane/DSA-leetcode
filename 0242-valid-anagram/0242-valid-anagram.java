class Solution {
    public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }

            int count[]=new int[26];

            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }

            for(int c=0;c<count.length;c++){
                if(count[c]!=0){
                    return false;
                }
            }

            return true;

    }
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";


        System.out.println( isAnagram(s,t));
    }
}