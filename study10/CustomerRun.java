package study10;

public class CustomerRun {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.comp();
		
		//인터페이스는 상속개념과는 달리 인터페이스 자신의 안에 있는것만 사용가능
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		//buyer.sell();
		//buyer.comp();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		//seller.buy();
		//seller.comp();
		
	}

}
