package com.energysolution.recrutation.common.create;

import com.energysolution.recrutation.common.framework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * Abstract controller for domains
 * @param <ID>
 * @param <E>
 * @param <S>
 * @param <REQ>
 * @param <RES>
 * @param <M>
 * @param <V>
 */
public class AbstractController<ID extends Identifier,
        E extends IdentifiableAggregateRoot<ID>,
        S extends CommonService<E>,
        REQ extends Request,
        RES extends Response,
        M extends Mapper<REQ, RES, E>,
        V extends Validator<REQ>
>
        implements CommonController<REQ, RES> {

    private final S service;

    private final M mapper;

    private final V validator;

    @Autowired
    public AbstractController(S service, M mapper, V validator) {
        this.service = service;
        this.mapper = mapper;
        this.validator = validator;
    }

    /**
     * Endpoint for saving entities
     * @param request
     * @return ResponseEntity depended on the result
     */
    @Override
    public ResponseEntity<RES> save(@Validated @RequestBody REQ request) {

        validator.validate(request);

        E entity = (E) mapper.mapEntity(request);
        Optional<E> optionalRES = service.save(entity);
        if(optionalRES.isPresent()){
            RES response = (RES) mapper.mapResponse(optionalRES.get());
            return ResponseEntity.ok(response);
        }
        else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
