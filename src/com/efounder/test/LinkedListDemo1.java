package com.efounder.test;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>();
		queue.addFirst("ha");
		queue.addFirst("ha");
		queue.addFirst("yu");
		queue.addFirst("xiao");
		queue.addFirst("ai");
		queue.addFirst("wo");
		System.out.println(queue);
		queue.removeLast();
		queue.removeLast();
		System.out.println(queue);
	}

}
