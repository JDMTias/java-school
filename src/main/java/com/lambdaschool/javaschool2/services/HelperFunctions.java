package com.lambdaschool.javaschool2.services;

import com.lambdaschool.javaschool2.models.ValidationError;

import java.util.List;

public interface HelperFunctions {

    List<ValidationError> getConstraintViolation(Throwable cause);
}

