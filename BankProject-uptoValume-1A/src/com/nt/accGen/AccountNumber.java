package com.nt.accGen;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.nt.acc.Account;
public class AccountNumber {
 private long accNumSeq;
 public AccountNumber(){
	 accNumSeq = 94321;
 }
 public void applyForAccount(Account[] accounts){
 System.out.println("accounts initial details ::");
 for(int i= 0; i < accounts.length; i++){
 if(accounts[i] != null)
 System.out.println(accounts[i]);
 else
 break;
 }
 for(int i= 0; i < accounts.length; i++){
 if(accounts[i] != null)
	 accounts[i].setAccNum(accNumSeq++);
 else
 break;
 }
 System.out.println("account details after  accNum number generation");
 for(int i= 0; i < accounts.length; i++){
 if(accounts[i] != null)
 System.out.println(accounts[i]);
 else
 break;
 }
 try(
 ObjectOutputStream oos = 
 new ObjectOutputStream(new FileOutputStream("accounts.txt"));
 ){
 oos.writeObject(accounts);
 System.out.println("All accounts applications are accepted");
 } catch (FileNotFoundException e) {
 System.out.println("accounts.ser is not found or access is denied");
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 public Account[] getAccNum(){
	 Account[] accounts = null;
 try(
 ObjectInputStream ois = 
 new ObjectInputStream(new FileInputStream("accounts.txt"));
 ){
 accounts = (Account[])ois.readObject(); 
 System.out.println("Accounts data read from File");
 }catch (FileNotFoundException e) {
 System.out.println("accounts.ser is not found or access is denied");
 } catch (IOException | ClassNotFoundException e){
 e.printStackTrace(); 
 }
 return accounts;
 }

}
