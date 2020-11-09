package com.nit.hk.exceptions;

public class StudentNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(String errMsg) {
		super(errMsg);
	}
}
