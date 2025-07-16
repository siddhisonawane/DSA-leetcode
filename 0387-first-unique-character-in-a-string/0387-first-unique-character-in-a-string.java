import java.util.*;
class Solution {
    public static int firstUniqChar(String s) {
        int freq[]=new int[26];
        Queue<Character>q=new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
        }
        if(q.isEmpty()){
            return -1;
        }
        else{
            char ch2=q.peek();
            return s.indexOf(ch2);
        }
    }
    public static void main(String args[]){
        String s="leetcode";
        System.out.println(firstUniqChar(s));
    }
}