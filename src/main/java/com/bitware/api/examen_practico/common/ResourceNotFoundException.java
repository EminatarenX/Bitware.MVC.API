package com.bitware.api.examen_practico.common;

public class ResourceNotFoundException extends ApiException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
