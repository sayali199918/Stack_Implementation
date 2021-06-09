package com.cdac.Stack_Implementation;

public class Stack {
	  int stack[]=new int [20];
	  int top=0;
	  
	  public Stack(int n) {
		stack=new int[n];
	}

	//Push Operation
	  public void push(int data)
	  {
		  if(top==20)
		  {
			  System.out.println("Stack is Full");
		  }
		  else {
			  stack[top]=data;
			  top++;
		  }
		 
	  }
	  
	  //Pop Operation
	  public int pop()
	  {
		  int data=0;
		  if(isEmpty())
		  {
			  System.out.println("Stack is Empty");
		  }
		  else
		  {
		  top--;
		  data=stack[top];
		  stack[top]=0;
		  }
		  return data;
	  }
	  
	  //Peek Operation
	  public int peek()
	  {
		  int data;
		  data=stack[top-1];
		  return data;
	  }
	  
	  //Check Size
	  public int size()
	  {
		  return top;
	  }
	  
	  //Empty or not
	  public boolean isEmpty()
	  {
		  return top<=0;
	  }
	  
	  // Display 
	  public void show()
	  {
		  for(int n : stack )
		  {
			  System.out.print(n +" ");
		  }
		  System.out.println();
	  }
	

}
