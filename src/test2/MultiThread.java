package test2;


public class MultiThread implements Runnable{
	 public static void main(String[] args){
	    for(int i=0;i<10;i++){
	       new Thread(new MultiThread()).start();//correct
//	                new Thread(new MultiThread()).run();  1
//	  new MultiThread().run();    2 
	    }
	 }
	 public void run(){    
	    System.out.println(Thread.currentThread().getName());
	 }
	}
/**
 * ���к�Ӧ��������10���µ��߳�,�������߳�һ��11���߳�,Ӧ�������Thread-1֪��10.
����Ҫע�������̵߳ķ�ʽ�ǵ�����Thread��start()����,������run����,���
��ע�����1����2���붼��10��main,��Ϊ���ʱ��run()������ԭ��,����ͨ����һ����.
����Ҳ���Եó�һ������:���е��߳�������ʱ����һ��Threadʵ��,��Ȼ���Բ��ü̳�Thread
ʵ�ֶ��߳�,�������ջ���Thread��һ��ʵ��.
*/
