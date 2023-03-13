package study15_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		int[] arr = { 10,20,30,40,50,60,70,40,30,20};
		Set<Integer> set = new HashSet<>();
		Integer[] arr2 = new Integer[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
//		set.addAll(Arrays.asList(arr2));
//		System.out.println(set);
		
		for(Integer num : arr2) {
			if(!set.contains(num)) {
				set.add(num);
				System.out.println(num + " 성공 ");
			}else{
				System.out.println(num + " 실패 ");
			}
		}
		System.out.println(set);
		
	}
}
