package study08;

import java.util.ArrayList;

public class PriceRun {
	public static void main(String[] args) {
		
		ArrayList<Customer> cusList = new ArrayList<>();
		Customer hong = new Customer("홍길동");
		Customer lee = new Customer("이순신");
		GoldCustomer sung = new GoldCustomer("성시경");
		VipCustomer kim = new VipCustomer("김정호", "대동아");
		VipCustomer kong = new VipCustomer("공유", "와이파이");
				
		cusList.add(lee);
		cusList.add(hong);
		cusList.add(sung);
		cusList.add(kim);
		cusList.add(kong);
		
		showCustomer(cusList);
		calcPriceAll(cusList, 100000);

	}
	
	public static void showCustomer(ArrayList<Customer> cusList) {
		System.out.println("====고객정보====");
		for(Customer cus: cusList) {
			System.out.println(cus.getCustomerInfo());
		}
	}

	public static void calcPriceAll(ArrayList<Customer> cusList, int price) {
		System.out.println("====가격계산====");
		System.out.println("가격: " + price);
		for(Customer cus : cusList) {
			int cost = cus.calcPrice(price);
			System.out.printf("%s 고객님의 구매금익은 %d원입니다.", cus.getCustomerName(), cost);
			System.out.println(cus.getCustomerInfo());
		}
	}
	
}
