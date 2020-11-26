package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        Friend friend=new Friend();
        

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i=0; i<friendArray.length; i++) {
        	friendArray[i]=friend;
        	
        	 for(int j=0; j<i; j++) {
             	System.out.print("이름: ");
             	friend.setName(sc.nextLine());
             	
             	System.out.print("핸드폰: ");
             	friend.setHp(sc.nextLine());
             	
             	System.out.print("학교: ");
             	friend.setSchool(sc.nextLine());
             
             	System.out.println("---------------------------");

             }
        	
        }
       
        	// 친구정보(핸드폰) 입력받기
        
        	// 친구정보(학교) 입력받기

            // Friend 인스턴스 생성하여 데이터 넣기

            // 인스턴스 주소를 배열에 대입

        
        // 친구정보 출력 --> 계속 마지막 배열값만 출력됨.
        
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }
        
        

        sc.close();
    }

}
