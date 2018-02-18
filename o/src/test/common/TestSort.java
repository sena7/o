package test.common;

import java.util.ArrayList;
import java.util.List;

import common.method.Sort;

public class TestSort {

	private Sort sort = new Sort();
	public void testSortStringSet(){
		//System.out.println(sort.sortStringSet("abc de fgh ijkl mnopq").size());
		System.out.println(sort.sortStringSet("abc de  fg1		ijkl	 55 mnopq").toString());
	}
 
	public void testSortStringCount(){
		String s1 = "abc bc def ae3";
		String s2 = "abc bc 236 ae3";
		String s3 = "abc bc anj ae3"; 
		String s4 = "abc bc 2 ae3"; 
		String s5 = "abc bc hsgsfd ae3"; 

		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(sort.sortStringCount(list));
	}

}
