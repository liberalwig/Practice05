//Undone//2021.11.29(월)20:50
/*
[문제] com.javaex.ex02 패키지
다음은 GoodsApp 클래스에서 2곳의 오류가 발생했습니다. Goods 클래스 코드를 수정하여 오류가 발생하지 않
도록 수정하고 예상한 결과값과 비교해 보세요.( GoodsApp 클래스는 수정하지 말 것)
[GoodsApp.java  수정하지말것] [Goods.java  *수정해볼것*]
*/

//오류가 생긴 이유: 1)cup을 위한 디폴트생성자를 안 만들었다 이거 말곤 없는데 왜?


package com.javaex.ex02;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
	
}




