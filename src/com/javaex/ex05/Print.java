/*Undone//2021.11.30(화)08:26 세상에, 아예 잘못 가고 있네

[문제] com.javaex.ex05 패키지
PrintApp 클래스에서 Print 인트턴스를 생성하고 
print() 메소드를 호출해서 파라미터 값을 출력하려고 합니다. 
출력 결과에 맞게 Print 클래스를 구현하세요.

10
true
5.7
홍길동
*/
package com.javaex.ex05;

public class Print {
    //필드
	public int val;
	public boolean trueorfalse;
	public double num;
	public String name;
	
	//생성자
	public Print() {		
	}
	
	//메소드 gs
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}


	//메소드 일반
    public void printer(int val){
        System.out.println(val);
    }
    public void printer(boolean trueorfalse){
        System.out.println(tru);
    }
    public void printer(int val){
        System.out.println(val);
    }
    public void printer(int val){
        System.out.println(val);
    }
}
