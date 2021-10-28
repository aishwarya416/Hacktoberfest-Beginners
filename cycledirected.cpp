#include <bits/stdc++.h>
using namespace std;
void addedge(std::vector<int> adj[],int u,int v){
  adj[u].push_back(v);
}

void checkdfs(std::vector<int> adj[],int V,int s){
  stack<int> stack;
  std::vector<int> parent[V];
  std::vector<int> vector[V];
  for(int i=1;i<=V;i++){
    adj[V]=-1;
  }
  int s=1;
  visited[s]=0;
  q.push(s);
  while(!stack.empty()){

  }

}
int main(){
  int V=6;
  std::vector<int> adj[V];
  addedge(adj,0,1);
  addedge(adj,0,2);
  addedge(adj,1,2);
  addedge(adj,1,3);
  addedge(adj,3,4);
  addedge(adj,4,1);
  checkdfs(adj,V,0);
}
