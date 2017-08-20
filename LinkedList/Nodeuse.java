package nucleus;

import java.util.Scanner;

import l15.Node;

public class Nodeuse {

	public static Node takeInput(){
		Node head = null;
		Scanner s=new Scanner(System.in);
		int nextData=s.nextInt();
		while(nextData != -1){
			Node nextNode = new Node(nextData);
			if(head == null){
				head = nextNode;
			}
			else{
				Node tail = head;
				while (tail.next != null){
					tail = tail.next;
				}
				tail.next = nextNode;
			}
			nextData=s.nextInt();		
		}
		return head;
	}
	
/*	public static Node bubbleSort(Node head) {
		if (head == null) {
			return head;
		}
		int n = length(head);
		int i = 0;
		while (i < n) {
			Node prev = null;
			Node current = head;
			int j = 0;
			while (j < n - i - 1) {
				//if (current.data <= current.next.data) {
					prev = current;
					current = current.next;
				}// else {
					//				Node<Integer> currentNext = current.next;
					//				Node<Integer> currentNextNext = current.next.next;
					//				prev.next = currentNext;
					//				currentNext.next = current;
					//				current.next = currentNextNext;
					if (prev != null) {
						prev.next = current.next;
						current.next = current.next.next;
						prev.next.next = current;
						prev = prev.next;
					} else {
						Node currentNext = current.next;
						current.next = currentNext.next;
						currentNext.next = current;
						head = currentNext;
						prev = currentNext;
					}
				}
				j++;
			}
			i++;
		}
		return head;
	}*/


	public static void print(Node head){
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		//print(head);
		//System.out.println(length(head));
		//System.out.println(element(head));
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		Node<Integer> ans=append(head, n);
		print(ans);
		//int position=s1.nextInt();
		//int element=s1.nextInt();
	//insertAtI(head, position, element);
		//int i=s1.nextInt();
		//deleteAtI(head, i);
		//Node newHead=deleteAtIR(head, i);
	  // print(newHead);
		//print(head);
		//insertAtI(head, 2, 10);
		//print(head);

		//head = bubbleSort(head);
		//print(head);
		//System.out.println(midPoint(head));
		//reversePrint(head);
	}
	
	public static int length(Node head){
		int l=0;
		while(head != null){
			head = head.next;
			l=l+1;
		}
		return l;
	}
	
	public static int element(Node head){
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int c=1;
		while(head != null){
			head=head.next;
			c++;
			if(c==i){
				return (int) head.data;
			}
		}
		return -1;
	}
	
	public static Node<Integer> insertAtI(Node<Integer> head, int position, int element){
		if(position==0){
			Node<Integer> newNode = new Node<Integer> (element);
			newNode.next=head;
			return newNode;
		}
		int l=length(head);
		if(position>l){
			return head;
		}
		Node<Integer> prev=head;
		int i=1;
		while(i<position){
			prev=prev.next;
			i++;
		}
		Node nextNode = new Node(element);
		Node next=prev.next;
		prev.next=nextNode;
		nextNode.next=next;
		return head;
		/*int c=0;
		while(head != null){
			head=head.next;
			c++;
			if(c==position){
				Node nextNode=new Node(element);
				//nextNode.data=element;
				nextNode.next=head.next;
				head.next=nextNode;
			}
		}
		return head;*/
	}
	
	public static Node<Integer> reverse_I(Node<Integer> head) {
		Node<Integer> prev = null;
        Node<Integer> current = head;
        while(current != null){
        	Node<Integer> temp = current.next;
        	current.next = prev;
        	prev = current;
        	current = temp;
        }
        return prev;
	}
	
/*	public static Node<Integer> insertionSort(Node<Integer> head) {
	if (head == null || head.next == null)
		return head;

	Node newHead = new Node(head.data);
	Node pointer = head.next;

	// loop through each element in the list
	while (pointer != null) {
		// insert this element to the new list

		Node innerPointer = newHead;
		Node next = pointer.next;

		if (pointer.data <= newHead.data) {
			Node oldHead = newHead;
			newHead = pointer;
			newHead.next = oldHead;
		} else {
			while (innerPointer.next != null) {

				if (pointer.data > innerPointer.data && pointer.data <= innerPointer.next.data) {
					Node oldNext = innerPointer.next;
					innerPointer.next = pointer;
					pointer.next = oldNext;
				}

				innerPointer = innerPointer.next;
			}

			if (innerPointer.next == null && pointer.val > innerPointer.val) {
				innerPointer.next = pointer;
				pointer.next = null;
			}
		}

		// finally
		pointer = next;
	}

	return newHead;
}*/
	
	public static Node<Integer> append(Node<Integer> root, int n) {
        if(root == null || root.next == null) 
           return root;
     Node<Integer> secLast = null;
     Node<Integer> last = root;
     while (last.next != null)  
     {
        secLast = last;
        last = last.next; 
     }
     secLast.next = null;
     last.next = root;
     root = last;
		return root;
	}

	public static Node deleteAtIR(Node head,int position){
		if(position == 0){
			head=head.next;
			return head;
		}
		Node nextNode = deleteAtIR(head.next, position-1);
		head.next=nextNode;
		return head;
		
	}
	public static int midPoint(Node head){
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return (int) slow.data;
	}
	
	public static Node deleteAtI(Node head,int i){
		Node prev=head;
		int j=1;
		int l=length(head);
		if(i>l){
			return head;
		}
		while(j<i){
			prev=prev.next;
			j++;
		}
		prev.next=prev.next.next;
		return head;
	}
	
	public static void reversePrint(Node head){
		if(head== null){
			return ;
		}
		reversePrint(head.next);
		System.out.print(head.data + "-->");
	}
	
	public static Node insertR(Node head, int pos, int data) {
	    if(pos == 0){
	        Node  newNode = new Node (data);
	        newNode.next = head;
	        return newNode;
	    }
	    Node  newNext = insertR(head.next, pos-1, data);
	    head.next = newNext;
	    return head;
		
	}
}
