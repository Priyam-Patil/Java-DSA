// use the logic of activity selection --Greedy Approach
import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        // sort array in asc order of 1st col
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLength=1;//for first pair
        int chainEnd=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLength++;
                chainEnd=pairs[i][1];

            }
        }
        return chainLength;
    }
}