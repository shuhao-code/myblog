package com.star;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author shuhao
 * @date 2020/6/17 22:52
 */
@ResponseStatus
public class NotFoundException extends RuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
