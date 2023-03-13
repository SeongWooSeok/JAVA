package study10_4;

public class IPTv extends ColorTv{
	
	String adress;
	//double adress; //string.valueof(adress) => double을 string으로 형변환
	
	public IPTv(String adress, int size, int resolution) {
		super(size, resolution);
		this.adress= adress;
	}

	public String getAdress() {
		return adress;
	}
	
	void printProperty() {
		System.out.println("IPTV는 "+ adress +" 사이즈는 "+ getSize()+"인치"+" 컬러는 "+getResolution()+"입니다.");
	}

}
