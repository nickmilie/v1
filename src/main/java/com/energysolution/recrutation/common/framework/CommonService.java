package com.energysolution.recrutation.common.framework;

import java.util.Optional;

public interface CommonService<E extends IdentifiableAggregateRoot> {

    Optional<E> save(E entity);
}
