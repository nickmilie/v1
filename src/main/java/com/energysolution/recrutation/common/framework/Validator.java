package com.energysolution.recrutation.common.framework;

public interface Validator<T> {
    void validate(T request);
}