/* package pgm*/

package Graphics;
import java.io.*;

interface sp
	{
	final int score=10;
	public void show();
	}
public class student1 implements sp
	{
	int rollno;
	String name;
	public void get()
		{
		rollno=20;
		name="asha";
		}
	public void show()
		{
		System.out.println("rollno , name, score: "+ rollno + " "+ name+" " +score);
		}
	}