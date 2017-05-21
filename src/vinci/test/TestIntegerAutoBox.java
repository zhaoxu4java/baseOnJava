package vinci.test;

import org.junit.Test;
/**
 * jdk1.5之后的自动拆箱封箱
 * @author Vinci
 *
 */
public class TestIntegerAutoBox {
	Integer i01 = 59;
	int i02 = 59;
	Integer i03 =Integer.valueOf(59);
	Integer i04 = new Integer(59);
	@Test
	public void test1(){
		System.out.println(i01== i02);
		System.out.println(i01== i03);
		System.out.println(i03== i04);
		System.out.println(i02== i04);
	}
}
