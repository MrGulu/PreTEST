package test2;
//ͨ���̳�Thread��ʵ�ֶ��߳�
class ThreadTest extends Thread{
    String name = null;
    int ticket = 0;
    public ThreadTest(String name){
        this.name = name;
    }
    public synchronized void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+this.name+" ticket:"+ticket++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }          
        }
    }
public static void main(String[] args) {
 
    ThreadTest mThread1 = new ThreadTest("�߳�һ");
    ThreadTest mThread2 = new ThreadTest("�̶߳�");
    ThreadTest mThread3 = new ThreadTest("�߳���");
    mThread1.start();
    mThread2.start();
    mThread3.start();
}
}
