package study17;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StreamPrac {
	public static void main(String[] args) {
		File file = new File("src//study17//files//input.txt");
		
		try(
				InputStream fis = new FileInputStream(file);
				OutputStream fos = new FileOutputStream(file);
				InputStream bis = new BufferedInputStream(fis);
				OutputStream bos = new BufferedOutputStream(fos);
				){
				int data;
				int sum = 0;
				byte[] a = new byte[100];
				while((data=bis.read(a))!=-1) {
					System.out.println(Arrays.toString(a));
					bos.write(data);
					sum+=data;
				}
				System.out.println(sum);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
//		int sum = 0;
//		try(
//				Scanner scan = new Scanner(file);
//				) {
//				while(scan.hasNextInt()) {
//					sum +=scan.nextInt();
//				}
//				System.out.println(sum);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
