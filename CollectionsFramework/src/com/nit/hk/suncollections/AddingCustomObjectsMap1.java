package com.nit.hk.suncollections;


import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;


/**
 * Emp2 class
 * 
 * @author SilentSKY
 * @Version 15 I want to sort objects based on properties using comparable u can
 *          developed default sorting order logic along with the object i.e we
 *          can sort only single element suc as sno,id,name ...etc
 */

/*
 * As per my understanding I think:
 * 
 * It is perfectly legal for two objects to have the same hashcode. If two
 * objects are equal (using the equals() method) then they have the same
 * hashcode. If two objects are not equal then they cannot have the same
 * hashcode
 * 
 * A hashmap works like this (this is a little bit simplified, but it
 * illustrates the basic mechanism):
 * 
 * It has a number of "buckets" which it uses to store key-value pairs in. Each
 * bucket has a unique number - that's what identifies the bucket. When you put
 * a key-value pair into the map, the hashmap will look at the hash code of the
 * key, and store the pair in the bucket of which the identifier is the hash
 * code of the key. For example: The hash code of the key is 235 -> the pair is
 * stored in bucket number 235. (Note that one bucket can store more then one
 * key-value pair).
 * 
 * When you lookup a value in the hashmap, by giving it a key, it will first
 * look at the hash code of the key that you gave. The hashmap will then look
 * into the corresponding bucket, and then it will compare the key that you gave
 * with the keys of all pairs in the bucket, by comparing them with equals().
 * 
 * Now you can see how this is very efficient for looking up key-value pairs in
 * a map: by the hash code of the key the hashmap immediately knows in which
 * bucket to look, so that it only has to test against what's in that bucket.
 * 
 * Looking at the above mechanism, you can also see what requirements are
 * necessary on the hashCode() and equals() methods of keys:
 * 
 * If two keys are the same (equals() returns true when you compare them), their
 * hashCode() method must return the same number. If keys violate this, then
 * keys that are equal might be stored in different buckets, and the hashmap
 * would not be able to find key-value pairs (because it's going to look in the
 * same bucket).
 * 
 * If two keys are different, then it doesn't matter if their hash codes are the
 * same or not. They will be stored in the same bucket if their hash codes are
 * the same, and in this case, the hashmap will use equals() to tell them apart.
 * 
 * share improve this answer follow edited Sep 5 '13 at 0:16
 * 
 * Nik 20133 silver badges1616 bronze badges answered Jun 27 '11 at 13:53
 * 
 * Jesper 181k4141 gold badges291291 silver badges325325 bronze badges 4 you
 * wrote
 * "and the hashmap would not be able to find key-value pairs (because it's going to look in the same bucket)."
 * Can you explain it is going to look in the same bucket say those two equals
 * objects are t1 and t2 and they are equal and t1 and t2 have hashcodes h1 and
 * h2 respectively .So t1.equals(t2)=true and h1!=h2 So when the hashmap would
 * look for t1 , it will look in the bucket h1 and for t2 in the bucket t2 ? –
 * Geek Jul 19 '12 at 16:14 20 If two keys are equal but their hashCode() method
 * returns different hash codes, then the equals() and hashCode() methods of the
 * key class violate the contract and you'll get strange results when using
 * those keys in a HashMap. – Jesper Oct 10 '12 at 15:21 Each bucket can have
 * multiple Key Values pairs, which are uses linked list internally. But my
 * confusion is - what is bucket here? What data structure it uses internally?
 * Is there any connection between buckets? – Ankit Sharma Jul 2 '14 at 6:57 1
 * 
 * @AnkitSharma If you want to really know all the details, lookup the source
 * code of HashMap, which you can find in the file src.zip in your JDK
 * installation directory. – Jesper Jul 2 '14 at 7:04 2
 * 
 * @1290 The only relation between the keys in the same bucket is that they have
 * the same hash code. –
 */
class Emp2 {

	 int sno;
	 String name;

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp2 other = (Emp2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sno != other.sno)
			return false;

		// return (name.equals(other.name) && this.sno == other.sno);
		return this.sno == other.sno;

	}

	@Override
	public String toString() {
		return "[sno=" + sno + ", " + (name != null ? "name=" + name : "") + "]";
	}

	public Emp2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public Emp2() {

	}

}

public class AddingCustomObjectsMap1 {

	public static void main(String[] args) {

		Emp2 e1 = new Emp2(1, "S");
		System.out.println(e1.hashCode());
		Emp2 e2 = new Emp2(2, "A");
		System.out.println(e2.hashCode());

		Emp2 e3 = new Emp2();
		System.out.println(e3.hashCode());
		Emp2 e4 = new Emp2(2, "A");
		System.out.println(e4.hashCode());
		Emp2 e5 = new Emp2(3, "c");
		System.out.println(e5.hashCode());
		/*
		 * Here e4 is diff obj reference compare to e2 But data wise sno is eqauls so i
		 * want to stope state wise so we ust override equlas and hs() If In equals()
		 * method based sno both elements same then hascode() return same hashcode for
		 * both e2,e4 so hashset replace the e2 to e4 value change to B bacuase hashSet
		 * sote based on hascode reference
		 */

		HashSet<Emp2> hs1 = new HashSet<Emp2>();
		hs1.add(e1);
		hs1.add(e2);
		/*
		 * Here e2,e4 objects are diff reference, but state wise is same based no sno ,So
		 * if state wise(i.e sno) equlas compare by equals() then same hashcode will
		 * generate for e2,e4 based on sno
		 */
		hs1.add(e3);
		hs1.add(e4);
		hs1.add(e5);
		System.out.println(hs1);

		HashMap<Emp2, String> hm1 = new HashMap<Emp2, String>();
		hm1.put(e1, "A");
		hm1.put(e2, "B");
		/*
		 * Here e2,e4 keys objects are diff reference, but state wise is same based on 
		 * sno, So
		 * if state wise(i.e sno) equlas compare by equals() then same hashcode will
		 * generate for e2,e4 based on sno
		 */
		hm1.put(e3, "");
		hm1.put(e4, "C");
		hm1.put(e5, "D");
		System.out.println(hm1);
		TreeMap<Integer,Emp2> tm3=new TreeMap<Integer, Emp2>((s1,s2)->s1.compareTo(s2));
		tm3.put(2,e1);
		tm3.put(1,e2);
		tm3.put(2,e3);
		tm3.put(4,e4);
		tm3.put(5,e5);
		System.out.println(tm3);
	}

}

