import java.util.*;


public class create_graph2 {



  public static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v){
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  public static void display(ArrayList<ArrayList<Integer>> adj){
    for(int i=0;i<adj.size();i++){
      for(int j=0;j<adj.get(i).size();j++){
        System.out.print(adj.get(i).get(j)+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args){

    int v=4;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<v;i++){
      adj.add(new ArrayList<>());
    }

 addedge(adj,0,1);
    addedge(adj,1,3);
    addedge(adj,3,2);
    addedge(adj,2,0);
    addedge(adj,0,3);




    display(adj);
  }

}
