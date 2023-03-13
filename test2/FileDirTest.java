package test2;

import java.io.File;

public class FileDirTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src";
		File src = new File(path);
		//현재 폴더의 하부 파일과 디렉토리를 구분하여 출력
		
		File[] flist = src.listFiles();
		for(int i = 0; i<flist.length; i++) {
			if(flist[i].isFile()) {
				System.out.println("파일 : "+flist[i].getPath());
			}else if(flist[i].isDirectory()) {
					System.out.println("폴더 : " +flist[i].getPath() );
			}
		}
	
	}
}
