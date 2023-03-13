package study15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterfaceRun {
	public static void main(String[] args) {
			TreeMap<Integer, String> tm = new TreeMap<>();
//			{
//				@Override
//				public String toString() {
//					return "안녕!";
//				}
//			};
			tm.put(103,"Lee");
			tm.put(102,"KIM");
			tm.put(101,"KIM");
			tm.put(102,"HONG");
			System.out.println(tm);
			System.out.println(tm.size());
			HashMap<Integer, String> hm = new HashMap<>();
			hm.put(103,"Lee");
			hm.put(102,"KIM");
			hm.put(101,"KIM");
			hm.put(102,"HONG");
			System.out.println(hm);
			System.out.println(hm.size());
			LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
			lhm.put(103,"Lee");
			lhm.put(102,"KIM");
			lhm.put(101,"KIM");
			lhm.put(102,"HONG");
			System.out.println(lhm);
			System.out.println(lhm.size());
			Hashtable<Integer, String> ht = new Hashtable<>();
			ht.put(103,"Lee");
			ht.put(102,"KIM");
			ht.put(101,"KIM");
			ht.put(102,"HONG");
			System.out.println(ht);
			System.out.println(ht.size());
	}
}
