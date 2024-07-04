package com.energysolution.recrutation.common.framework;

public interface Mapper<REQ extends Request, RES extends Response, E extends IdentifiableAggregateRoot>{

    E mapEntity(REQ request);

    RES mapResponse(E entity);


}
