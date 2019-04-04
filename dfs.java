void dfs(int s)
    {
        boolean visited[]=new boolean[V];
        dfsUntil(s, visited);
    }
    void dfsUntil(int v, boolean visited[])
    {
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> itr=adj[v].listIterator();
        while(itr.hasNext())
        {
            int n=itr.next();
            if(!visited[n])
            {
                visited[n]=true;
                dfsUntil(n, visited);
            }
        }
    }
