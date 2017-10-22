package com.test.ArrayListMap;

public class Person {


	private String pname;
	private String page;
//toString
	@Override
	public String toString() {
		return "Person{" +
				"pname='" + pname + '\'' +
				", page='" + page + '\'' +
				'}';
	}
//构造器
	public Person(String pname, String page) {
		this.pname = pname;
		this.page = page;
	}


}
