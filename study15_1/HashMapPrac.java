package study15_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;

//keyset , entryset
class PersonInfo{
	private String name;
	private String adress;
	
	PersonInfo(String adress, String name){
		this.name = name;
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class PersonInfoList{
	private HashMap<String, PersonInfo> pList;
	
	PersonInfoList(){
	pList =	new HashMap<String, PersonInfo>();
	}
	
	void addPersonInfo(String name, String telNum, String address) {
		PersonInfo pInfo = new PersonInfo (name, address);
		pList.put(telNum, pInfo);
	}
	
	ArrayList<String> getPersonInfoWithName(String name) {
		ArrayList<String> al = new ArrayList<>();
		Set<Entry<String, PersonInfo>> entrySet = pList.entrySet();
		Iterator<Entry<String, PersonInfo>> entry = entrySet.iterator();
		while(entry.hasNext()) {
			Entry<String, PersonInfo> en = entry.next();
			PersonInfo pInfo = en.getValue();
			if(pInfo.getName().equals(name)) {
				 String eName = pInfo.getName();
				 String eTel =en.getKey();
				 String eAddr = pInfo.getAdress();
				al.add( "||이름: " + eName +"||전화번호: " + eTel + "||주소: "+eAddr);
			}
		}
			if(al.size()==0){
				al.add("해당 검색 대상이 없습니다.");
			}
			return al;
	}
	
	public ArrayList<String> getPersonInfoWithtelNum(String telNum) {
		Set<String> keySet = pList.keySet();
		Iterator<String> keys = keySet.iterator();
		ArrayList<String> results = new ArrayList<>();
//		Iterator<String> keys = pList.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			if(key.contains(telNum)) {
				PersonInfo pInfo = pList.get(key);
				results.add( "||이름: " + pInfo.getName()+"||전화번호: " + key + "||주소: "+pInfo.getAdress());
			}
		}
		if(results.size()==0) {
			results.add("해당 검색 대상이 없습니다.");
		}
		 return results;
		
		
		
//		if(pList.containsKey(telNum)) {
//			PersonInfo pInfo = pList.get(telNum);
//			return "||이름: " + pInfo.getName()+"||전화번호: " + telNum + "||주소: "+pInfo.getAdress();
//		}else {
//			return "해당 검색 대상이 없습니다.";
//		}
	}

	public HashMap<String, PersonInfo> getpList() {
		return pList;
	}

	public void setpList(HashMap<String, PersonInfo> pList) {
		this.pList = pList;
	}
}

public class HashMapPrac {
	public static void main(String[] args) {
		
	PersonInfoList pl = new PersonInfoList();
	pl.addPersonInfo("인순이", "010-1111-1111", "서울");
	pl.addPersonInfo("권보아", "010-2222-2222", "대전");
	pl.addPersonInfo("이보람", "010-3333-3333", "대구");
	Scanner scan = new Scanner(System.in);
	System.out.println("<<전화번호 목록>>");
	while(true) {
		List<String> result = new ArrayList<>();
		System.out.println("조회대상 선택\n1.이름\n2.전화번호");
		System.out.println("3.종료");
		System.out.println("선택: ");
		int menu = scan.nextInt();
		if(menu==1) {
			System.out.print("<검색>\n이름: ");
			String search= scan.next();
			result = pl.getPersonInfoWithtelNum(search);
		}else if(menu==2) {
		System.out.print("<검색>\n전화번호: ");
		String search= scan.next();
		result = pl.getPersonInfoWithtelNum(search);
		}else {
			System.out.println("검색종료");
			break;
		}
		for(String res : result) {
			System.out.println(res);
		}
	}
	
	}
}