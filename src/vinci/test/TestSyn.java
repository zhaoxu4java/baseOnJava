package vinci.test;
/**
 * ����main����������synchronized���߳�ִ��˳�� 
 * @author Vinci
 * �����i am main
 * 	   i am method1
 */
public class TestSyn {
	public static synchronized void main(String[] args){
		Thread t1 = new Thread(new Runnable() {
	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//�����ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬����
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
