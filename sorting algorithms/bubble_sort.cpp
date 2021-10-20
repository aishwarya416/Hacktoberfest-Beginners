#include<iostream>
 
using namespace std;

void bubbleSort(int a[],int n){
    int i,j,temp;
    for(i=0;i<n-1;++i){
        for(j=0;j<n-1-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}

void input(int a[],int n){
    for(int i=0;i<n;++i)
        cin>>a[i];
}

void output(int a[],int n){
    for(int i=0;i<n;++i)
        cout<<a[i]<<" ";
}

int main(){
    int a[100];
    int n;
    cin>>n;
    input(a,n);
    bubbleSort(a,n);
    output(a,n);
    return 0;
}