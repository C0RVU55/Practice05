package com.javaex.ex10;

public class Book {
    
	//필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	//생성자
	
	/*이 생성자에 stateCode=1 이라고 정해놔도 정작 쓰는 생성자는 아래 생성자밖에 없어서 적용이 안 됨.
	  그래서 쓰는 생성자 안에 stateCode의 값을 정해줘야 함. 
	  
	public Book(int stateCode) {
		this.stateCode=1;
	}
	*/
	
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1; //무조건 파라미터 안에 있는 변수만 넣어야 되는 줄 알았는데 파라미터는 받는 값이니까 (받는 값이 아닌)stateCode의 초기값 정해놓는 게 가능함.
	}
	
	//메소드 겟셋 : 이거 없어도 되는데 왜 넣으라고 한 건지.
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
	
	public void print() {
		String stock;
		if(stateCode==1) {
			stock="재고 있음";
		}else {
			stock="대여중";
		}
		System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무:"+stock);
	}
	/*굳이 stock 변수 선언한 건 메인 안에 위 출력문을 넣으려고 print 메소드 선언하다가 생긴 잔재임.
	 * 다른 사람들 거 보니까 그냥 깔끔하게 출력문만 넣음.
	 * if(stateCode==1){System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무: 재고있음");
	 * else {System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무: 대여중");}
	 */
    
    
    
}
