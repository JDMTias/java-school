package com.lambdaschool.javaschool2.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super("Found an issue with school " + message);
    }
}
