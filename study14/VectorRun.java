package study14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorRun {
	public static void main(String[] args) {
		
	Vector<String> vec = new Vector<>();
	Vector<String> vec2 = new Vector<>(Arrays.asList("사과", "오렌지","망고","배"));
	Vector<String> vec3 = new Vector<>(List.of("사과", "오렌지","망고","배"));
	
//	List<String> input = List.of("여름", "가을");
//	input.add("겨울");
/*
 * list.of는 작고 변경되지 않는 데이터의 경우 사용
 * 	값 변경 불가 , 크기 변경 불가(collections 생성후 변경)
 */

	List<String> input = Arrays.asList("여름", "가을");
//input.add("겨울");
	Collections.unmodifiableCollection(input);
	
/*
 * Arrays.asList는 크고 동적인 데이터에 사용
 * 	값 변경 가능 ,크기 변경 불가(collections 생성후 변경)
 */
	
//Collections.unmodifiableList(); --> 리스트 자체적으로 immutable하도록 세팅함
//unmodifiable list란 수정이 불가능한 읽기전용 list를 뜻함.
//소스 코드에 따라 바뀔수도 있다고 하니 내가 짜기 나름
	vec2.add("귤");
	vec2.addElement("김");
	System.out.println(vec2);
	System.out.println(vec2.size());
	System.out.println(vec2.capacity());
	vec2.add("귤");
	vec2.add("귤");
	vec2.add("귤");
	System.out.println(vec2.capacity());
	System.out.println(vec2.remove(7));
	System.out.println(vec2.remove("귤"));
	System.out.println(vec2);
	System.out.println(vec2.contains("망고"));
	System.out.println(vec2.indexOf("사과"));
	System.out.println(vec2.elementAt(1));
	System.out.println(vec2.get(1));
	
	
	
	}
}
