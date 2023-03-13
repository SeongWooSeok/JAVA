package study06;

public class VarTestRun {

	int k =0;
	
	public int  localVal(int l) {
		k++;
		return ++l;
	}
	
	public static void main(String[] args) {
		int a = 1;
		VarTestRun vtr = new VarTestRun();
		a=vtr.localVal(a);
		System.out.println(a);
		System.out.println(vtr.k);
	}

}
