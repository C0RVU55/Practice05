package com.javaex.ex06;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate; //전역 변수에 값대입
    }
    
    public static double toDoller(double won){
        return won / rate; //달러환전
    }

    public static double toKWR(double dollar){
        return dollar * rate; //원화환전
    }
    

}
