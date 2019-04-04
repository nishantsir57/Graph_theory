void bfs(int s)
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size() != 0)
        {
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr=adj[s].listIterator();
            while(itr.hasNext())
            {
                int n=itr.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
