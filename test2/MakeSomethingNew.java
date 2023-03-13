package test2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) {
		//test2.files 아래로 폴더명과 파일명을 입력받아서 새로 생성
		String path = "src/test2/files";
		File fp1 = new File(path);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("폴더명을 입력해주세요 : ");
		String folder = sc.next();
		String folderPath = path + " / " + folder;
		File dir = new File(folderPath);
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		System.out.println("파일명을 입력해주세요 : ");
		String file = sc.next();
		String filePath = path + "/ "+file;
		File dir1 = new File(filePath);
		if(!dir1.exists()) {
			try {
				dir1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
