package study13;

class GenBox<T>{
	private T type;
	public T getBox() {
		return type;
	}
	public void setBox(T type) {
		this.type=type;
	}
}

class GenBox2<K,V>{
	private K key;
	private V value;

	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

}

public class BoxRun2 {
	public static void main(String[] args) {
		GenBox<Integer> b1 = new GenBox<>();
		b1.setBox(12);
		System.out.println(b1.getBox());
		GenBox<String> b2 = new GenBox<>();
		b2.setBox("generic box");
		System.out.println(b2.getBox());
		
		GenBox2<String, Integer> b3= new GenBox2<>();
		b3.setKey("java");
		b3.setValue(1234);
		System.out.println(b3.getKey() +" "+ b3.getValue());
		
		GenBox2<Integer, String> b4= new GenBox2<>();
		b4.setKey(7);
		b4.setValue("럭키");
		System.out.printf("%03d %s\n", b4.getKey(),b4.getValue());
		
		
		
		
		
		
		
		
	}
}
