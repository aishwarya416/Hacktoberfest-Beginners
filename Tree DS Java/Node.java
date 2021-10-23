package Tree;

public class Node {
	public int EmpNo; 		//Used as the key Value and is also a data Item
	public String Name;		//Name Data Item
	public Node leftChild;	//This is Node's Left CHild
	public Node rightChild;	//This is Node's Right Child
	
	public void displayNode() {		//To display Node data Values
		System.out.print("{");
		System.out.print(EmpNo);
		System.out.print(",");
		System.out.print(Name);
		System.out.print("}");
	}

}
