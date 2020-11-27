package com.javaex.ex10;

public class Book {
    
	//필드
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	//생성자
	public Book(int stateCode) {
		this.stateCode=1;
	}
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
	}
	
	//메소드 겟셋
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
	//메소드 일반
	public void rent(int bookNo) {
		stateCode=0;
		System.out.println(title+"이(가) 대여됐습니다.");
	}
	
	public void print(int stateCode) {
		if(stateCode==1) {
			String stock="재고 있음";
		}else {
			String stock="대여중";
		}
	}
    
    
    
}
