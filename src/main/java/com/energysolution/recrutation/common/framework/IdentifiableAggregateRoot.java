package com.energysolution.recrutation.common.framework;

public interface IdentifiableAggregateRoot<ID extends Identifier> {
    ID getId();

    void setId(ID id);
}