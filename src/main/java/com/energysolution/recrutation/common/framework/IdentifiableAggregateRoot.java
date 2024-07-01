package com.energysolution.recrutation.common.framework;

public interface IdentifiableAggregateRoot<ID extends Identifier> {
    ID getId();
}