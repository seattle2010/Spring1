package com.test.ArrayListMap;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Array数组 和 List是一样的方式
public class UserArray {
	@Setter
	private String[] arrs;
//list集合时候
	@Getter
	@Setter
	private List list;

	//map集合时候
	@Getter@Setter
	private Map map;


	//toString方法
	public String toString() {
		return "UserArray{" +
				"arrs=" + Arrays.toString(arrs) +
				", list=" + list +
				", map=" + map +
				'}';
	}
}

