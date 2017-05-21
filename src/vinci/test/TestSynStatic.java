package vinci.test;

import vinci.bean.thread.MultiThread;
/**
 * 由于MultiThread类中的方法添加了static导致其方法为类级别方法，多个线程访问，即使是各自拥有各自执行对象方法的锁标记，仍然存在同步锁，
 * 表示锁定.class类
 * @author Vinci
 *
 */
public class TestSynStatic {
	public static void main(String[] args){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//内部类访问外部变量外部变量必须是final
				MultiThread.printNum("a");
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MultiThread.printNum("b");
			}
		});
		thread.start();
		thread2.start();
	}
}
