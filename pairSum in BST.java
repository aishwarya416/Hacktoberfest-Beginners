import java.util.*;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        if(root==null)
            return;
        
        ArrayList<Integer> arr=convertBSTToArrayList(root);
        Collections.sort(arr);

        int i=0;
        int j=arr.size()-1;
        while(i<j)
        {
            if(arr.get(i)+arr.get(j)==s)
            {
                System.out.println(arr.get(i)+" "+arr.get(j));
        		i++;
            	j--;
            }
            else if(arr.get(i)+arr.get(j)<s)
                i++;
            else
                j--;
        }
	}
    public static ArrayList<Integer> convertBSTToArrayList(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return new ArrayList<>();
        
        ArrayList<Integer> leftArray=convertBSTToArrayList(root.left);
        ArrayList<Integer> rightArray=convertBSTToArrayList(root.right);
        ArrayList<Integer> ansArray=new ArrayList<>();
        for(int i=0;i<leftArray.size();i++)
            ansArray.add(leftArray.get(i));
        
        for(int i=0;i<rightArray.size();i++)
            ansArray.add(rightArray.get(i));
        
        ansArray.add(root.data);
        return ansArray;
                                                       
        
    }

}
