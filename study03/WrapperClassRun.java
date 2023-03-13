package study03;

public class WrapperClassRun {

	public static void main(String[] args) {
		int a = 10;
		Integer num = 10;//auto boxing
		int n = num;//auto unboxing
		n = num.intValue();//unboxing
		System.out.println(n);
		String str1 = "100";
		String str2="3.14";
		String str3="false";
		
		
		byte b = Byte.parseByte(str1);
		System.out.println(b);
		int i = Integer.parseInt(str1);
		System.out.println(i);
		short s = Short.parseShort(str1);
		System.out.println(s);
		long l = Long.parseLong(str1);
		System.out.println(l);
		float f =Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		System.out.println(d);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);

	}

}
