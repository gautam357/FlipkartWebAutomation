package com.flipkart.exception;

public class CompileTimeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CompileTimeException() {
		super("This is an compile time Exception");
	}

	CompileTimeException(String messages) {
		super(messages);
	}
}
