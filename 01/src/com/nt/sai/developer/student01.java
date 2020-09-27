package com.nt.sai.developer;

public class student01 {
	private int sno;
	private String course;

	/*
	 * public student01(int sno,String course){ this.sno=sno; this.course=course; }
	 */
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "student01 [sno=" + sno + ", " + (course != null ? "course=" + course : "") + "]";
	}

	@Override
	public int hashCode() {
		return course.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof student01) {
			student01 other = (student01) obj;
			return this.course.equals(other.course) && this.sno == (other.sno);
		}
		return false;
	}
}
