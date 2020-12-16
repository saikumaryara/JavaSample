package com.hk.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

import com.hk.beans.BankAccount;

public class Test_Reading_Object_DeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/accountinfo.ser"));

		// reading object data from file
		HashSet<BankAccount> accs= (HashSet<BankAccount>) ois.readObject();
		System.out.println(accs);
	}

}
