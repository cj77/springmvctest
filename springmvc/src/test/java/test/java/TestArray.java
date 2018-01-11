package test.java;
<<<<<<< HEAD

//test15
||||||| merged common ancestors
//test13
=======
//test14
>>>>>>> 6ba803d5abe87727c6a1349565d1b4b37ccdbf5f
import java.util.Arrays;

import org.junit.Test;

public class TestArray {
	@Test
	public void testCopy() {
		int value[] = {1,3,5,2};
		int cvalue[] = Arrays.copyOf(value, value.length);
		System.out.println(Arrays.toString(cvalue));
		
		int index = Arrays.binarySearch(cvalue, 5);
		System.out.println(index);
		
		Arrays.sort(cvalue);
		System.out.println(Arrays.toString(cvalue));
		
		String svalue[]={"10b","101a","2c","z","m"};
		Arrays.sort(svalue);
		System.out.println(Arrays.toString(svalue));
		
		//test 1
	}
}
