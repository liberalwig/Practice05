/*Undone//2021.11.30(화)08:26

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

public class PrintApp {

    public static void main(String[] args) {

        Print print = new Print();
        
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
        
    }

}
