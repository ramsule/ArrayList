package com.arraylist.example;

import java.util.LinkedList;

public class ArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//Direct way 
		System.out.println(list);
	}

}
