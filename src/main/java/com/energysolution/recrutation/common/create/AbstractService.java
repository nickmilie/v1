package com.energysolution.recrutation.common.create;

import com.energysolution.recrutation.common.framework.CommonRepository;
import com.energysolution.recrutation.common.framework.CommonService;
import com.energysolution.recrutation.common.framework.IdentifiableAggregateRoot;
import com.energysolution.recrutation.common.framework.Identifier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * Abstract Service for domains
 * @param <ID>
 * @param <E>
 * @param <R>
 */
public abstract class AbstractService<ID extends Identifier, E extends IdentifiableAggregateRoot<ID>, R extends CommonRepository<E, ID>>
        implements CommonService<E> {

    private final R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

    /**
     * Saves data to a database with a repository
     * @param entity
     * @return
     */
    @Override
    public Optional<E> save(E entity) {
        return Optional.of(repository.save(entity));
    }
}
