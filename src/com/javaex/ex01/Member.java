//Done//2021.11.29(월)20:24-20:48 
/*
[문제] com.javaex.ex01 패키지
다음 설명을 읽고 Member 클래스를 작성하세요. 
[문제]
회원(Member) 클래스는 회원 아이디를 나타내는 id(문자열)와 회원 이름을 나타내는 name(문자열), 회원의
맴버십point를 나타내는 point(정수) 필드를 가지고 있다. 
메소드는 회원의 이름 변경 setName메소드와 이름을 반환하는 getName, 포인트를 변경하는 setPoint와 포
인트를 반환하는 getPoint, 회원아이디를 변경하는 setId, 반환하는 getId 메소드를 가지고 있다. 
모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻어가지 못하도록 private로 접근 제한을 막고, 메소
드는 제한 없이 모두 호출할 수 있는 접근제한자를 사용한다.

다음과 같이 출력되도록 Member 클래스에 showInfo() 메소드를 추가하고 MemberApp 클래스를 작성하세요.

회원정보: 정우성(jws), 50000점
회원정보: 유재석(yjs), 30000점
회원정보: 이효리(lhr), 40000점
*/

package com.javaex.ex01;

public class Member {
	//필드
	private String name;
	private String id;
	private int point;

	//생성자
	public Member() {		
	}
	
	public Member(String name, String id, int point) {
	super();
	this.id = id;
	this.name = name;
	this.point = point;
	}
	
	//메소드gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
	
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), "+ point + "점");
	}
	
}
