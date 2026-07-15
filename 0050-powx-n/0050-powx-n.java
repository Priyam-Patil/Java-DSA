class Solution {
    public double myPow(double x, int n) {
        long N=n;//Now N is a long which has much larger range than of int.

        if(N<0){
            x=1/x;
            N=-N;
        }
        double answer=1;
        while(N>0){
            if(N%2==1){//odd exponent
                answer*=x;
            }
            x*=x;
            N/=2;//
        }
        return answer;
    }
}