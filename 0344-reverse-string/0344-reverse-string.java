class Solution {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    public static void printReverse(char s[]){
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char s[]={'h','e','l','l','o'};
        reverseString(s);
        printReverse(s);
       
    }
}