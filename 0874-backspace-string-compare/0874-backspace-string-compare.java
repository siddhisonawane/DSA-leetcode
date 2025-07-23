class Solution {
    public static boolean backspaceCompare(String s, String t) {
        return checkString(s).equals(checkString(t));
    }
    public static String checkString(String str){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='#'){
                if(s.length()>0){
                    s.deleteCharAt(s.length()-1);
                }
            }
            else{
                s.append(ch);
            }
        }
        return s.toString();
    }
    public static void main(String args[]){
        String s="ab#c";
        String t="ab#c";

        System.out.println(backspaceCompare(s,t));
    }
}