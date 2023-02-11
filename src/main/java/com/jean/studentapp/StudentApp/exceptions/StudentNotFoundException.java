package com.jean.studentapp.StudentApp.exceptions;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String msg){
        super(msg);
    }

    public StudentNotFoundException(String msg, Throwable t) {
        super(msg,t);
    }
}
