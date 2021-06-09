package com.cdac.Stack_Implementation;

public class Runner 
{
	public static void reverse(StringBuffer str) 
	{
		int n=str.length();
		Stack s1=new Stack(n);
		int i;
		for(i=0;i<n;i++)
		{
			s1.push(str.charAt(i));
			
		}
		
		for(i=0;i<n;i++)
		{
			char ch=(char)s1.pop();
			str.setCharAt(i,ch);
		}
	}
		
		public static void main(String[] args) 
		{
			StringBuffer s=new StringBuffer("Sayali Badgujar");
			reverse(s);
			System.out.println("Reverse String = "+s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Dstack num=new Dstack();
		//System.out.println("Empty = " + num.isEmpty());
		num.push(10);
		num.show();
		num.push(20);
		num.show();
		num.push(30);
		num.show();
		num.push(40);
		num.show();
		num.push(50);
		num.show();
		num.pop();
		num.show();
		num.pop();
		num.show();
		num.pop();
		num.show();
		
		//System.out.println(num.pop());
		
		//System.out.println(num.pop());
		//System.out.println(num.peek());
		//System.out.println(num.pop());
		//System.out.println(num.pop());
		//System.out.println(num.pop());
		
		//System.out.println("Size is "+ num.size());
		
		//System.out.println(num.pop());
		
		/*System.out.println("Size is "+ num.size());
		System.out.println(num.pop());
		
		System.out.println("Size is " + num.size());
		
		System.out.println(num.peek());
		System.out.println("Empty = " + num.isEmpty());*/
		
		//num.show();*/
		
		
		
		
	}

}
