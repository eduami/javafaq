package org.eduami.javafaq.datastructures.tree.binary;

//Custom binary tree implementation
public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;

	public BinaryTree() {
		super();
	}

	public void add(T data) {
		if (root == null) {
			root = new Node<T>(null, data, null);
		} else {
			insert(root, data);
		}
	}

	/**
	 * Recursively add an element in the tree
	 * 
	 * @param node
	 * @param data
	 */
	private void insert(Node<T> node, T data) {
		if (node.getData().compareTo(data) < 0) { // add to left subtree
			if (node.getLeft() != null) {
				insert(node.getLeft(), data);
			} else {
				node.setLeft(new Node<T>(null, data, null));
			}
		} else if (node.getData().compareTo(data) > 0) { // add to right subtree

			if (node.getRight() != null) {
				insert(node.getRight(), data);
			} else {
				node.setRight(new Node<T>(null, data, null));
			}
		} else {
			System.out.println("Duplicate element");
		}
	}

	public void printElements() {
		inOrder(root);
	}

	public void printElements(BinaryTree.TraverseOrder order) {
		switch (order) {
		case INORDER:
			inOrder(root);
			break;
		case POSTORDER:
			postOrder(root);
			break;
		case PREORDER:
			preOrder(root);
			break;
		default:
			inOrder(root);

		}

	}

	private void inOrder(Node<T> node) {

		if (node == null)
			return;

		inOrder(node.getLeft());

		System.out.println(node.getData());

		inOrder(node.getRight());

	}

	private void preOrder(Node<T> node) {

		if (node == null)
			return;

		System.out.println(node.getData());

		inOrder(node.getLeft());

		inOrder(node.getRight());

	}

	private void postOrder(Node<T> node) {

		if (node == null)
			return;

		inOrder(node.getLeft());

		inOrder(node.getRight());

		System.out.println(node.getData());

	}

	public enum TraverseOrder {
		INORDER, PREORDER, POSTORDER
	}

}
