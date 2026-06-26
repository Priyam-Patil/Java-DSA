
import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result=new ArrayList<>();

        // finds the min-diff among all the pairs
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));

        }
        // min contain the min-diff 
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }
        return result;

    }
}