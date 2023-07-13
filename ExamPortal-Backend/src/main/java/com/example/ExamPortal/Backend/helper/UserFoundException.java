package com.example.ExamPortal.Backend.helper;

public class UserFoundException  extends  Exception{

    private static final long serialVersionUID = 1L;

	public UserFoundException() {
        super("User with this Username is already there in DB !! try with another one");
    }

    public UserFoundException(String msg)
    {
        super(msg);
    }
}
