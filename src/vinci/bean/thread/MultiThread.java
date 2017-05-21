package vinci.bean.thread;
public class MultiThread{
	private static int num = 0;
	//static
	public static synchronized void printNum(String tag){
		if("a".equals(tag)){
			num = 100;
			System.out.println("num = "+num);
			try {
				Thread.sleep(1000);
				System.out.println("tag is a");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			num = 200;
			System.out.println("num = "+num);
			System.out.println("tag is "+tag);
		}
	}
}
