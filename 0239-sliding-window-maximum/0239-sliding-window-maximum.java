
import java.util.*;
class Solution {
    public class window implements Comparable<window>{
        int val;
        int idx;
        window(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(window w2){
            return w2.val-this.val;//dec order
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];

        PriorityQueue<window> p=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            p.add(new window(nums[i],i));
        }

        res[0]=p.peek().val;

        for(int i=k;i<nums.length;i++){
            while(p.size()>0 && p.peek().idx<=(i-k)){
                p.remove();

            }
            p.add(new window(nums[i],i));
            res[i-k+1]=p.peek().val;
        }
        return res;

    }
}