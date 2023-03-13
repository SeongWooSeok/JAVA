1package study17;
2
3import java.io.File;
4import java.io.IOException;
5import java.nio.charset.Charset;
6
7public class FileClassRun {
8	public static void main(String[] args) throws IOException {
9		String path = "C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17";
10		File dir = new File(path);
11		if(!dir.exists()) {
12			dir.mkdir();
13		}
14		System.out.println(dir.exists());
15		
16		File file = new File(path + "\\TestFile.txt");
17		if(!file.exists()) {
18			file.createNewFile();
19		}
20		System.out.println(file.exists());
21		
22		File file2 = new File("C:\\Users\\kosmo\\eclipse-workspace\\javastudy\\src\\study17\\TestFile.txt");
23		File file3 = new File("C:/Users/kosmo/eclipse-workspace/javastudy/src/study17/TestFile.txt");
24		File file4 = new File("C:" +File.separator+"Users"+File.separator+
25				"kosmo" +File.separator+
26				"eclipse-workspace" +File.separator+
27				"javastudy" +File.separator+
28				"src" +File.separator+
29				"study17" +File.separator+"TestFile.txt");
30		System.out.println(file2.exists() + " " +file2.getAbsolutePath());
31		System.out.println(file3.exists() + " " +file3.getAbsolutePath());
32		System.out.println(file4.exists() + " " +file4.getAbsolutePath());
33		
34		System.out.println(System.getProperty("user.dir"));
35		File file5 = new File("src/study17/TestFile.txt");
36		File file6 = new File("src/study17/temp/TestFile.txt");
37		System.out.println(file5.exists() + " " +file5.getAbsolutePath());
38		System.out.println(file6.exists() + " " +file6.getAbsolutePath());
39		
40		System.out.println(dir.getName()+" "+dir.isDirectory()+" "+dir.getParent());
41		System.out.println(file.getName()+" "+file.isDirectory()+" "+file.getParent());
42		
43		File dir2 = new File(path+"\\temp");
44		System.out.println(dir2.mkdir());
45		
46		File[] files = dir.listFiles();
47		for(File file7:files) {
48			System.out.println(file7.getName()+" "+(file7.isFile()?">파일":">디렉토리"));
49		}
50		
51		Charset cs = Charset.forName("UTF-8");
52		Charset cs2 = Charset.defaultCharset();
53		System.out.println(cs2);
54		System.out.println(Charset.isSupported("EUC-KR"));
55		
56		byte[] arr1 = "재승".getBytes();
57		byte[] arr2 = "현명".getBytes(Charset.defaultCharset());
58		byte[] arr3 = "종호".getBytes(Charset.forName("MS949"));
59		byte[] arr4 = "만수".getBytes("UTF-8");
60		
61		System.out.println(arr1.length);
62		System.out.println(arr2.length);
63		System.out.println(arr3.length);
64		System.out.println(arr4.length);
65		
66		String str1 = new String(arr1);
67		String str2 = new String(arr2 , Charset.defaultCharset());
68		String str3 = new String(arr3 , Charset.forName("MS949"));
69		String str4 = new String(arr4 , "UTF-8");
70		String str5 = new String(arr3 , "UTF-8");
71		String str6 = new String(arr4 , "MS949");
72		
73		System.out.println(str1);
74		System.out.println(str2);
75		System.out.println(str3);
76		System.out.println(str4);
77		System.out.println(str5);
78		System.out.println(str6);
79		
80		
81		
82	}
83}
84