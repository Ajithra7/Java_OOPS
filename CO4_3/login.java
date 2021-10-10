import java.util.Scanner; 
public class login{ 
 public static void main(String[] args) 
 { 
 try 
{
 int n, n2; 
 String username,password; 
 Scanner sc = new Scanner(System.in); 
 System.out.println("LOGIN DETAILS");
 System.out.println("******************");
 System.out.println("ENTER USERNAME:");
 username=sc.nextLine();
 System.out.println("ENTER PASSWORD:"); 
 password= sc.nextLine(); 
 n=password.length();
 n2=username.length(); 
 
 if(n<6 || n2<6)
 {
 throw new ArithmeticException("\nCHECK USERNAME OR PASSWORD!\n");
 }
else
{
 System.out.println("\nLOGIN SUCCESSFUL!!!!!\n"); 
 }
 
 } 
 
 
 catch(Exception e) {
 System.out.println(e);
 }
 
 }
}