package com.uth.ums.career.exception;

public class GlobalErrorCode {
    public static final String ERROR_ENTITY_NOT_FOUND = "ENROLLMENT-SERVICE-1000";

    private GlobalErrorCode() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
