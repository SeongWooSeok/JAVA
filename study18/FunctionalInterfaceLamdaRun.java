package study18;

public class FunctionalInterfaceLamdaRun {
	public static void main(String[] args) {
		FunctionInterface1 ixox = new FunctionInterface1() {
			@Override
			public void abMethod1() {
				System.out.println(" i x o x 메서드");
			}
		};
		ixox.abMethod1();
		
		FunctionInterface1 ixox1 = () -> System.out.println(" i x o x 람다식");
		ixox1.abMethod1();
		
		FunctionInterface2 ixoo = new FunctionInterface2() {
			@Override
			public int abMethod2() {
				System.out.println(" i x o o 메서드");
				return 100;
			}
		};
		ixoo.abMethod2();
		
		FunctionInterface2 ixoo1 = () ->{
			System.out.println("i x o o 람다식");
			return 100;
		};
		
		ixoo1.abMethod2();
		
		FunctionInterface3 ioox = new FunctionInterface3() {
			@Override
			public void abMethod3(int i) {
				System.out.println("i o o x 메서드" + i);
			}
		};
		ioox.abMethod3(50);
		
		FunctionInterface3 ioox1 = i -> System.out.println("i o o x 람다식" + i);
		ioox1.abMethod3(51);
		
		FunctionInterface4 iooo = new FunctionInterface4() {
			@Override
			public double abMethod4(int i, double d) {
				System.out.println("i o o o 메서드");
				return i*d;
			}
		};
		System.out.println(iooo.abMethod4(10, 20));
		
		FunctionInterface4 iooo1 = (i, d) -> i*d;
		System.out.println(iooo1.abMethod4(10, 20));
	}
}
