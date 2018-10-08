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
 * 运行后应该启动了10个新的线程,加上主线程一共11个线程,应该输出是Thread-1知道10.
这里要注意启动线程的方式是调用了Thread的start()方法,而不是run方法,如果
用注释里的1或者2输入都是10个main,因为这个时候run()方法还原了,和普通方法一样了.
我们也可以得出一个结论:所有的线程在运行时都是一个Thread实例,虽然可以不用继承Thread
实现多线程,但是最终还是Thread的一个实例.
*/
