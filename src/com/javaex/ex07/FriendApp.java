/*2021.11.30(화)08:43
 
[문제] com.javaex.ex07 패키지
java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 저
장하세요. 친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요

*/

package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        //친구정보 3명 입력 로직 --> 반복문 사용
        friendArray[0] = 
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            System.out.println(friendArray[i]);
        }

        sc.close();
    }

}
