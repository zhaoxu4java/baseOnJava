package vinci.bean.thread;

/**
 * 此类用于测试synchronized的锁重入功能
 * @author Vinci
 * 当子类调用继承自父类的synchronized public同步方法时，由于java的类的继承，可以说是自己的同步方法，由于目前访问该对象的
 * 线程拥有该对象的锁标记，当然可以直接调用
 */
public class SyncDouble2 {
	static class Main{
		public int i = 10;
		public synchronized void operationSup(){
			try {
				i--;
				System.out.println("mian i = "+i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	static class Sub extends Main{
		public synchronized void operationSub(){
			try {
				while(i>0){
					i--;
					System.out.println("sub i = "+i);
					Thread.sleep(100);
					this.operationSup();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Sub sub = new Sub();
				sub.operationSub();
			}
		});
		thread.start();
	}
}
