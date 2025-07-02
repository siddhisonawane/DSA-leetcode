class Solution {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
       
        while(i<s.length()){
            if(j<spaces.length && spaces[j]==i){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
            i++;
        }    
        
        
        return sb.toString();
    }
    public static void main(String args[]){
        String s="EnjoyYourCoffee";
        int spaces[]={5,9};

        System.out.println(addSpaces(s,spaces));
    }
}