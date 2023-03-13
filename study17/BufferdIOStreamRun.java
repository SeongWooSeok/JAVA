package study17;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdIOStreamRun {
	public static void main(String[] args) {
		File file = new File("src\\study17\\BfferedFile.txt");
		File file2 = new File("src\\study17\\BfferedOutFile.txt");
		
		try(
				InputStream fis = new FileInputStream(file);
				OutputStream fos = new FileOutputStream(file2);
				InputStream bis = new BufferedInputStream(fis);
				OutputStream bos = new BufferedOutputStream(fos);
				){
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
