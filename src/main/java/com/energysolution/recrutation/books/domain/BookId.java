package com.energysolution.recrutation.books.domain;

import com.energysolution.recrutation.common.framework.Identifier;
import java.util.UUID;
import lombok.Value;

/**
 * Books Identifier
 */
@Value
public class BookId implements Identifier {
  UUID id = UUID.randomUUID();
}