package dataStructures;

public class CircularLinkedListDemo {

	public static void main(String[] args) {
		Node head, middle, last;
		head = new Node();
		middle = new Node();
		last = new Node();

		head.data = 10;
		head.next= middle;
		middle.data = 20;
		middle.next = last;
		last.data = 30;
		last.next = head;
		
		Node temp = head;
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}while(temp != head);
	}

}
