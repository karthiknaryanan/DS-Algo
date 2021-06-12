package dataStructures;

public class DoublyLinkedListDemo1 {
	Node head;
	Node last;

	public void addFirst(int val) {

		Node newNode = new Node();
		newNode.prev = null;
		newNode.data = val;
		newNode.next = head;

		head = newNode;

		return;
	}

	public void addLast(int val) {
		// System.out.println("Adding the Node at Last using frwd traversal");
		Node newNode = new Node();
		newNode.prev = last;
		newNode.data = val;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {

			last = head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}

		return;
	}

	public void deleteNode(int key) {

		if (head.data == key) {

			head = head.next;
		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
				} else
					temp = temp.next;
			}

		}

	}

	public void searchNode(int key) {
		Node temp = head;

		while (temp != null) {
			if (temp.data == key)
				System.out.println("Node found");
			temp = temp.next;
		}

		return;
	}

	public void print() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListDemo1 lst = new DoublyLinkedListDemo1();
		lst.addFirst(20);
		lst.addFirst(10);
		lst.addLast(30);
		lst.addLast(40);
		lst.deleteNode(10);
		lst.print();
		lst.searchNode(40);

	}

}
