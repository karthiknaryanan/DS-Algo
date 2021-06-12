package dataStructures;

class Node {
	int data;
	Node next;
	Node prev;
}

public class DoublyLinkedListDemo {

	public static void main(String[] args) {

		Node head, middle, last;
		head = new Node();
		middle = new Node();
		last = new Node();

		head.prev = null;
		head.data = 30;
		head.next = middle;
		middle.prev = head;
		middle.data = 20;
		middle.next = last;
		last.prev = middle;
		last.data = 10;
		last.next = null;

		System.out.println("Forward Traversal");
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("Backward Traversal");
		temp = last;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}

	}
}