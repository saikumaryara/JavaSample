package com.nt.main;

import com.nt.blogic.Addition;
import com.nt.threads.Ad1;
import com.nt.threads.Ad2;

public class TestAd {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		Ad1 t1 = new Ad1(a);
		Ad2 t2 = new Ad2(a);
		t1.start();
		t2.start();
	}

}
