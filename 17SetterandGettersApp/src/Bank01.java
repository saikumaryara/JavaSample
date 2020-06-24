import java.util.Scanner;
public class Bank01 {
  private long accNum;
  private String accHName;
  private boolean status;
  public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public String getAccHName() {
	return accHName;
}
public void setAccHName(String accHName) {
	this.accHName = accHName;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
  @Override
  public String toString() {
	return "Bank01 [accNum=" + accNum + ", " + (accHName != null ? "accHName=" + accHName + ", " : "") + "status="
			+ status + "]"; 
  }
}
class TestBank01{
	  public static void main(String[] args) {
		  Bank01 b1=new Bank01();
		  Scanner sc=new Scanner(System.in);
			System.out.println("Enter AccNumber:");
			b1.setAccNum(sc.nextLong());
			sc.nextLine();
			System.out.println("Enter AccHNAME:");
			b1.setAccHName(sc.nextLine());
			System.out.println("Enter AccisActive or Not:");
			b1.setStatus(sc.nextBoolean());
			System.out.println(b1);		
			sc.close();
	  }
	}