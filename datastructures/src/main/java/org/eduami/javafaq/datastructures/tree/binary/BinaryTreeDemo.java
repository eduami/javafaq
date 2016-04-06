package org.eduami.javafaq.datastructures.tree.binary;

public class BinaryTreeDemo {
	public static void main(String[] args) {

	BinaryTree<String> tree= new BinaryTree<String>();
	tree.add("1");
	tree.add("2");
	tree.printElements();
	
	BinaryTree<Car> carsTree= new BinaryTree<Car>();
	carsTree.add(new Car("Ferrari"));
	carsTree.add(new Car("Tata"));
	carsTree.printElements();
	
	System.out.println(BinaryTree.TraverseOrder.PREORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.PREORDER);
	
	System.out.println(BinaryTree.TraverseOrder.POSTORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.POSTORDER);
	
	System.out.println(BinaryTree.TraverseOrder.INORDER);
	carsTree.printElements(BinaryTree.TraverseOrder.INORDER);
	
	}
}
