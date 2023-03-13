package study08;

public class GoldCustomer extends Customer{ // extends를 하더라도 생성자를 물려받지는 않음
	private double saleRatio; //할인율

	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		saleRatio = 0.05;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
}
