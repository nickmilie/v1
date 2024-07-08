package com.energysolution.recrutation.common.framework;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdviser {

    final static String INCORRECT_DATE = "Incorrect date format";
    final static String NOT_EMPTY = "Fields must not be empty";

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public Map<String, String> handleValidationExceptions(
            IllegalArgumentException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", ex.getMessage());
        return error;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DateTimeParseException.class)
    public Map<String, String> handleDateTimeParseExceptions(
            DateTimeParseException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", INCORRECT_DATE);
        return error;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleNotEmptyExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> error = new HashMap<>();
        error.put("error", NOT_EMPTY);
        return error;
    }


}
