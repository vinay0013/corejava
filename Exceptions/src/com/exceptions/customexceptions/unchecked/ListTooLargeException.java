package com.exceptions.customexceptions.unchecked;

public class ListTooLargeException extends RuntimeException{

    public ListTooLargeException(String message) {
        super(message);
    }

}
