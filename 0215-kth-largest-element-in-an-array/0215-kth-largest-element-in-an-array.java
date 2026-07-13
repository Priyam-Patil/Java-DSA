
import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);
        for(int i:nums){
            pq.add(i);

            if(pq.size()>k){
                pq.poll();//removes the smallest element (highest priority element)

            }
        }
        return pq.poll();//at last correct only k size(contains all largest elements) of PriorityQueue is left and it will removes smallest along them . 
    }
}