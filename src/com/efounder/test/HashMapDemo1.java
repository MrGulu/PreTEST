package com.efounder.test;

import java.util.HashMap;

public class HashMapDemo1 {
	private static final Integer ONE = new Integer(1);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for(int i = 0;i<args.length;i++)
		{
			Integer freq = (Integer)m.get(args[i]);
			m.put(args[i],(freq==null?ONE:new Integer(freq.intValue()+1)));
		}
//			System.out.println("不同的单词有 "+m.size()+"个");
		    prt("不同的单词有 "+m.size()+"个");
			prt(m);
		}
	static void prt(String s)
	{
		System.out.println(s);
	}
	static void prt(HashMap<String, Integer> m)
	{
		System.out.println(m);
	}
}
