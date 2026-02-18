class Solution {
    public static boolean isPerfectSquare(int num) {
        int odd=1;

        while(num>0){
            num-=odd;
            odd+=2;
        }

        return num==0;
    }
    public static void main(String args[]){
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
}
