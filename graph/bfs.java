import java.util.*;

public class bfs {

  public static ArrayList<Integer> bfss(ArrayList<ArrayList<Integer>> adj){
    int v=adj.size();
    int s=2; // starting node

    ArrayList<Integer> res=new ArrayList<>(); // to store the path

    Queue<Integer> q=new LinkedList<>();

    boolean[] vis=new boolean[v]; // for check that the node is visited or not

    vis[s]=true;

    q.add(s);

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
    adj.add(new ArrayList<>(Arrays.asList(0, 1,4)));
    adj.add(new ArrayList<>(Arrays.asList(1, 4)));
    adj.add(new ArrayList<>(Arrays.asList(2, 3)));

    ArrayList<Integer> ans=bfss(adj);
    for(int i:ans){
      System.out.print(i+" ");
    }

  }
}
