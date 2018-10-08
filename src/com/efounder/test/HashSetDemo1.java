package com.efounder.test;

import java.util.HashSet;

public class HashSetDemo1 {
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		for(int i = 0;i<args.length;i++)
			/*先执行s.add方法，成功则插入；如果失败则打印出单词
			 HashSet不允许重复值出现*/
			if(! s.add(args[i]))
				System.out.println("重复的单词："+args[i]);
		System.out.println(s.size()+"不同的单词"+s);
	}

}
