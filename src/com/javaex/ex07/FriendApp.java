package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        //Friend friend=new Friend(); 클래스가 3개 필요하기 때문에 처음에 1번 해놓고 마는 게 아니라 3번 선언해야 함.
        //근데 어차피 배열에 넣을 거니까 3번 선언하는 게 아니라 반복문 돌려서 배열에 넣음.
        //--> 모든 값이 반복문 안에서만 돌고 있기 때문에 반복문 안에서 클래스 선언하고 배열에 넣고 다 해야 됨. 
        

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        /*
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
        */
        
        for(int i=0; i<friendArray.length; i++) {
        	friendArray[i]=new Friend(); //각 배열에 클래스 대입
        	
        	System.out.print("이름: ");
        	friendArray[i].setName(sc.nextLine());
         	
         	System.out.print("핸드폰: ");
         	friendArray[i].setHp(sc.nextLine());
         	
         	System.out.print("학교: ");
         	friendArray[i].setSchool(sc.nextLine());
         
         	System.out.println("---------------------------");
        	
        	
        }
        	//순서 기억하기 : 값 입력 > 인스턴스 생성해서 입력받은 값 대입 > 인스턴스 주소를 배열에 대입
        
        	// 친구정보(이름) 입력받기
        
        	// 친구정보(핸드폰) 입력받기
        
        	// 친구정보(학교) 입력받기

            // Friend 인스턴스 생성하여 데이터 넣기

            // 인스턴스 주소를 배열에 대입

        
        // 친구정보 출력 --> 계속 마지막 배열값만 출력됨.
        
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }
        
        /*클래스에 게터/세터만 쓰라고 해서 기본생성자만 가지고 만드는 줄 알았는데 꼭 기본생성자 아니어도 되는듯?
         *기본생성자만 가지고 만든다면 위처럼 쓸 수 있고 생성자(전체 파라미터)면 이름, 폰번, 주소를 각 String 변수에 받고
         *이걸 Friend fff=new Friend(이름, 폰번, 주소); 또는 setName 등 이용해서 새 인스턴스에 각 값을 넣은 다음 friendArray[i]=fff; 배열에 넣어줌.
         *for문 하나로 할 수 있음. 
         */
        
        sc.close();
    }

}
