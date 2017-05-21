package vinci.bean.thread;

/**
 * 此类用于测试synchronized的锁重入功能
 * @author Vinci
 *
 */
public class SyncDouble {
	synchronized void method1(){
		System.out.println("method1 ...");
		method2();
	}
	synchronized void method2(){
		System.out.println("method2 ...");
		method3();
	}
	synchronized void method3(){
		System.out.println("method3 ...");
	}
	public static void main(String[] args){
		final SyncDouble syncDouble = new SyncDouble();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				syncDouble.method1();
			}
		});
		thread.start();
	}
}
