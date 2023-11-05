package com.uth.ums.enrollment.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings(value = { "CWE-580" })
public class GlobalException extends RuntimeException {
    private final String code;
    private final String message;

    public GlobalException(String message, String code) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
