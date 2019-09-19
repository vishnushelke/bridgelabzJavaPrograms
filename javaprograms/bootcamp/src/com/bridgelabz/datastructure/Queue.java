package com.bridgelabz.datastructure;

public class Queue<T> {
	LinkedList<T> list = new LinkedList<T>();
	public int size;
	Node<T> head = list.head;

	public void enQueue(T data) {
		
		
			list.insert(data);
			size++;
		

	}

	public void deQueue() {
		if (size == 0) {
			System.out.println("Queue is Empty");
		} else {
			T data;
			Node<T> node = list.head;
			data = node.data;
			head = head.next;
			node = null;
			size--;
		}
	}

	public void show() {

		Node<T> node = list.head;
		while (node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}

	}

}
