package com.airports.exceptions;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 */
public class HeliportNotFoundException extends RuntimeException {

    public HeliportNotFoundException(String msg) {
        super(msg);
    }
}
