
class Solution {
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int oriCol) {
        if (sc < 0 || sr < 0 || sc >= image[0].length || sr >= image.length || vis[sr][sc] || image[sr][sc] != oriCol) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        helper(image, sr, sc + 1, color, vis, oriCol);
        helper(image, sr, sc - 1, color, vis, oriCol);
        helper(image, sr - 1, sc, color, vis, oriCol);
        helper(image, sr + 1, sc, color, vis, oriCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
}