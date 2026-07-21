
import java.util.*;
class Solution {

     public void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        public void reverse(int nums[],int start){
            int end=nums.length-1;
            while(start<end){
                swap(nums,start,end);
                start++;
                end--;
            }
        }

    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        // finding the decresing element
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=nums.length-1;
            // finding the next greater element than that decreasing element
            while(j>=0 && nums[j]<=nums[i])  j--;
            swap(nums,i,j);
        }

        // reversing the array after index i+1 
        reverse(nums,i+1);
        
        
        }
    }
