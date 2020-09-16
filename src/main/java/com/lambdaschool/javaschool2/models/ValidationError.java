package com.lambdaschool.javaschool2.models;

public class ValidationError {
    private String Code;
    private String message;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public java.lang.String toString() {
        return "ValidationError{" +
                "Code='" + Code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

