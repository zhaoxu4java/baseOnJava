package vinci.test;
/**
 * 测试main方法被加上synchronized后线程执行顺序 
 * @author Vinci
 * 结果：i am main
 * 	   i am method1
 */
public class TestSyn {
	public static synchronized void main(String[] args){
		Thread t1 = new Thread(new Runnable() {
	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//匿名内部类不能直接访问外部类的非静态方法
				method1();
			}
		});
		t1.start();
		System.out.println("i am main");
	}		
	public synchronized static void method1(){
		System.out.println("i am method1");
	}
}
