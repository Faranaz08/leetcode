class Solution {
    public int[][] transpose(int[][] mat) {
      int m=mat.length;
        int n=mat[0].length;
        int[][] res=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][i]=mat[i][j];
            }
        }
        return res;
    }
}