package com.efounder.test;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> uniques = new HashSet<String>();
		HashSet<String> dups = new HashSet<String>();
		for(int i=0;i<args.length;i++)
			if(! uniques.add(args[i]))
				dups.add(args[i]);
		uniques.removeAll(dups);
		System.out.println("不重复的单词："+uniques);
		System.out.println("重复的单词:"+dups);
		boolean bool = uniques.contains("not");
		boolean bool1 = uniques.contains("to");
		System.out.println(bool);
		System.out.println(bool1);
		uniques.addAll(dups);
		System.out.println(uniques);	
	}

}
