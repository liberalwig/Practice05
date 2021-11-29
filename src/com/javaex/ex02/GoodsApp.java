//Undone//2021.11.29(월)20:50
/*
[문제] com.javaex.ex02 패키지
다음은 GoodsApp 클래스에서 2곳의 오류가 발생했습니다. Goods 클래스 코드를 수정하여 오류가 발생하지 않
도록 수정하고 예상한 결과값과 비교해 보세요.( GoodsApp 클래스는 수정하지 말 것)
[GoodsApp.java  수정하지말것] [Goods.java  *수정해볼것*]
*/

package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
			
			Goods camera = new Goods();
			camera.setName("니콘");
			camera.setPrice(400000);
			
			Goods cup = new Goods("머그 컵", 2000);
			
			camera.showInfo();
			cup.showInfo();
		
	}

}


