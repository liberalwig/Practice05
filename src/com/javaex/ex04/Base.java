//Undone//2021.11.30(화)07:51
/*
[문제] com.javaex.ex04 패키지
다음과 같이 2가지 클래스가 제공된다. 
BaseApp클래스를 실행했을 때 아래와 같이 나올 수 있도록 Base 클래스를 수정하세요.
(BaseApp 클래스는 수정하지 않습니다.)

낮에는 열심히 수업 듣자
밤에는 숙면
오후도 낮과 마찬가지로 공부해야 합니다.
*/

//문제분석:BaseApp특징1)static임

package com.javaex.ex04;

public class Base {
    
    public void service(String state) {
        
        //코드작성할것
    }
    
    //메소드 일반
    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

