
/*generic stack*/

import java.io.*;
import java.util.*;

class stack<T>
	{
	ArrayList<T> A;
	int top=-1,size=0;
	stack(int size)
		{
		this.size=size;
		this.A = new ArrayList<T>(size);
		}
	void push(T x)
		{
		if(top+1==size)
			System.out.println("Stack is full:");
		else
			top = top+1;
			A.add(x);
		}
	T top()
		{
		if(top == -1)
			{
			System.out.println("Stack is underflow:");
			return null;
			}
		else
			return A.get(top);
		}
	void pop()
		{
		if(top == -1)
			System.out.println("Stack is underflow:");
		else
			top--;
		}
	
	public String toString()
		{
		String str="";
		for(int i=0;i<top;i++)
			str+= String.valueOf(A.get(i)) + " ";
		str+= String.valueOf(A.get(top));
		return str;
		}
	}
class genstack
	{
	public static void main(String []args)
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		stack<Integer> si= new stack<Integer>(3);
		si.push(10);
		si.push(20);
		si.push(30);
		
		System.out.println("Integer Stack elements:"+si);
		si.pop();
		System.out.println("Integer Stack elements after  1pop:"+si);
		si.pop();
		System.out.println("Integer Stack elements after 2pop:"+si);
		
		stack<String> ss= new stack<String>(3);
		ss.push("java");
		ss.push("python");
		ss.push("cpp");
		System.out.println("String Stack elements:"+ss);

		stack<Float> sf= new stack<Float>(3);
		sf.push(10.5f);
		sf.push(20.5f);
		sf.push(30.5f);
		System.out.println("Float Stack elements:"+sf);
		}
	}
	