package com.example.ExamPortal.Backend.helper;

public class UserNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
        super("User with this username not found in database !!");
    }

    public UserNotFoundException(String msg) {
        super(msg);
    }
}
