// Chocola Probelm --Greedy Approach
// min cost to cut board(or chocalate or cake) into squares.

import java.util.*;
class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        // first we sort the both cost arrays in descending order for to get the max cost first but for sorting in descending order like Arrays.sort(horizontalCut,Collections.reverseOrder()); works only on 'Integer' but here dataType is int[] which is primitive .So we sort in ascending order and starts from last index(contains max cost).

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int h=horizontalCut.length-1;
        int v=verticalCut.length-1;

        int hp=1,vp=1;//initially horizontal piece is 1 and vertical piece is 1

        int minCost=0;

        while(h>=0 && v>=0){

            if(horizontalCut[h]>=verticalCut[v]){
                // first do the max cost cut
                // here horizonatal cut
                minCost+=(horizontalCut[h]*vp);
                hp++;
                h--;//because we start from last index
            }else{
                // here vertical cut
                minCost+=(verticalCut[v]*hp);
                vp++;
                v--;//because we start from last index
            }

        }

        // do the same process for remaining cuts
        while(h>=0){
            minCost+=(horizontalCut[h]*vp);
                hp++;
                h--;//because we start from last index
        }

        while(v>=0){
            minCost+=(verticalCut[v]*hp);
                vp++;
                v--;//because we start from last index
        }
        return minCost;


        
    }
}