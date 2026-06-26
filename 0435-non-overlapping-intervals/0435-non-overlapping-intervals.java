import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));//sort array in ascending order based on 1st col
        int ans=0;
        int lastEnd=intervals[0][1];//last index of first pair
        for(int i=1;i<intervals.length;i++){
if(intervals[i][0]<lastEnd){
    ans++;
}else{
    lastEnd=intervals[i][1];
}
        }
        return ans;
    }
}