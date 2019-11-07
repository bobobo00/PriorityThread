package thread;
/**
 * 线程的优先级：1-10
 * 1,NORM_PRIORITY  5 默认
 * 2,MIN_PRIORITY  1
 * 3,MAX_PRIORITY 10
 * 概率：
 * @author dell
 *
 */

public class PriorityThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		MyPriority mp=new MyPriority(); 
		Thread t1=new Thread(mp);
		Thread t2=new Thread(mp);
		Thread t3=new Thread(mp);
		Thread t4=new Thread(mp);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(4);
		t4.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
class MyPriority implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
}

