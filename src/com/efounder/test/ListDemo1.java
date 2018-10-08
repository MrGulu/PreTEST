package com.efounder.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> list = new ArrayList<Number>();
		list.add(new Byte((byte) 1));
		list.add(new Short((short) 2));
		list.add(new Integer(3));
		list.add(new Float(5.0F));
		list.add(new Double(60.00));
		list.add(new Integer(3));
		Iterator<Number> i = list.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		int len = list.size();
		for (int n = 0; n < len; n++) {
			System.out.println(list.get(n));
		}
		System.out.println();
		int x = list.indexOf(new Short((short) 2));
		System.out.println(x);
		/* 3的位置索引   indexOf 方法返回一个整数值，指出 String 对象内子字符串的开始位置。如果没有找到子字符串，则返回-1。
		如果 startindex 是负数，则 startindex 被当作零。如果它比最大的字符位置索引还大，则它被当作最大的可能索引。*/
		int x1 = list.indexOf(3);
		System.out.println(x1);
		// 从尾部向前查找，3的位置索引
		int x11 = list.lastIndexOf(3);
		System.out.println(x11);
		list.remove(2);
		System.out.println(list);
	}

}
