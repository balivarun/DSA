import java.util.*;

public class bfs4 {

  public static ArrayList<Integer> bf(ArrayList<ArrayList<Integer>> adj){

    int v=adj.size();
    int s=2;
    ArrayList<Integer> res=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    boolean[] vis=new boolean[v];

    q.add(s);
    vis[s]=true;
    while(!q.isEmpty()){
      int curr=q.poll();
      res.add(curr);
      for(int x:adj.get(curr)){
        if(!vis[x]){
          vis[x]=true;
          q.add(x);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    adj.add(new ArrayList<>(Arrays.asList(1, 2)));
    adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
    adj.add(new ArrayList<>(Arrays.asList(0, 1, 4)));
    adj.add(new ArrayList<>(Arrays.asList(1, 4)));
    adj.add(new ArrayList<>(Arrays.asList(2, 3)));

    ArrayList<Integer> ans = bf(adj);
    for (int i : ans) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
