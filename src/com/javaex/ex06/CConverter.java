/*2021.11.30(화)08:40
[문제] com.javaex.ex06 패키지
Static 필드와 메소드를 이용하여 
달러와 우리나라 원화 사이의 변환을 해주는 환율 계산기를 만들어보세요

백만원은 893.894...달러입니다.
백달러는 11870.0입니다.
*/

package com.javaex.ex06;

public class CConverter {
    
    public static double rate;
    
    
    
    //메소드gs
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
