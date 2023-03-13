package study10_4;

public class ColorTv extends Tv{
	private int resolution;
	
	public ColorTv(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	
	public int getResolution() {
		return resolution;
	}

	void printProperty() {
		System.out.println("사이즈는 "+ getSize()+"인치"+" 컬러는 "+resolution+"입니다.");
	}
}
