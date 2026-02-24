class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;

        boolean[] visited = new boolean[n];
        for (int i=0; i<n; i++){
            if (!visited[i]){
                dfs(isConnected, visited , i);
                count++;
            }
        }
        return count;
        
    }
    private void dfs (int[][] isConnected, boolean[] visited , int i){
         int n = isConnected.length;
        for (int j =0; j<n; j++){
            if ( isConnected[i][j]==1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected, visited , j);

            }

        }

    }
}