import java.util.*;

public class dfs3 {

  public static void addedge(ArrayList<ArrayList<Integer>> adj,int i,int j){
    adj.get(i).add(j);
    adj.get(j).add(i);
  }

  public static void dfsrec(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int s,ArrayList<Integer> ans){
    vis[s]=true;
    ans.add(s);

    for(int i:adj.get(s)){
      if(!vis[i]){
        dfsrec(adj,vis,i,ans);
      }
    }

  }

  public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj){
    boolean[] vis=new boolean[adj.size()];
    ArrayList<Integer> ans=new ArrayList<>();

    for(int i=0;i<adj.size();i++){
      if(!vis[i]){
        dfsrec(adj,vis,i,ans);
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int v=9;

    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

    for(int i=0;i<v;i++){
      adj.add(new ArrayList<>());
    }

    int edges[][]={{1,2},{2,5},{2,6},{1,3},{3,4},{4,8},{8,7},{3,7}};

    for(int[] i:edges){
      addedge(adj,i[0],i[1]);
    }

    ArrayList<Integer> res=DFS(adj);

    for(int n:res){
      System.out.print(n+" ");
    }
    System.out.println();
  }
}
