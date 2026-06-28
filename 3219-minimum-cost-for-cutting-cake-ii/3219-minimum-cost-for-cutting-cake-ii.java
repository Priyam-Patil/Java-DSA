import java.util.*;
class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int h=horizontalCut.length-1;
        int v=verticalCut.length-1;

        int hp=1;
        int vp=1;

        long minCost=0;

        while(h>=0 && v>=0){
            if(horizontalCut[h]>=verticalCut[v]){
                // first do max cost cut
                minCost+=(horizontalCut[h]*vp);
                hp++;
                h--;
            }else{
                minCost+=(verticalCut[v]*hp);
                vp++;
                v--;
            }
        }
        while(h>=0){
            minCost+=(horizontalCut[h]*vp);
                hp++;
                h--;
        }
        while(v>=0){
            minCost+=(verticalCut[v]*hp);
                vp++;
                v--;
        }
        return minCost;
    }
}