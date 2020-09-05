import java.util.Scanner;

public class Student01 {
	int sno;
	String sname;
	String course;
	double fee;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student01 [sno=" + sno + ", " + (sname != null ? "sname=" + sname + ", " : "")
				+ (course != null ? "course=" + course + ", " : "") + "fee=" + fee + "]";
	}
}

class Test01 {
	public static void main(String[] args) {
		Student01 s1 = new Student01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SNO:");
		s1.setSno(sc.nextInt());
		sc.nextLine();// because (when you enter SNO 101 it takes 101<-' enter key also)<-'(ie ""is
						// stored in sname
		System.out.println("Enter SNAME:");
		s1.setSname(sc.nextLine());
		System.out.println("Enter Course:");
		s1.setCourse(sc.nextLine());
		System.out.println("Enter FEE:");
		s1.setFee(sc.nextDouble());
		System.out.println(s1);
		
		Student01 s2 = new Student01();
		System.out.println("Enter SNO:");
		s2.setSno(sc.nextInt());
		sc.nextLine();// because (when you enter SNO 101 it takes 101<-' enter key also)<-'(ie ""is
						// stored in sname
		System.out.println("Enter SNAME:");
		s2.setSname(sc.nextLine());
		System.out.println("Enter Course:");
		s2.setCourse(sc.nextLine());
		System.out.println("Enter FEE:");
		s2.setFee(sc.nextDouble());
		System.out.println(s2);
		sc.close();
	}
}