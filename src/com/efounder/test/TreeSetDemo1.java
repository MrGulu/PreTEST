package com.efounder.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<String>();
		boolean b;
		b=s.add("to");
		System.out.println("添加单词to，返回为"+b);
		b=s.add("be");
		System.out.println("添加单词be，返回为"+b);
		b=s.add("or");
		System.out.println("添加单词or，返回为"+b);
		b=s.add("not");
		System.out.println("添加单词not，返回为"+b);
		b=s.add("to");
		System.out.println("添加单词to，返回为"+b);
		b=s.add("be");
		System.out.println("添加单词be，返回为"+b);
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
