package dataStructures;

public class CircularLinkedListDemo1 {
	Node head;

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;

		if (head == null) {
			newNode.next = newNode;
			head = newNode;
		} else {
			Node last = head;

			while (last.next != head) {
				last = last.next;
			}

			last.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	public void print() {
		if (head == null)
			return;

		Node temp = head;

		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != head);
	}

	public static void main(String args[]) {

		CircularLinkedListDemo1 list = new CircularLinkedListDemo1();

		System.out.println("Inserting Element: " + 10);
		list.addFirst(10);
		System.out.println("Inserting Element: " + 20);
		list.addFirst(20);
		System.out.println("Inserting Element: " + 30);
		list.addFirst(30);

		System.out.println("Circular Linked List Elements Are:");
		list.print();
	}
}