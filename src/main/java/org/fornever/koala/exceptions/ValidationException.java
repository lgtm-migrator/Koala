package org.fornever.koala.exceptions;

import org.fornever.koala.entities.ValidationError;

public class ValidationException extends KoalaBaseException {

    private ValidationError errors;

    public ValidationError getErrors() {
        return errors;
    }

    public ValidationException setErrors(ValidationError errors) {
        this.errors = errors;
        return this;
    }

}