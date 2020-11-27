package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	String result=""; //지역변수는 초기화해줘야 함.
    	
    	for(int i=0; i<strArray.length; i++) {
    		String str=strArray[i];
    		result += strArray[i]; // += <-- 기존 값에 우측항을 더함. 배열값을 각각 result 안에 넣어서 붙임.
    	}
    	
    	return result;
        
    }

}
