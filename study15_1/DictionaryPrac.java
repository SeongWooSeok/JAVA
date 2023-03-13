package study15_1;

import java.util.Scanner;
import java.util.TreeMap;

class Dictionary{
	private TreeMap<String, String> dic;
	
	Dictionary(){
		dic = new TreeMap<String , String>();
	}
	
	public void addWord(String eng, String kor) {
		dic.put(eng, kor);
	}
	//delWord()
	public String translate(String eng) {
		return dic.get(eng);
	}

	public TreeMap<String, String> getDic() {
		return dic;
	}

	public void setDic(TreeMap<String, String> dic) {
		this.dic = dic;
	}
}

public class DictionaryPrac {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		Scanner scan = new Scanner(System.in);
		dic.addWord("baby", "아기");
		dic.addWord("love", "사랑");
		dic.addWord("apple", "사과");
		
		System.out.println("======영한사전======");
		while(true) {
			System.out.println("1. 영단어 찾기 2. 사전에 추가 3. 영단어 삭제 4. 영단어 수정 5. 종료 (1~5)");
			int num = scan.nextInt();
			switch(num) {
				case 1 :  //영단어 찾기
						System.out.println("찾는 영단어: ");
						String input = scan.next();
						String output = dic.translate(input);
						if(output==null) { //결과가 없으면
							System.out.println("사전에 없는 단어입니다.");
						System.out.println("사전에 추가하시겠습니까? (Y/N)");
							String ans = scan.next().toUpperCase();
							if(ans.contains("Y")) {
								System.out.println("단어: " + input);
							System.out.println("의미: ");
								String kor = scan.next();
								dic.addWord(input, kor);
						}
						}else {
							System.out.println("의미: "+ output);
						}
					case 2: //사전에 추가
							System.out.println("추가할 단어: ");
							String input2 = scan.next();
							String output2 = dic.translate(input2);
							if(output2==null) { //결과가 없으면
						System.out.println("사전에 없는 단어입니다.");
							System.out.println("사전에 추가하시겠습니까? (Y/N)");
							String ans = scan.next().toUpperCase();
								if(ans.contains("Y")) {
									System.out.println("단어: " + input2);
									System.out.println("의미: ");
									String kor = scan.next();
									dic.addWord(input2, kor);
								}else{
									System.out.println("취소하였습니다");
							}
			}
//			System.out.println("찾는 영단어: ");
//			String input = scan.next();
//			if(input.equals("그만")) {
//				System.out.println("종료");
//				break;
//			}
//			String output = dic.translate(input);
//			if(output==null) { //결과가 없으면
//				System.out.println("사전에 없는 단어입니다.");
//				System.out.println("사전에 추가하시겠습니까? (Y/N)");
//				String ans = scan.next().toUpperCase();
//				if(ans.contains("Y")) {
//					System.out.println("단어: " + input);
//					System.out.println("의미: ");
//					String kor = scan.next();
//					dic.addWord(input, kor);
//			}
//			}else {
//				System.out.println("의미: "+ output);
//			}
			}
		}
	}
}
