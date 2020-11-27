package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	String result=""; //지역변수는 초기화해줘야 함.
    	
    	for(int i=0; i<strArray.length; i++) {
    		result += strArray[i]; // += <-- 기존 값에 우측항을 더함. 배열값을 각각 result 안에 넣어서 붙임.
    	}
    	
    	return result;
    	
    	/*해설
    	 * 반복문 전에 String result=""; 선언 --> 반복문 합 구할 때 int 초기값 0 정해놓는 것처럼 문자열은 초기값을 ""로 정함.
    	 * result=result+strArray[i];
    	 */
        
    }

}
