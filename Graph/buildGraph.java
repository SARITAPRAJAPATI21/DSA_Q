import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class buildGraph{
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
     public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();// create Empty ArrayList
        }
       
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

 
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2, 4));
       

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

     }
     public static void BFS(ArrayList<Edge> graph[],int vertex){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[vertex];
        // add starting vertex 
         q.add(0);

         while(!q.isEmpty()){
          int curr=  q.remove();
          if(visited[curr]==false){
            System.out.print(curr+" ");
            visited[curr]=true;

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
         }
            
         }
         }
         public static void DFS(ArrayList<Edge> graph[],int curr,boolean[] vis){
            //Recursive Approach
           System.out.print(curr+" ");
           vis[curr]=true;
           for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false)
            DFS(graph, e.dest, vis);

           }

         }
         public static void PrintAllPath(ArrayList<Edge> graph[],boolean[] vis,int curr,String path,int targ){
            if(curr==targ){
             System.out.println(path);
              return;
            }
            for(int i=0;i<graph[curr].size();i++){
             Edge e=graph[curr].get(i);
             if(!vis[e.dest]){
                 vis[curr]=true;
                 PrintAllPath(graph, vis, e.dest, path+e.dest, targ);
                 vis[curr]=false;
             }
            }
              }

    public static void main(String[] args) {
        int vertex=7;
       
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        /*         1 ------   3 \
         *       /            |   \
         *      0             |     5---6
         *      \             |   /  
         *        2 --------- 4 /      
         */
     createGraph(graph);
      //neighbours 
     /* for(int i=0;i<graph[5].size();i++){
           Edge e=graph[5].get(i);
           System.out.print(e.dest);
        
      } */
      //BFS(graph, vertex);
      boolean vis[]=new boolean[vertex];
 
   // DFS(graph, 0, vis);
    //  System.out.println();

    int src=0,targ=5;
  PrintAllPath(graph, new boolean[vertex], src, "0", targ);
        
    }

}
