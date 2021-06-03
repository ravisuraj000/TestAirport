package com.airports.exceptions;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 */
public class AirportsNotFoundForContinentException extends RuntimeException {

    public AirportsNotFoundForContinentException(String msg) {
        super(msg);
    }
}
