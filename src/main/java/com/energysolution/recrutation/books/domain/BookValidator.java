package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Validator;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Custom validator for books domain
 */
@Component
public class BookValidator implements Validator<BookRequest> {

    String regex = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";

    Pattern pattern = Pattern.compile(regex);


    /**
     * Validate request fields
     * ISBN validation
     * @param request from BookController
     */
    @Override
    public void validate(BookRequest request) {
        Matcher matcher = pattern.matcher(request.getISBN());
        if(!matcher.matches()){
            throw new IllegalArgumentException("Incorrect ISBN format");
        }
    }
}
