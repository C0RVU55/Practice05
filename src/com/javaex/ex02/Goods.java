package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private int price;

	//생성자
	
	//파라미터가 있는 생성자를 만들면 기본생성자는 사라지기 때문에 camera변수에 적용하려면 따로 추가해줘야 됨.
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드 겟셋
	public String getName() {
		return name;
	}

	//메소드가 private면 못 쓰니까 제한없이 접근할 수 있도록 public으로 바꿈.
	public void setName(String name) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}








