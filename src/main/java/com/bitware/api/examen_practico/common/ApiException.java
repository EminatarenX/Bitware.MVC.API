package com.bitware.api.examen_practico.common;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
