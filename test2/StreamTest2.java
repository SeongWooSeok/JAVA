package test2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String[] args) {
		
		//System.out.println(question1());
//		System.out.println(question2());

	}
}
	
//	private final static List<String> SPELLS = Arrays.asList("TOMAS","a","hELLO","B", "korea","X","nutelia","apple");
//	//list에 저장된 단어에 첫번째 문자가 각각 몇개있는지 Map<String, Integer>로 반환
//	//예) ("X",1),("a",1)....
//	//static Map<String, Integer> question1(){
////		return SPELLS.stream()
////                .map(str-> str.substring(0, 1))
////                .collect(Collectors.toMap( prefix -> prefix, prefix -> 1,
////                        (oldValue, newValue) -> (newValue += oldValue)));
//// 	}
//		
//		for(int i = 0; i<SPELLS.size(); i++) {
//			String item = SPELLS.get(i).substring(0,1);
//			
//		}
//			
//			
//	
//	}
//	//list에 저장된 단어들 중에서 단어의 길이가 2이상인 경우에 모든 문자를 대문자로 변환하여 구분자를 스페이스로 하는 문자열로 반환
//	static String question2(){
//		Iterator iter =SPELLS.iterator(); 
//		
//		while(iter.hasNext()) {
//			String str = (String) iter.next();
//			if(str.length()>=2) {
//				str.toUpperCase();
//				str.join(str, " ");
//			}
//			return str;			
//		}
//		
//		 return SPELLS.stream()
//	                .filter(str -> str.length() > 1)
//	                .map(String::toUpperCase)
//	                .collect(Collectors.joining(" "));
//
//	}
//}
