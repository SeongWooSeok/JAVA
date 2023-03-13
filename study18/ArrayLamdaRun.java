package study18;

public class ArrayLamdaRun {
	public static void main(String[] args) {
		ArrIF aif = new ArrIF() {
			@Override
			public int[] sizeOfArray(int length) {
				return new int[length];
			}
		};
		int[] arr1 = aif.sizeOfArray(4);
		System.out.println(arr1.length);
		
		ArrIF aif2 = length -> new int[length];
		int[] arr2 = aif2.sizeOfArray(5);
		System.out.println(arr2.length);
		aif = int[]::new;
		System.out.println(aif.sizeOfArray(10).length);
		
		ConstLamda c1 = new ConstLamda() {
			@Override
			public TwoConst getInstance() {
				return new TwoConst();
			}
		};
		TwoConst tc = c1.getInstance();
		
		ConstLamda cl = () -> new TwoConst();
		cl.getInstance();
		
		ConstLamdaWithParam clp = new ConstLamdaWithParam() {
			@Override
			public TwoConst getInstance(String str) {
				return new TwoConst(str);
			}
		};
		clp.getInstance("Hi");
		
		ConstLamdaWithParam cwp = str -> new TwoConst(str);
		cwp.getInstance("hi");
	}
}

interface ArrIF{
	int[] sizeOfArray(int length);
}

class TwoConst{
	//기본생성자
	TwoConst(){
		System.out.println("기본 생성자");
	}
	TwoConst(String str){
		System.out.println("매개변수 생성자" + str.toString());
	}
}

interface ConstLamda{
	TwoConst getInstance();
}

interface ConstLamdaWithParam{
	TwoConst getInstance(String str);
}