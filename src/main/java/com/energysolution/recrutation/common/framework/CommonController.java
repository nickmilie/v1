package com.energysolution.recrutation.common.framework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommonController<REQ extends Request, RES extends Response> {

    @PostMapping
    ResponseEntity<RES> save(@RequestBody REQ request) throws MethodArgumentNotValidException, NoSuchMethodException;
}
