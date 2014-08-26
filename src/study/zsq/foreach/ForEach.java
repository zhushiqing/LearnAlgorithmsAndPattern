package study.zsq.foreach;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ForEach {

	@Test
	public void test1(){
		int[] arr={1,2,3,4};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	@Test
	public void test2(){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(int num : list){
			System.out.println(num);
		}
	}
	
	@Test
	public void test3(){
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		
		for (Object obj : map.keySet()) {
			String key = (String) obj;
			System.out.println(key+":"+map.get(key));
		}
		
	}
}
