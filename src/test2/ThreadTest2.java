package test2;
//ͨ��ʵ��Runnable�ӿ�ʵ�ֶ��߳�
class ThreadTest2 implements Runnable{
    int Counter = 0;
    @Override
    public synchronized void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"count:"+Counter++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }            
        }
    }    
public static void main(String[] args) {
    
    ThreadTest2 rThread = new ThreadTest2();
    Thread t1 = new Thread(rThread,"�߳�һ");
    Thread t2 = new Thread(rThread,"�̶߳�");
    Thread t3 = new Thread(rThread,"�߳���");
    t1.start();
    t2.start();
    t3.start();
}
}
