package vinci.test;

import vinci.bean.thread.MultiThread;
/**
 * ����MultiThread���еķ��������static�����䷽��Ϊ�༶�𷽷�������̷߳��ʣ���ʹ�Ǹ���ӵ�и���ִ�ж��󷽷�������ǣ���Ȼ����ͬ������
 * ��ʾ����.class��
 * @author Vinci
 *
 */
public class TestSynStatic {
	public static void main(String[] args){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//�ڲ�������ⲿ�����ⲿ����������final
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
