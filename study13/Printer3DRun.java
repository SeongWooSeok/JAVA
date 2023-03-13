package study13;

interface Material{
	void doPrinting();
}

//일반클래스 인터페이스를 구현
class Powder implements Material{

	@Override
	public void doPrinting() {
		System.out.println("파우더 제품 제작중...");
	}

	@Override
	public String toString() {
		return "사용물질:파우더";
	}
}

class Plastic implements Material{

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 제품 제작중...");
	}

	@Override
	public String toString() {
		return "사용물질:플라스틱";
	}
}

class Print3D<T extends Material>{
	private T material;

	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}

public class Printer3DRun {
	public static void main(String[] args) {
		Print3D<Powder> pPo1= new Print3D<>();
		pPo1.setMaterial(new Powder());
		System.out.println(pPo1.toString());
		pPo1.printing();
		Print3D<Plastic> pPo2= new Print3D<>();
		pPo2.setMaterial(new Plastic());
		System.out.println(pPo2.toString());
		pPo2.printing();
		//pPo.setMaterial(new Plastic());
		Print3D<Material> pMa = new Print3D<>();
		pMa.setMaterial(new Powder());
		pMa.setMaterial(new Plastic());
	}
}
