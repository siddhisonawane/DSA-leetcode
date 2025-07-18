import java.util.*;
class Solution {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int chainLL=1;
        int pairEnd=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                chainLL++;
                pairEnd=pairs[i][1];
            }
        }
        return chainLL;
    }
    public static void main(String args[]){
        int pairs[][]={{1,2},{2,3},{3,4}};
        System.out.println(findLongestChain(pairs));
    }
}
