package soucecode;

import org.junit.Test;

public class IntegerUtil {
	
	@Test
	public void testEquals(){
		/**
		 * java对小数值的对象做缓存，所以小于128的数值用==判断是等值的，但是大于128的值就false了，对象比对必须用equals，谢谢。
		 */
		for (int i=0;i<10000;i++){
			Integer a = 129+1;
			Integer b = 129+1;
			if (a!=b){
				System.out.println("Error a");
			}
			
			if (!a.equals(b)){
				System.out.println("Error b");
			}
			
		}
		System.out.println("End!");
	}
}
