import java.util.*;

public class dfs2 {

  public static void addedge(ArrayList<ArrayList<Integer>> adj,int i,int j){
    adj.get(i).add(j);
    adj.get(j).add(i);
  }

  public static void dfsrec(ArrayList<ArrayList<Integer>> adj,boolean vis[],int s,ArrayList<Integer> res ){

    vis[s]=true;
    res.add(s);

    for(int i:adj.get(s)){
      if(!vis[i]){
        dfsrec(adj,vis,i,res);
      }
    }

  }

  public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj){
    boolean[] vis=new boolean[adj.size()];
    ArrayList<Integer> res=new ArrayList<>();

    for(int i=0;i<adj.size();i++){
      if(!vis[i]){
      dfsrec(adj,vis,i,res);
      }
    }
    return res;
  }




  public static void main(String[] args) {
    int v = 6;

    // created adjacenecy list
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    // initializing the empty arrayList in arraylist
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }

    int[][] edges = { { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 } };

    for(int[] e:edges){
      addedge(adj,e[0],e[1]);
    }

    // perform dfs
    ArrayList<Integer> res=DFS(adj);

    //print the dfs traversel
    for(int i:res){
      System.out.print(i+" ");
    }
    System.out.println();
   }
}
