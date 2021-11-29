//2021.11.30(화)07:51
/*
[문제] com.javaex.ex04 패키지
다음과 같이 2가지 클래스가 제공된다. 
BaseApp클래스를 실행했을 때 아래와 같이 나올 수 있도록 Base 클래스를 수정하세요.
(BaseApp 클래스는 수정하지 않습니다.)
*/

package com.javaex.ex04;

public class BaseApp {

	//이 클래스의 코드는 수정하지 않습니다.
    public static void main(String args[]) {
        Base base = new Base();

        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}
