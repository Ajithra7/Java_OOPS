/*Program on inner class and static nested class*/
import java.io.*;
class CPU
	{
		int price = 75000;

		class processor
			{
			int noofcores = 4;
			String manuf = "Intel";
			}
		static class RAM
			{
			String mem ="6GB";
			String manuf ="IBM";
			}
		public static void main(String []args) throws IOException
			{
			CPU c = new CPU();
			CPU.processor p = c.new processor();
			CPU.RAM r = new CPU.RAM();
		
			System.out.println("Price : "+c.price);
			System.out.println("Number of Cores & Manufacturer: "+p.noofcores+" "+p.manuf);
			System.out.println("Memory & Manufacturer: "+r.mem+" "+r.manuf);
			}
	}

				