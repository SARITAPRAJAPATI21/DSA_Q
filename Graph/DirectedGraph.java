import java.util.ArrayList;

public class DirectedGraph {
    static class Edge{
         int src;
         int  dest;
        Edge(int s,int d){
          this.src=s;
          this.dest=d;
            }
       }
/*-------------creation Graph------------------ */
 static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();// create Empty ArrayList
    }
    graph[0].add(new Edge(0, 2));

    graph[1].add(new Edge(1, 0));

    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 0));
}
  static boolean isDirectedCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean recr[]){
    vis[curr]=true;
    recr[curr]=true;

    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);

        if(recr[e.dest]){//cycle
            return true;
        }
        else if(!vis[e.dest]){ 
          if(isDirectedCycle(graph, vis, e.dest, recr)){
            return true;
          }
        }
    }
    recr[curr]=false;
    return false;

 }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[4];
    
       createGraph(graph);
 
        System.out.println(isDirectedCycle(graph,new boolean[4], 0, new boolean[4]));
        
    }

   
    
}
