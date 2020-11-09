package com.nit.hk.suncollections;

import java.util.Stack;

public class Test04_Stack {

	public static void main(String[] args) {

		Stack<String> st1 = new Stack<>();
		System.out.println(st1);
		
		st1.push("a");
		st1.push("b");
		st1.push("c");
		st1.push("d");
		st1.push("e");
		
		System.out.println(st1);

		System.out.println(st1.pop());
		System.out.println(st1);
		System.out.println();
		
		System.out.println(st1.pop());
		System.out.println(st1);
		System.out.println();
		
		System.out.println(st1.peek());
		System.out.println(st1);
		System.out.println();
		
		System.out.println(st1.peek());
		System.out.println(st1);
		System.out.println();
		
		System.out.println(st1.search("a"));
		
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		
		//System.out.println(st1.pop());//becoz already stack is emptied
		//System.out.println(st1.peek());//becoz already stack is emptied
		
		System.out.println(st1.empty());
	}

}
