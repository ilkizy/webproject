package com.ilkiz.webproject.exception;

import lombok.Getter;

@Getter
public class WebManagerException extends RuntimeException{

    private final ErrorType errorType;

    public WebManagerException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public WebManagerException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
