import java.util.Scanner;
import operations.arithop;
public class Test1{
public static void main(String[] args) {
Scanner obk=new Scanner(System.in);
arithop obj=new arithop();
int ch=0;
//l=obj1.nextInt();
while(ch<5) {
System.out.println("SELECT OPERATION:"+"\n1.addition\n2.multiplication\n3.subtraction\n4.division \n5.Exit");
ch=obk.nextInt();
switch(ch) {
case 1: 
obj.addition();
 break;
 case 2: 
 obj.multiplication(); 
 break;
 case 3: 
 obj.subtraction();
 break;
 case 4: 
 obj.division();
 break;
 case 5: break;
 default:
 System.out.println("Invalid");
 break; 
}}}}