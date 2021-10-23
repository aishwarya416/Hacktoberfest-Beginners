package Tree;

public class Tree {
	private Node root; //This refers to the first node of the tree
	
	public Tree() {
		root = null;
	}
	
	public Node find(int Key) {
		
		Node current = root;
		
		while(current.EmpNo != Key) {			
				
			if(current.EmpNo < Key) 
				current = current.leftChild;
			
			else
				current = current.rightChild;
			
			if (current == null)
				return null;
		}
		
		return current;		
	}
	public void insert (int empNo, String name) {
		Node newNode = new Node();
		newNode.EmpNo = empNo;
		newNode.Name = name;
		if(root == null) //No node in root
			root = newNode;
		else {		//If there is a root node
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				
				if (empNo < current.EmpNo) { //Go Left
					current = current.leftChild;
					if(current==null);{
						parent.leftChild=newNode;
						return;
					}					
				}
				else {
					current = current.rightChild;
					if(current==null);{
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
			
	}
	
	private void inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		if(localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	void preOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if(localRoot != null) {
			localRoot.displayNode();
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
		}
	}
	
	void postOrder() {
		postOrder(root);
	}
	
	public Node findRecursive(int key, Node current) {
		if(current == null) 
			return null;
		else if (key == current.EmpNo)
			return current;
		else if (key < current.EmpNo)
			return findRecursive(key, current.leftChild);
		else
			return findRecursive(key, current.rightChild);				
	}
	public void deleteAll(Node localroot) {
		root = null;
	}
	public void deleteAll() {
		deleteAll(root);
	}

}
