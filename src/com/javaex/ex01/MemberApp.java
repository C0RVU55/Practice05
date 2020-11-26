package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		//class에 값 대입
		Member m01=new Member("jws", "정우성", 50000);
		Member m02=new Member("yjs", "유재석", 30000);
		Member m03=new Member("lhr", "이효리", 40000);
		
		//테스트
		//System.out.println(m01.toString());
		
		//출력
		m01.showInfo();
		m02.showInfo();
		m03.showInfo();
	}

}
