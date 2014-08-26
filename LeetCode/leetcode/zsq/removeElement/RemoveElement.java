package leetcode.zsq.removeElement;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class RemoveElement {
 
	@Test
	public void test1(){
		int[] A={4,5};
		int elem = 5;
		
		int length = removeElement(A, elem);
		System.out.println(length);
	}
	
	public int removeElement(int[] A, int elem) {
		
        
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < A.length; i++) {
			list.add(A[i]);
		}
        while(list.contains(elem)){
        	if(list.size()==1)
        		return 0;
        	list.remove((Integer)elem);
        }
        int removeElement=list.size();
        return removeElement;
    }
}
