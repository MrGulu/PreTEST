package com.efounder.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<String>();
		boolean b;
		b=s.add("to");
		System.out.println("��ӵ���to������Ϊ"+b);
		b=s.add("be");
		System.out.println("��ӵ���be������Ϊ"+b);
		b=s.add("or");
		System.out.println("��ӵ���or������Ϊ"+b);
		b=s.add("not");
		System.out.println("��ӵ���not������Ϊ"+b);
		b=s.add("to");
		System.out.println("��ӵ���to������Ϊ"+b);
		b=s.add("be");
		System.out.println("��ӵ���be������Ϊ"+b);
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
