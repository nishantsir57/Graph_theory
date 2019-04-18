boolean isCycle()
    {
        boolean visited[]=new boolean[v];
        boolean restack[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(isCycleUtil(i, visited, restack))
            return true;
        }
        return false;
    }
    boolean isCycleUtil(int i, boolean visited[], boolean restack[])
    {
        if(restack[i])
            return true;
        if(visited[i])
            return false;
        restack[i]=true;
        visited[i]=true;
        List<Integer> children = adj.get(i); 
        for(Integer c: children)
            if(isCycleUtil(c, visited, restack))
                return true;
            restack[i]=false;
        return false;
    }
