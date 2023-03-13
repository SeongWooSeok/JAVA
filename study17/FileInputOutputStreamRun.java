package study17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamRun {
	public static void main(String[] args) throws IOException {
		File file = new File("src\\study17\\TestFile.txt");
		
		FileOutputStream os1 = new FileOutputStream(file);
		byte[] barr1 = "InputOutPut practice".getBytes();
		os1.write(barr1);
		os1.write('\n');
		os1.flush();
		os1.close();
		
		InputStream is = new FileInputStream(file);
		int data;
		while((data=is.read())!=-1) {
			System.out.print((char)data+" "+is.available());
		}
		is.close();
		
		InputStream is2 = new FileInputStream(file);
		byte[] barr = new byte[23];
		int data2;
		while((data2=is2.read(barr))!=-1) {
			for(int i=0; i<data2; i++) {
				System.out.print((char)barr[i]);
			}
			System.out.println(data2);
		}
		is2.close();
		
		//files/TestFileOut.txt
		//ABCD....Z
		int[] barr2 = new int[26];
		byte datas =65;
		for(int i = 0; i<barr2.length; i++) {
			barr2[i] = datas++;
		}
		try (
			FileOutputStream fos = new FileOutputStream("src\\study17\\TestFileOut.txt");
			){
			fos.write(datas);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("성공");
	}
}
