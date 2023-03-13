package test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import study01.Sysout;

public class IOTest {
	public static void main(String[] args) throws IOException {
//		File file = new File("src\\filezip\\filetest.txt");
		
//		FileOutputStream os = new FileOutputStream(file);
//		byte[] barr1 = "자바공부 열심히".getBytes();
//		os.write(barr1);
//		os.flush();
//		os.close();
		
		
		String target = "src/study17/FileClassRun.java";
		String dest = "src/test2/files/FileClassRunNum2.java";
//		File file = new File(target);
//		File newfile = new File(dest);
//		Files.copy(file.toPath(), newfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		int data;
		int num = 1;
		try {
			FileInputStream fis = new FileInputStream(target);
			FileOutputStream fos = new FileOutputStream(dest);
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter osw = new OutputStreamWriter(fos);

			while((data=isr.read())!=-1) {
				if(num==1) {
					osw.write(String.valueOf(num++));
				}
				osw.write(data);
				if(data=='\n') {
					osw.write(String.valueOf(num++));
				}
			}
			osw.flush();
			osw.close(); isr.close();
			fos.close(); fis.close();
			System.out.println("파일 생성");
		} catch(FileNotFoundException e){
			System.out.println("다음 파일이 없습니다. : " + target);
		}catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
