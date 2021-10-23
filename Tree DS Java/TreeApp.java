package Tree;

import java.util.Scanner;

public class TreeApp {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insert(149, "Anusha");
		tree.insert(167, "Kosala");
		tree.insert(47, "Dinusha");
		tree.insert(66, "Mihiri");
		tree.insert(159, "Jayani");
		tree.insert(118, "Nimal");
		tree.insert(195, "Nishantha");
		tree.insert(34, "Ayodya");
		tree.insert(105, "Bimali");
		tree.insert(133, "Sampath");
		
		tree.inOrder();
		System.out.println("++++++++++++++++++");
		
		tree.preOrder();
		System.out.println("++++++++++++++++++");
		
		tree.postOrder();
		System.out.println("++++++++++++++++++");
		
		System.out.println("Enter the Employee number to find employee details");
		Scanner myscanner = new Scanner(System.in);
		
		int empID = myscanner.nextInt();
		
		String nameOfEmployee = tree.find(empID).Name;
		System.out.print("Name of the Employee is : ");
		System.out.println(nameOfEmployee);
		
		tree.deleteAll();
		System.out.println("Tree is Deleted");
		tree.inOrder();
	}

}
