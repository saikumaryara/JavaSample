import java.io.Console;
class LoginValidator2{
  public static void main(String[] args){
  Console cn=System.console();
  System.out.print("Enter UserName:");
  String user=cn.readLine();
  System.out.print("Enter PassWord:");
  char[] pwd=cn.readPassword();
  System.out.println("\nYour UserName and PassWord is::"+user+ " "+new String(pwd));
  }
}