import java.util.Scanner;
class LoginValidator1{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter UserName:");
  String user=sc.next();
  System.out.print("Enter PassWord:");
  String pwd=sc.next();
  System.out.println("\nYour UserName and PassWord is::"+user+ " "+pwd);
  }
}