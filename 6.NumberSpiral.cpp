#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
  ll n;
  cin>>n;
  for(int i =0;i<n;i++){
    ll r, c, m,s,z;
    cin>>r>>c;
    m=max(r,c);
    s= m*m;
    z= (m-1)*(m-1);
    if (m % 2 == 0){
      if(m==r) cout<<s - (c-1)<<endl;
      else cout<<z+r<<endl;
    }
    else{
    if (m == c) cout<< s - (r-1)<<endl;
    else cout<<z+c<<endl;
    }
  }
  return 0;
}

//from net
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
  ll t;
  cin>>t;
  int r, c , a , b;
  for(int i = 0;i < t;i++){
    ll res =0;
    cin>>r>>c;
    a= max(r,c);
    b=min(r,c);
    res =1ll*(a-1)*(a-1);
    if(a==b)res+=a;
    else if (a%2 == 1){
      if(c== a) res+=a*2-r;
      else res+=c;
    }
    else{
      if(r==a) res+=a*2-c;
      else res+=r;
    }
    cout<<res<<endl;
  }
  return 0;
}
