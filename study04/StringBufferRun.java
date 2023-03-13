package study04;

public class StringBufferRun {

	public static void main(String[] args) {
		//StringBuffer 멀티스레드 환경에서 더 안전
		//StringBuilder는 버퍼보다 성능이 더 우수
		StringBuffer sb1 = new StringBuffer("가나다");
		StringBuffer sb2 = new StringBuffer("가나다");
		StringBuffer sb3 = new StringBuffer("abc");
		
		//apeend
		sb1.append(false);
		sb2.append(12.3);
		sb3.append("def");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
		
		//insert
		sb1.insert(3, "라마바사");
		System.out.println(sb1);
		
		//delete
		sb1.delete(7,12);
		System.out.println(sb1);
		System.out.println(sb1.indexOf("라"));
		System.out.println(sb1.length());
		//subString()
		System.out.println(sb1.substring(1,4));
		System.out.println(sb1);
		//replace()
		System.out.println(sb1.replace(1, 4, "지마"));
		System.out.println(sb1);
		//reverse()
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		
		
		
		
		
		
	}

}
