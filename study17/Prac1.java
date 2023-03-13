package study17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Prac1 {
	public static void main(String[] args) {
File file = new File("src//study17//files//input.txt");
		
		try(
				InputStream fis = new FileInputStream(file);
				OutputStream fos = new FileOutputStream(file);
				//Outputstream 객체를 생성하는 순간 input.txt의 데이터가 날아감.
				//아마 파일이 덮어씌워져서 이런 현상이 생기는 것이므로 그냥 저장하지말고
				//받아온 입력값으로 바로 합을 구하던가 저장하고 진행하고 싶으면
				//파일을 하나 더만들어서 inputstream에 값들을 넣고 다른파일에 합을 구한것을 저장하는 형식으로 만들어야함
				//InputStream bis = new BufferedInputStream(fis);
				//OutputStream bos = new BufferedOutputStream(fos);
				){
				int data;
				byte[] a = new byte[100];
				while((data=fis.read(a))!=-1) {
					System.out.println(Arrays.toString(a));
				}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
