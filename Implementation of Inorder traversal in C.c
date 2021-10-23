#include<stdio.h>    
// Creating a node structure  
      struct BinaryTreeNode    
     {    
          int info;    
          struct BinaryTreeNode *left;  
          struct BinaryTreeNode *right;    
      };  
    
  // Creating a tree..    
struct BinaryTreeNode* create()    
{    
   struct BinaryTreeNode *temp;    
   int data;    
  temp = (struct BinaryTreeNode *)malloc(sizeof(struct BinaryTreeNode));  // creating a new node  
   printf("\nEnter the data: ");    
   scanf("%d", &data);     
     
   if(data==-1)    
{    
return NULL;    
}    
  temp->info = data;    
   printf("\nEnter the left child of %d", data);    
   temp->left = create();  // creating a left child  
printf("\nEnter the right child of %d", data);    
temp->right = create();  // creating a right child  
return temp;     
 }  
   
 //inorder traversal  
void inorder(struct BinaryTreeNode *root)  
{  
    if(root==NULL)  
    return;  
    else  
      
    inorder(root->left);  
    printf("%d ", root->info);  
    inorder(root->right);  
}  
  void main()    
    {    
       struct BinaryTreeNode *root;    
       root = create();  // calling create function.  
       inorder(root);   // calling inorder function  
    }  
