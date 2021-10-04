/* package pgm*/

package Graphics;

import java.io.*;
public class rectangle1
	{
	int l,b;
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	public void getdata()
		{
		try
			{	
			System.out.println("enter length & breadth:");
			l=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			}
		catch(IOException e)
			{System.out.println(e);}
		}
	public void area()
		{
		System.out.println("Area of rectangle:"+(l*b));
		}
	}

