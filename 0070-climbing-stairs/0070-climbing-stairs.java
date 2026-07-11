class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int a=3;//current way
        int b=2;//previous way
        for(int i=0;i<n-3;i++){
            a=a+b;//next way
            b=a-b;//previous a value
        }
        return a;
    }
}