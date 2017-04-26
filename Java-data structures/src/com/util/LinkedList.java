package com.util;

import java.util.Iterator;

public class LinkedList implements Iterable<Object> {

	private Node head = null;

	// add ( at last i.e append )

	public void add(Object data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}

	}

	// insert
	public void add(int idx, Object data) {
		// .
	}

	// remove
	public boolean remove(int idx) {
		Node current = head;
		if (idx == 0) {
			// ...
		} else {
			int i = 1;
			while (head.getNext() != null) {
				if (idx == i) {
					current.setNext(current.getNext().getNext());
					return true;
				}
				i++;
				current = current.getNext();
			}
		}
		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			Node current = head;

			@Override
			public boolean hasNext() {
				if (current != null) {
					return true;
				} else
					return false;
			}

			@Override
			public Object next() {
				Object data = current.getData();
				current = current.getNext();
				return data;
			}
		};
	}

	private class Node {

		private Object data;
		private Node next;

		public Node(Object data) {
			super();
			this.data = data;
		}

		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
