package datastructure;

import java.util.Arrays;
import java.util.LinkedList;

//연결 리스트는 늘어선 노드의 중간지점에서도 자료의 추가와 삭제가 O(1)의 시간에 가능하다는 장점을 갖는다.
//그러나 배열이나 트리 구조와는 달리 특정 위치의 데이터를 검색해 내는데에는 O(n)의 시간이 걸리는 단점도 갖고 있다.
public class LinkedList2 {

	private Node head;
	private Node tail;
	private int size;

	class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (newNode.next == null) {
			tail = newNode;
		}
	}

	public void addLast(Object input) {
		if (size == 0) {
			addFirst(input);
			return;
		}
		Node newNode = new Node(input);
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	Node node(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void add(int i, Object input) {
		if (i == 0) {
			addFirst(input);
			return;
		}
		Node prev = node(i - 1);
		Node next = prev.next;
		Node newNode = new Node(input);
		prev.next = newNode;
		newNode.next = next;
		size++;
		if (newNode.next == null) {
			tail = newNode;
		}
	}

	public Object removeFirst() {
		Node tmp = head;
		head = head.next;
		Object returnData = tmp.data;
		tmp = null;
		size--;
		return returnData;
	}

	public Object remove(int i) {
		if (i == 0) {
			return removeFirst();
		}
		Node prev = node(i - 1);
		Node next = prev.next.next;
		Node todoDeleted = prev.next;
		prev.next = next;
		Object returnData = todoDeleted.data;
		if (todoDeleted == tail) {
			tail = prev;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}

	public Object removeLast() {
		return remove(size -1);
	}

	public Object get(int i) {
		Node node = node(i);
		return node.data;
	}

	public int size() {
		return this.size;
	}
}
