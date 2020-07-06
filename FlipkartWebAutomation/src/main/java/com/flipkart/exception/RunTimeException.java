package com.flipkart.exception;

public class RunTimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RunTimeException() {
		super("This is a run time Exception");
	}

	RunTimeException(String message) {
		super(message);
	}
}
