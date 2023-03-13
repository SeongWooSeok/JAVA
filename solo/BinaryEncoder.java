package solo;
//문자열 암호화
public class BinaryEncoder {
	
	 private static String encode(String[] inputs) {
		    StringBuffer sbuf = new StringBuffer();
		    
		    return sbuf.toString();
		  }
	
	 public static void main(String[] args) {
		 // inputs
		 String[] inputs = new String[args.length];
		 for (int i = 0; i < args.length; i++) {
			 inputs[i] = args[i];
		 }
		 // encode
		 String encodedStr = encode(inputs);
		 // print
		 System.out.println(encodedStr);
	 }
  
}