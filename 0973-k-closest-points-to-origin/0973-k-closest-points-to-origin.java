// nearest cars(point)  PriorityQueue

import java.util.*;
class Solution {
    static class point implements Comparable<point>{
        int x;
        int y;
        int dis;
        point(int x,int y,int dis){
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
public int compareTo(point p2){
    return this.dis-p2.dis;//asc order sorting
}
    }
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<point> p=new PriorityQueue<>();

        for(int i=0;i<points.length;i++){
            int dissq=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            p.add(new point(points[i][0],points[i][1],dissq));
        }

        for(int j=0;j<k;j++){
            point curr=p.remove();
            ans[j][0]=curr.x;
            ans[j][1]=curr.y;
        }
        return ans;


    }
}