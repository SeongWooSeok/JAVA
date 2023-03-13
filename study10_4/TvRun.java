package study10_4;

public class TvRun {

	public static void main(String[] args) {
		ColorTv ctv = new ColorTv(32,1024);//size,resolution
		ctv.printProperty();
		//32인치 1024컬러
		
		IPTv iptv = new IPTv("192.1.1.4",68,2048);
		iptv.printProperty();
		//IPTV는 192.1.1.4 주소의 64인치 2048컬러
	}

}
