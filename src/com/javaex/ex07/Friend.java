/*2021.11.30(화)08:43
 
[문제] com.javaex.ex07 패키지
java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 저
장하세요. 친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요

*/

package com.javaex.ex07;

public class Friend {
	//필드
    private String name;
    private String hp;
    private String school;

    //생성자
    public String friend;
    
    //메소드gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	//메소드 일반
	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
}
