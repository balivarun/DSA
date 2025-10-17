import java.util.*;

class create_graph{
public static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v){
  adj.get(u).add(v);
  adj.get(v).add(u);
}

public static void displaygraph(ArrayList<ArrayList<Integer>> adj){
  for(int i=0;i<adj.size();i++){ // number of vertices
    for(int j=0;j<adj.get(i).size();j++){ // neighnors of vertex i
      System.out.print(adj.get(i).get(j)+" ");
    }
    System.out.println();
  }
}


  public static void main(String[] args) {
    int v=3; // number of vertices
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<v;i++){
      adj.add(new ArrayList<>());
    }

    addedge(adj,1,0);
    addedge(adj,1,2);
    addedge(adj,2,0);

    displaygraph(adj);
  }
}