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
		/* 3��λ������   indexOf ��������һ������ֵ��ָ�� String ���������ַ����Ŀ�ʼλ�á����û���ҵ����ַ������򷵻�-1��
		��� startindex �Ǹ������� startindex �������㡣������������ַ�λ�����������������������Ŀ���������*/
		int x1 = list.indexOf(3);
		System.out.println(x1);
		// ��β����ǰ���ң�3��λ������
		int x11 = list.lastIndexOf(3);
		System.out.println(x11);
		list.remove(2);
		System.out.println(list);
	}

}
