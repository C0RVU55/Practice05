package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance; //자동으로 0으로 인식. 
    //근데 static이 아닌데 왜 변한 값이 공유되는지 --> main에서 생성자로 받은 값을 switch반복문으로 계속 써서 변한 값이 저장되는듯. 
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo=accountNo;
    }
    public Account(int balance) {
    	this.balance=balance;
    }
    
    //필요한 메소드 작성
    public void deposit(int money) {
    	balance=balance+money;
    }
    public void withdraw(int money) {
    	balance=balance-money;
    }
    public void showBalance() {
    	System.out.println(balance);
    }
    
}
