package dataStructures;

class Node {
	int data;
	Node next;
}

public class LinkedListDemo {

	Node head;

	public static void main(String[] args) {
		LinkedListDemo lst = new LinkedListDemo();
		lst.addNodeAtFirst(40);
		lst.addNodeAtFirst(30);
		lst.addNodeAtFirst(20);
		lst.addNodeAtFirst(10);
		System.out.println(lst.head);
		lst.addNodeAtLast(50);
		lst.deleteNode(30);
		lst.searchNode(30);
		lst.print();
	}

	public void addNodeAtFirst(int val) {

		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;

		head = newNode;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void addNodeAtLast(int val) {

		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}

	}

	public void deleteNode(int key) {

		if (head.data == key) {
			head = head.next;
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					break;
				} else
					temp = temp.next;
			}
		}

	}

	public void searchNode(int key) {
		boolean flag = false;
		if (head.data == key) {
			flag = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == key) {
					flag = true;
				}
				temp = temp.next;

			}
		}
		if (flag)
			System.out.println("Key Found");
		else
			System.out.println("Key Not Found");
	}

}
