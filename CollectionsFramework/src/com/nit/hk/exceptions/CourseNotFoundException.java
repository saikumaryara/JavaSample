package com.nit.hk.exceptions;

public class CourseNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException() {
		super();

	}

	public CourseNotFoundException(String errMsg) {
		super(errMsg);

	}
}
