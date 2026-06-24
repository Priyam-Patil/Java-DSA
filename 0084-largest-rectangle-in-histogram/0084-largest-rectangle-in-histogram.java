import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea=0;

        int nextSmallR[]=new int[heights.length];
        int prevSmallL[]=new int[heights.length];

        Stack<Integer> R=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!R.isEmpty() && heights[R.peek()]>=heights[i]){
                // Using >= correctly removes equal heights and expands the rectangle.
                R.pop();
            }
            if(R.isEmpty()){
                nextSmallR[i]=heights.length;//6 if their is no smaller height is found on right side then take heights.length
            }else{
                nextSmallR[i]=R.peek();//index
            }
            R.push(i);//push index
        }

        Stack<Integer> L=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!L.isEmpty() && heights[L.peek()]>=heights[i]){
                // Using >= correctly removes equal heights and expands the rectangle.
                L.pop();
            }
            if(L.isEmpty()){
                prevSmallL[i]=-1;//if their is no smaller height is found on left side take -1
            }else{
            prevSmallL[i]=L.peek();//index
            }
            L.push(i);//push index
        }

        for(int i=0;i<heights.length;i++){
            int H=heights[i];//height
            int W=nextSmallR[i]-prevSmallL[i]-1;//width
            int Area=H*W;
            maxArea=Math.max(maxArea,Area);
        }
        return maxArea;//return maximum area 
    }
}