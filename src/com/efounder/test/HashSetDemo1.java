package com.efounder.test;

import java.util.HashSet;

public class HashSetDemo1 {
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		for(int i = 0;i<args.length;i++)
			/*��ִ��s.add�������ɹ�����룻���ʧ�����ӡ������
			 HashSet�������ظ�ֵ����*/
			if(! s.add(args[i]))
				System.out.println("�ظ��ĵ��ʣ�"+args[i]);
		System.out.println(s.size()+"��ͬ�ĵ���"+s);
	}

}
