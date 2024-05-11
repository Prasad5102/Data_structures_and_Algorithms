

class Solution {
    // Function to detect cycle in an undirected graph.
     class pair{
        int first;
        int second;
        public pair(int fi,int se){
            this.first=fi;
            this.second=se;
        }
    }
    public boolean bfs(int x,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        Queue<pair> q =new LinkedList<>();
        q.add(new pair(x,-1));
        vis[x]=true;
        while(!q.isEmpty()){
            int child =q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(Integer it : adj.get(child)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new pair(it,child));
                }
              else if ( it != parent) {
                   return true;
}

            }
         
        }
           return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
      
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(bfs(i,adj,vis)){
                    return true;
                }
                
            }
        }
        return false;
    }
}
