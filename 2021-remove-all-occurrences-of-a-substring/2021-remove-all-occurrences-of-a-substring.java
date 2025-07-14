class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
    public static void main(String[] args){
        Solution s1=new Solution();
        String s="daabcbaabcbc";
        String part="abc";
        System.out.println(s1.removeOccurrences(s,part));
    }
}

