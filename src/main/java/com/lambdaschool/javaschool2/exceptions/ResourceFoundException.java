package com.lambdaschool.javaschool2.exceptions;

public class ResourceFoundException extends RuntimeException {

    public ResourceFoundException(String message){
        super("Found an Issue With School" + message );
    }

}
